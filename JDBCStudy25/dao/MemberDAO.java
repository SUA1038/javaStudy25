package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import dto.BoardDTO;
import dto.MemberDTO;

public class MemberDAO {
	// DB 연결 담당

	public MemberDTO memberDTO = new MemberDTO();
	public Connection connection = null; // 1단계에서 사용하는 객체
	public Statement statement = null; // 3단계에서 사용하는 객체(구형), 변수 직접처리 '"+ name +"'
	public PreparedStatement preparedStatement = null; // 3단계에서 사용하는 객체(신형), ?(인파라미터)
	public ResultSet resultSet = null;; // 4단계에서 결과 받는 표 객체 executeQuery (select 결과)
	public int result = 0; // 4단계에서 결과 받는 정수 executeUpdate (insert, update, delete)
	// 1개의 행이 삽입 | 수정 | 삭제 되었습니다. (정상처리 -> commit)
	// 0개의 행이 삽입 | 수정 | 삭제 되었습니다. (비정상처리 -> rollback)

	// 기본 생성자
	public MemberDAO() {

		try {
			// 예외가 발생할 수 있는 실행문
			// 프로그램 강제종료 처리용
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 1단계 ojdbc6.jar 호출
			connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.167:1521:xe", "boardtest",
					"boardtest"); // 2단계
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 이름이나, ojdbc6.jar 파일이 잘못 되었습니다.");
			e.printStackTrace();
			System.exit(0); // 강제 종료
		} catch (SQLException e) {
			System.out.println("url, id, pw가 잘못 되었습니다. BoardDAO에 기본생성자를 확인하세요");
			e.printStackTrace();
			System.exit(0); // 강제 종료
		}

	} // 기본 생성자 종료

	public void create(MemberDTO memberDTO) throws SQLException {
		// 회원 가입 메서드

		try {
	        String checkSql = "select count(*) from member where id = ?"; // id 중복 확인
	        preparedStatement = connection.prepareStatement(checkSql);
	        preparedStatement.setString(1, memberDTO.getId());
	        resultSet = preparedStatement.executeQuery();
	        
	        if (resultSet.next() && resultSet.getInt(1) > 0) {
	            System.out.println("이미 사용 중인 ID입니다. 다른 ID를 사용해주세요.");
	            return;  // 중복 ID가 있으면 회원가입을 진행하지 않고 종료
	        }

			String sql = "insert into member(mno, bwriter, id, pw, regidate) values(board_seq.nextval, ?, ?, ?, sysdate)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, memberDTO.getBwriter());
			preparedStatement.setString(2, memberDTO.getId());
			preparedStatement.setString(3, memberDTO.getPw());
			System.out.println("쿼리 확인 : " + sql); // 쿼리 완성본 확인용 ***

			result = preparedStatement.executeUpdate(); // 쿼리문 실행해서 결과를 정수로 받음

			if (result > 0) {
				System.out.println("회원 가입에 성공했습니다.");
				connection.commit();
			} else {
				System.out.println("쿼리 실행 결과 : " + result);
				System.out.println("입력 실패");
				connection.rollback(); // 저장 취소
			} // if문 종료
		} catch (SQLException e) {
			System.out.println("예외 발생 : create() 메서드의 쿼리문을 확인하세요.");
			// id가 중복일 경우 중복이라 생성이 안된다는 문구 추가
			e.printStackTrace();
		} finally {
			preparedStatement.close();
		}

	} // 회원 가입 메서드 종료

	public void readAll() throws SQLException {
		// 전체 회원 목록 보기 메서드
		try {
			String sql = "select mno, bwriter, regidate from member order by regidate desc";
			// 데이터베이스의 member 테이블 내용을 가져오는 쿼리문

			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql); // 쿼리문을 실행하여 결과를 표로 받는다.

			System.out.println("번호\t 회원명\t 가입날짜\t");
			while (resultSet.next()) {
				// 결과 표에서 위부터 아래까지 내려오면서 작성
				System.out.print(resultSet.getInt("mno") + "\t");
				System.out.print(resultSet.getString("bwriter") + "\t");
				System.out.println(resultSet.getDate("regidate") + "\t");
			}
		} catch (SQLException e) {
			System.out.println("readAll()메서드에서 쿼리문이 잘못되었습니다.");
			e.printStackTrace();
		} finally {
			resultSet.close();
			statement.close();
		}

	} // 전체 회원 목록 보기 메서드 종료

	public void readOne(String readId) throws SQLException {
		// 계정 상세 보기 메서드 시작
		try {
			String sql = "select mno, bwriter, id, regidate from member where id = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, readId); 
			resultSet = preparedStatement.executeQuery(); // 쿼리문 실행 후 결과를 표로 받는다.

			if (resultSet.next()) { // 검색 결과가 있을 경우
				MemberDTO memberDTO = new MemberDTO(); // 빈 객체 생성

				memberDTO.setMno(resultSet.getInt("mno"));
				memberDTO.setBwriter(resultSet.getString("bwriter"));
				memberDTO.setId(resultSet.getString("id"));
				memberDTO.setRegidate(resultSet.getDate("regidate"));
				// 데이터 베이스에 있는 행을 객체에 넣기
				System.out.println("==========================");
				System.out.println("번호 : " + memberDTO.getMno());
				System.out.println("이름 : " + memberDTO.getBwriter());
				System.out.println("id : " + memberDTO.getId());
				System.out.println("가입일 : " + memberDTO.getRegidate());
			} else { // 검색 결과가 없을 경우
				System.out.println("해당하는 ID가 존재하지 않습니다.");
			} // if문 종료
		} catch (SQLException e) {
			System.out.println("예외 발생 : readOne() 메서드를 확인하세요.");
			e.printStackTrace();
		} finally {
			resultSet.close();
			preparedStatement.close();
		}
	} // 계정 상세 보기 메서드 종료

	public void update(String updateID, Scanner inputStr) throws SQLException {
		// 정보 업데이트 메서드
		MemberDTO memberDTO = new MemberDTO();
		System.out.println("수정할 이름을 작성하세요.");
		System.out.print(">>> ");
		memberDTO.setBwriter(inputStr.next());

		System.out.println("수정할 ID를 작성하세요.");
		System.out.print(">>> ");
		memberDTO.setId(inputStr.next());

		System.out.println("수정할 PW를 작성하세요.");
		System.out.print(">>> ");
		memberDTO.setPw(inputStr.next());


		try {
			String sql = "update member set bwriter = ?, id = ?, pw = ? , regidate = sysdate where id = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, memberDTO.getBwriter());
			preparedStatement.setString(2, memberDTO.getId());
			preparedStatement.setString(3, memberDTO.getPw());
			preparedStatement.setString(4, updateID);
			result = preparedStatement.executeUpdate();

			if (result > 0) {
				System.out.println(result + "개의 정보가 수정되었습니다.");
				connection.commit(); // 영구저장
			} else {
				System.out.println("수정되지 않았습니다.");
				connection.rollback();
			}
		} catch (SQLException e) {
			System.out.println("예외 발생 : update 메서드와 sql문을 확인하세요.");
			e.printStackTrace();
		}finally {
			preparedStatement.close();
		}	

	} // 정보 업데이트 메서드 종료

	
	
	public void delete(Scanner inputStr) throws SQLException {
		// 회원 탈퇴 메서드
		
		MemberDTO memberDTO = new MemberDTO();
		
		System.out.println("탈퇴할 계정의 ID를 입력하세요.");
		System.out.print(">>> ");
		String delID = inputStr.next();
		
		try {
			String sql = "update member set bwriter = ?, id = ?, pw = ? , regidate = sysdate where id = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, "탈퇴회원");
			preparedStatement.setString(2, "XXX"); // 중복X, null X이어야 함. -> random으로 id 부여?
			preparedStatement.setString(3, "0101"); // 공동 pw로
			preparedStatement.setString(4, delID);
			
			
			
			result = preparedStatement.executeUpdate();

			if (result > 0) {
				System.out.println("회원 탈퇴에 성공했습니다.");
				connection.commit(); // 영구저장
			} else {
				System.out.println("탈퇴 실패.");
				connection.rollback();
			}
		} catch (SQLException e) {
			System.out.println("예외 발생 : delete 메서드와 sql문을 확인하세요.");
			e.printStackTrace();
		}finally {
			
			preparedStatement.close();
		}
		
		
	} // 회원 탈퇴 메서드 종료

	
	
	
	// 로그인
	public MemberDTO login(String loginID, String loginPW) throws SQLException {
		MemberDTO session = null;
		try {
			String sql = "select * from member where id = ? and pw = ?"; 
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginID);
			preparedStatement.setString(2, loginPW);
			resultSet = preparedStatement.executeQuery(); // select문은 query로 받기
			
			if (resultSet.next()) {
				session = new MemberDTO();
				session.setMno(resultSet.getInt("mno"));
				session.setBwriter(resultSet.getString("bwriter"));
				session.setId(resultSet.getString("id"));
				session.setPw(resultSet.getString("pw"));
				session.setRegidate(resultSet.getDate("regidate"));
				System.out.println("로그인 성공.");
				connection.commit(); // 영구저장
				return session;
				
			} else {
				System.out.println("로그인 실패. ID 혹은 PW를 다시 확인해주세요.");
				connection.rollback();
			}
			
		} catch (SQLException e) {
			System.out.println("오류 발생 : login 메서드 혹은 sql문을 확인해주세요.");
			e.printStackTrace();
		}finally {
			preparedStatement.close();
			resultSet.close();
		}
		return session;
		
	}
	
	
	
	
	
} // 클래스 종료

package JDBCTest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

import JDBCTest.dto.MemberDTO;

public class MemberDAO {
	
	// 객체
	public MemberDTO memberDTO = new MemberDTO();
	public Connection connection = null;
	public Statement statement = null;
	public PreparedStatement preparedStatement = null;
	public ResultSet resultSet = null;
	public int result = 0;
	
	// 기본 생성자
	public MemberDAO() {
		
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.167:1521:xe", "membertest", "membertest");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 이름이나 ojdbc6.jar 파일에 오류가 발생했습니다.");
			e.printStackTrace();
			System.exit(0); // 강제종료
		}catch (SQLException e) {
			System.out.println("URL, ID 혹은 PW에 오류가 발생했습니다. MemberDAO의 기본 생성자를 확인하세요.");
			e.printStackTrace();
			System.exit(0); // 강제종료
		}
		
	} // 기본 생성자 종료
	
	
	
	// 메서드
	public MemberDTO login(String inputID, String inputPW) throws SQLException {
		// 로그인
		MemberDTO session = null;
		
		try {
			String sql = "select * from membertable where id = ? and pw = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, inputID);
			preparedStatement.setString(2, inputPW);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				session = new MemberDTO();
				session.setMno(resultSet.getInt("mno"));
				session.setBwriter(resultSet.getString("bwriter"));
				session.setId(resultSet.getString("id"));
				session.setPw(resultSet.getString("pw"));
				session.setRegidate(resultSet.getDate("regidate"));
				System.out.println("로그인 성공. 어서오세요.");
				connection.commit();
				return session;
			}else {
				System.out.println("로그인 실패. ID 혹은 PW 오류.");
				connection.rollback();
			} // if문 종료
			
		} catch (SQLException e) {
			System.out.println("오류 발생 : login 메서드 혹은 sql 문을 확인하세요.");
			e.printStackTrace();
		} finally {
			preparedStatement.close();
			resultSet.close();
		} // try 종료
		return session;
	} // 로그인 메서드 종료



	public void insert(MemberDTO memberDTO) throws SQLException {
		// 회원가입 메서드 시작

		try {	
			String sql = "insert into membertable(mno, bwriter, id, pw, regidate) "
					+ "values(board_seq.nextval, ?, ?, ?, sysdate)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, memberDTO.getBwriter());
			preparedStatement.setString(2, memberDTO.getId());
			preparedStatement.setString(3, memberDTO.getPw());
			// System.out.println("쿼리 확인 : " + sql); // 쿼리 확인용. 완성 시 삭제***
			
			result = preparedStatement.executeUpdate();
			
			if(result > 0) {
				System.out.println("회원 가입에 성공했습니다.");
				connection.commit();
			}else {
				// System.out.println("쿼리 실행 결과 : " + result); // 완성 시 삭제 ***
				System.out.println("회원 가입에 실패했습니다.");
				connection.rollback();
			} // if문 종료
		} catch (SQLException e) {
			System.out.println("예외 발생 : insert() 메서드의 쿼리문을 확인하세요.");
			e.printStackTrace();
		}finally {
			preparedStatement.close();
		} // try 종료
		
	} // 회원가입 메서드 종료




	public void update(Scanner inputStr, String updateID) throws SQLException {
		// 회원 정보 업데이트
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
			String sql = "update membertable set bwriter = ?, id = ?, pw = ? , regidate = sysdate where id = ?";
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
			System.out.println("예외 발생 : update() 메서드의 sql문을 확인하세요.");
			e.printStackTrace();
		}finally {
			preparedStatement.close();
		}	

		
	} // 회원 정보 업데이트 메서드 종료



	public void readAll() throws SQLException {
		// 전체 회원 조회 메서드
		
		try {
			String sql = "select mno, bwriter, regidate from membertable order by regidate desc";
			
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			
			System.out.println("번호\t 회원명\t 가입날\t");
			while(resultSet.next()) {
				System.out.print(resultSet.getInt("mno") + "\t");
				System.out.print(resultSet.getString("bwriter") + "\t");
				System.out.println(resultSet.getDate("regidate") + "\t");
			}
		} catch (SQLException e) {
			System.out.println("예외 발생 : readAll()메서드의 쿼리문을 확인하세요.");
			e.printStackTrace();
		}finally {
			resultSet.close();
			statement.close();
		}
		
	} // 전체 회원 조회 메서드 종료



	public void delete(Scanner inputStr) throws SQLException {
		// 회원 탈퇴 메서드
		MemberDTO memberDTO = new MemberDTO();
		System.out.println("탈퇴를 진행할 ID를 입력하세요.");
		System.out.print(">>> ");
		String delID = inputStr.next();
		
		try {
			String sql = "update membertable set bwriter = ?, pw = ? , regidate = sysdate where id = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, "탈퇴회원");
			preparedStatement.setString(2, "0000"); // 공동 pw로
			preparedStatement.setString(3, delID);
			
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



	public void readOne(String readID) throws SQLException {
		// 상세 정보 보기 메서드
		
		try {
			String sql = "select mno, bwriter, id, regidate from membertable where id = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, readID); 
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
				System.out.println("==========================");
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
		
		
	} // 상세 정보 보기 메서드 종료

	
	
	
} // 클래스 종료

package JDBCTest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import JDBCTest.dto.MemberBoardDTO;
import JDBCTest.dto.MemberDTO;

public class MemberBoardDAO {

	// 객체
	public MemberDTO memberDTO = new MemberDTO();
	public Connection connection = null;
	public Statement statement = null;
	public PreparedStatement preparedStatement = null;
	public ResultSet resultSet = null;
	public int result = 0;
	
	// 기본 생성자
	public MemberBoardDAO() {
		
		
		
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

	public MemberDTO insertBoard(MemberBoardDTO memberBoardDTO, MemberDTO session) throws SQLException {
		// 게시글 작성 메서드
		
		try {
			String sql = "insert into memberboard(bno, btitle, bcontent, bwriter, bdate) values(board_seq.nextval, ?, ?, ?, sysdate)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, memberBoardDTO.getBtitle());
			preparedStatement.setString(2, memberBoardDTO.getBcontent());
			preparedStatement.setString(3, session.getId());
			// System.out.println("쿼리 확인 : " + sql); // 쿼리 확인용 완성본에선 삭제 ***
			
			result = preparedStatement.executeUpdate();
			if(result>0) {
				System.out.println(result + "개의 게시물이 등록되었습니다.");
				connection.commit();
				return session;
			}else {
				// System.out.println("쿼리 실행 결과 : " + result); // ***삭제예정
				System.out.println("게시글이 등록되지 않았습니다.");
			} // if문 종료
		} catch (SQLException e) {
			System.out.println("예외 발생 : insertBoard()메서드의 쿼리문을 다시 확인하세요.");
			e.printStackTrace();
		}finally {
			preparedStatement.close();
		}
		
		return null;
		
	} // 게시글 작성 메서드 종료
	
	

	public void readAll() throws SQLException {
		// 전체 게시글 확인 메서드
		try {
			String sql = "select bno, btitle, bwriter, bdate from memberboard order by bdate desc";

			statement = connection.createStatement(); 
			resultSet = statement.executeQuery(sql); 

			System.out.println("번호\t 제목\t 작성자\t 작성일\t");
			while (resultSet.next()) {
				System.out.print(resultSet.getInt("bno") + "\t");
				System.out.print(resultSet.getString("btitle") + "\t");
				System.out.print(resultSet.getString("bwriter") + "\t");
				System.out.println(resultSet.getDate("bdate") + "\t");

			}
			System.out.println("==========================");
		} catch (SQLException e) {
			System.out.println("seletALL() 메서드의 쿼리문이 잘못되었습니다.");
			e.printStackTrace();
		} finally {
			resultSet.close();
			statement.close(); // 열린 객체를 닫아야 다른 메서드도 정상 작동.
		}

	} // 전체 게시글 확인 메서드 종료
	
	
	
	public void readOne(String bno, MemberBoardDAO memberboardDAO) throws SQLException {
		// 게시글 검색 조회 메서드
		
		try {
			String sql = "select bno, btitle, bcontent, bwriter, bdate from memberboard where bno = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, bno); 
			resultSet = preparedStatement.executeQuery(); 

			if (resultSet.next()) { 
				MemberBoardDTO memberboardDTO = new MemberBoardDTO();

				memberboardDTO.setBno(resultSet.getInt("bno"));
				memberboardDTO.setBtitle(resultSet.getString("btitle"));
				memberboardDTO.setBcontent(resultSet.getString("bcontent"));
				memberboardDTO.setBwriter(resultSet.getString("bwriter"));
				memberboardDTO.setBdate(resultSet.getDate("bdate"));
				
				System.out.println("==========================");
				System.out.println("번호 : " + memberboardDTO.getBno());
				System.out.println("제목 : " + memberboardDTO.getBtitle());
				System.out.println("내용 : " + memberboardDTO.getBcontent());
				System.out.println("작성자 : " + memberboardDTO.getBwriter());
				System.out.println("작성일 : " + memberboardDTO.getBdate());
			} else { // 검색 결과가 없을 경우
				System.out.println("해당하는 게시물이 존재하지 않습니다.");
			} // if문 종료
		} catch (SQLException e) {
			System.out.println("예외 발생 : readOne() 메서드를 확인하세요.");
			e.printStackTrace();
		} finally {
			resultSet.close();
			preparedStatement.close();
		}
		
	} // 게시글 검색 조회 메서드 종료 

	
	
	
	public void modify(Scanner inputStr, MemberBoardDAO memberboardDAO, String bno, MemberDTO session) throws SQLException {
		// 게시글 수정 메서드 
		   Scanner inputLine = new Scanner(System.in);
		   MemberBoardDTO memberboardDTO = new MemberBoardDTO();

			System.out.println("수정할 게시글의 제목을 입력하세요.");
			System.out.print(">>> ");
			memberboardDTO.setBtitle(inputStr.next());

			System.out.println("수정할 게시글 내용을 입력해주세요.");
			System.out.print(">>> ");
			memberboardDTO.setBcontent(inputLine.nextLine());

			try {
				
				String sql = "update memberboard set btitle = ?, bcontent = ?, bdate = sysdate where bno = ?";
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, memberboardDTO.getBtitle());
				preparedStatement.setString(2, memberboardDTO.getBcontent());
				preparedStatement.setString(3, bno);

				result = preparedStatement.executeUpdate(); // 실행 후 결과 정수로 받기

				if (result > 0) {
					System.out.println(result + "개의 데이터가 수정되었습니다.");
					connection.commit(); // 영구 저장
				} else {
					System.out.println("수정이 되지 않았습니다.");
					connection.rollback();
				} // if문 종료
			} catch (SQLException e) {
				System.out.println("예외 발생 : modify()메서드와 sql문을 확인하세요.");
				e.printStackTrace();
			} finally {
				preparedStatement.close();
			}
		
	} // 게시글 수정 메서드 종료

	public void deleteOne(int deleteBno, MemberDTO session) throws SQLException {
		// 게시글 삭제 메서드
		try {
			String sql = "delete from memberboard where bno = ? ";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, deleteBno);

			result = preparedStatement.executeUpdate();

			if (result > 0) {
				System.out.println(result + "개의 게시글이 삭제되었습니다.");
				connection.commit();
			} else {
				System.out.println("게시글이 삭제되지 않았습니다.");
				connection.rollback();
			}

		} catch (SQLException e) {
			System.out.println("예외 발생. delete 메서드와 sql문을 확인하세요.");
			e.printStackTrace();
		} finally {
			preparedStatement.close();
		}
	} // 게시글 삭제 메서드 종료
	
	
}

package dao;

// import를 sql로 하지 않으면 오류가 발생한다. 코드에 이상이 없는데 오류가 뜨면 import 확인하기
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import dto.BoardDTO;

public class BoardDAO {
	// DB 연결 담당
	// 1단계 : Connect 객체를 사용하여 ojdbc6.jar를 생성
	// 2단계 : url, id, pw, sql 쿼리문을 작성
	// 3단계 : 쿼리문 실행
	// 4단계 : 쿼리문 실행 결과 받기
	// 5단계 : 연결 종료 진행

	// 필드
	public BoardDTO boardDTO = new BoardDTO();
	public Connection connection = null;
	public Statement statement = null;
	public PreparedStatement preparedStatement = null;
	public ResultSet resultSet = null;;
	public int result = 0;

	// 기본생성자
	public BoardDAO() {

		try { // 예외가 발생할 수 있는 실행문 강제종료 처리용
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

	public void selectAll() throws SQLException {
		// 전체 게시글 확인 메서드

		try {
			String sql = "select bno, btitle, bwriter, bdate from board order by bdate desc";
			// 읽기 번호 제목 작성자 작성날 ~순으로 정렬 날짜
			// 데이터베이스에서 board 테이블을 가져오는 쿼리문

			statement = connection.createStatement(); // 쿼리문을 실행하는 객체 생성
			resultSet = statement.executeQuery(sql); // 쿼리문을 실행하여 결과를 표로 받음

			System.out.println("번호\t 제목\t 작성자\t 작성일\t");
			while (resultSet.next()) {
				// 결과를 표 위에서부터 아래로 내려오면서 출력한다.
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

	}

	public void readOne(String title) throws SQLException {
		// 게시글 자세히 보기 메서드

		try {
			String sql = "select bno, btitle, bcontent, bwriter, bdate from board where btitle = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, title); // service에서 넘어온 찾고 싶은 제목이 ?로 넘어간다.
			resultSet = preparedStatement.executeQuery(); // 쿼리문 실행 후 결과를 표로 받는다.

			if (resultSet.next()) { // 검색 결과가 있을 경우
				BoardDTO boardDTO = new BoardDTO(); // 빈 객체 생성

				boardDTO.setBno(resultSet.getInt("bno"));
				boardDTO.setBtitle(resultSet.getString("btitle"));
				boardDTO.setBcontent(resultSet.getString("bcontent"));
				boardDTO.setBwriter(resultSet.getString("bwriter"));
				boardDTO.setBdate(resultSet.getDate("bdate"));
				// 데이터 베이스에 있는 행을 객체에 넣기
				System.out.println("==========================");
				System.out.println("번호 : " + boardDTO.getBno());
				System.out.println("제목 : " + boardDTO.getBtitle());
				System.out.println("내용 : " + boardDTO.getBcontent());
				System.out.println("작성자 : " + boardDTO.getBwriter());
				System.out.println("작성일 : " + boardDTO.getBdate());
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

	} // 게시글 자세히 보기 메서드 종료

	public void insertBoard(BoardDTO boardDTO) throws SQLException {
		// 게시글 작성 메서드

		try {
			String sql = "insert into board(bno, btitle, bcontent, bwriter, bdate) values(board_seq.nextval, ?, ?, ?, sysdate)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, boardDTO.getBtitle());
			preparedStatement.setString(2, boardDTO.getBcontent());
			preparedStatement.setString(3, boardDTO.getBwriter());
			System.out.println("쿼리 확인 : " + sql); // 쿼리 완성본 확인용(테스트) ***

			result = preparedStatement.executeUpdate();

			if (result > 0) {
				System.out.println(result + "개의 게시물이 등록되어있습니다.");
				connection.commit(); // 영구 저장
			}else {
				System.out.println("쿼리 실행 결과 : " + result);
				System.out.println("입력 실패");
				connection.rollback();
				
			}// if문 종료
		} catch (SQLException e) {
			System.out.println("예외 발생 : insertBoard()메서드의 쿼리문을 확인하세요.");
			e.printStackTrace();
		} finally {
			preparedStatement.close();
		}

	} // 게시글 작성 메서드 종료

	public void modify(Scanner inputStr, BoardDTO boardDTO, String title) throws SQLException {
		// 게시글 수정 메서드
		Scanner inputLine = new Scanner(System.in);

		System.out.println("수정할 게시글의 제목을 입력하세요.");
		System.out.print(">>> ");
		boardDTO.setBtitle(inputStr.next());

		System.out.println("수정할 게시글 내용을 입력해주세요.");
		System.out.print(">>> ");
		boardDTO.setBcontent(inputLine.nextLine());

		try {
			String sql = "update board set btitle = ?, bcontent = ?, bdate = sysdate where btitle = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, boardDTO.getBtitle());
			preparedStatement.setString(2, boardDTO.getBcontent());
			preparedStatement.setString(3, title);

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

	public void deleteOne(int selectBno) throws SQLException {
		// 게시글 삭제 메서드 시작

		try {
			String sql = "delete from board where bno = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, selectBno);

			result = preparedStatement.executeUpdate();

			if (result > 0) {
				System.out.println(result + "개의 게시물이 삭제되었습니다.");
			} else {
				System.out.println("게시글이 삭제되지 않았습니다.");
				connection.rollback();
			}

			System.out.println("==========================");
			selectAll(); // 삭제 후 전체 리스트 보기

		} catch (SQLException e) {
			System.out.println("예외 발생 : deleteOne()메서드와 sql문을 확인하세요.");
			e.printStackTrace();
		} finally {
			preparedStatement.close();
		}

	} // 게시글 삭제 메서드 종료

} // 클래스 종료

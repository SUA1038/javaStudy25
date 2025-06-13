package JDBCTest.service;

import java.sql.SQLException;
import java.util.Scanner;

import JDBCTest.dao.MemberBoardDAO;
import JDBCTest.dto.MemberBoardDTO;
import JDBCTest.dto.MemberDTO;

public class MemberBoardService {

	public void menu(Scanner inputStr, Scanner inputInt, MemberDTO session) throws SQLException {

		MemberBoardDAO memberboardDAO = new MemberBoardDAO();
		boolean boardRun = true;

		while (boardRun) {
			System.out.println("---- 게시판 서비스 ----");
			System.out.println("1. 게시글 작성");
			System.out.println("2. 게시글 조회");
			System.out.println("3. 게시글 수정");
			System.out.println("4. 게시글 삭제");
			System.out.println("5. 메인 메뉴로");
			System.out.print(">>> ");
			String subSelect = inputStr.next();

			switch (subSelect) {
			case "1":
				System.out.println("게시글 작성 페이지로 이동합니다.");
				insertBoard(memberboardDAO, inputStr, session);
				break;

			case "2":
				System.out.println("게시글 조회 페이지로 이동합니다.");
				System.out.println("1. 전체 게시글 확인하기");
				System.out.println("2. 검색으로 게시글 상세 확인하기.");
				System.out.print(">>> ");
				int readSelect = inputInt.nextInt();
				
				if(readSelect == 1) {
					System.out.println("전체 게시글을 확인합니다.");
					readAll();
				}else if(readSelect == 2) {
					System.out.println("검색한 게시글의 내용을 확인합니다.");
					readOne(inputStr, memberboardDAO);
				}
				break;

			case "3":
				System.out.println("게시글 수정 페이지로 이동합니다.");
				modify(inputStr, memberboardDAO, session);
				break;

			case "4":
				System.out.println("게시글 삭제 페이지로 이동합니다.");
				deleteOne(inputInt, memberboardDAO, session);
				break;

			case "5":
				System.out.println("메인 메뉴로 이동합니다.");
				boardRun = false;
				break;

			default:
				System.out.println("1~5의 값을 입력하세요.");

			} // switch문 종료
			
		} // while문 종료

	}

	private void deleteOne(Scanner inputInt, MemberBoardDAO memberboardDAO, MemberDTO session) throws SQLException {
		// 게시글 삭제 메서드
		
		System.out.println("삭제할 게시글의 번호를 입력하세요.");
		System.out.print(">>> ");
		int deleteBno = inputInt.nextInt();
		memberboardDAO.deleteOne(deleteBno, session);
		
		
	}// 게시글 삭제 메서드 종료

	private void modify(Scanner inputStr, MemberBoardDAO memberboardDAO, MemberDTO session) throws SQLException {
		// 게시글 수정 메서드
		System.out.println("수정하려는 게시글의 번호를 입력하세요.");
		System.out.print(">>> ");
		String bno = inputStr.next();
		
		memberboardDAO.modify(inputStr, memberboardDAO, bno, session);
	} // 게시글 수정 메서드 종료

	private void readOne(Scanner inputStr, MemberBoardDAO memberboardDAO) throws SQLException {
		// 게시글 상세 조회 메서드
		System.out.println("확인하려는 게시글의 번호를 입력하세요.");
		System.out.print(">>> ");
		String bno = inputStr.next();
		
		memberboardDAO.readOne(bno, memberboardDAO);
	} // 게시글 상세 조회 메서드 종료

	private void readAll() throws SQLException {
		// 전체 게시글 확인 메서드
		MemberBoardDAO memberboardDAO = new MemberBoardDAO();
		
		System.out.println("==========================");
		System.out.println("===== MBC 게시판 목록 =====");
		memberboardDAO.readAll();
		System.out.println("==========================");
	} // 전체 게시글 확인 메서드 종료

	private void insertBoard(MemberBoardDAO memberboardDAO, Scanner inputStr, MemberDTO session) throws SQLException {
		// 게시글 작성 메서드
		Scanner inputLine = new Scanner(System.in);
		MemberBoardDTO memberBoardDTO = new MemberBoardDTO();
		
		System.out.print("제목 : ");
		memberBoardDTO.setBtitle(inputStr.next());
		
		System.out.print("내용 : ");
		memberBoardDTO.setBcontent(inputLine.nextLine());
		
		memberboardDAO.insertBoard(memberBoardDTO, session);
		
	} // 게시글 작성 메서드 종료

}

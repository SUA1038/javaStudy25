package service;

import java.sql.SQLException;
import java.util.Scanner;

import dao.MBoardDAO;
import dto.BoardDTO;
import dto.MemberDTO;

public class MBoardService {
	public static MBoardDAO mBoardDAO = new MBoardDAO();
	
	public void subMenu(Scanner inputStr, MemberDTO session) throws SQLException {
		// 회원 전용 게시판 
		boolean subRun = true;
		
		while (subRun) {
			System.out.println("MBC 회원 전용 게시판입니다.");
			System.out.println("1. 게시물 작성");
			System.out.println("2. 게시글 보기");
			System.out.println("3. 게시글 수정");
			System.out.println("4. 게시글 삭제");
			System.out.println("5. 돌아가기");
			System.out.print(">>> ");
			String subSelect = inputStr.next();
			
			switch(subSelect) {
			case "1" : 
				System.out.println("회원 전용 게시글을 작성합니다.");
				insertBoard(inputStr, session);
				break;
			
			case "2" : 
				Scanner inputInt = new Scanner(System.in);
				System.out.println("회원 전용 게시글을 확인합니다.");
				System.out.println("1. 전체 게시글 확인");
				System.out.println("2. 내가 쓴 게시글 확인");
				System.out.println("3. 게시글 상세보기");
				System.out.print(">>> ");
				int rSelete = inputInt.nextInt();
				
				if (rSelete == 1) {
					System.out.println("전체 게시글을 확인합니다.");
					selectAll();
				} else if (rSelete == 2) {
					System.out.println("내가 쓴 게시글을 확인합니다.");
					selectOne(session);
				} else if (rSelete == 3) {
					System.out.println("자세히 볼 게시글의 번호를 입력하세요.");
					System.out.print(">>> ");
					String bno = inputInt.next();
					mBoardDAO.readOne(bno);
				} else {
					System.out.println("1~3의 값을 입력하세요.");
				}
				
				break;
				
			case "3" : 
				System.out.println("게시글을 수정합니다.");
				update(inputStr, session);
				break;
				
			case "4" : 
				System.out.println("게시글을 삭제합니다.");
				delete(inputStr);
				break;
				
			case "5" : 
				System.out.println("메인 메뉴로 돌아갑니다.");
				subRun = false;
				break;
				
			default : 
				System.out.println("1~5의 값을 입력하세요.");
				break;
		
			} // switch문 종료
					
		} // while문 종료
		
	} // 메서드 종료

	
	private void delete(Scanner inputStr) throws SQLException {
		// 게시글 삭제 메서드
		Scanner inputInt = new Scanner(System.in);
		System.out.println("삭제할 게시글의 번호를 입력하세요.");
		System.out.print(">>> ");
		int deleteNum = inputInt.nextInt();
		
		mBoardDAO.delete(deleteNum);
	} // 메서드 종료


	public void update(Scanner inputStr, MemberDTO session) throws SQLException {
		// 게시글 수정 메서드
		Scanner inputInt = new Scanner(System.in);
		BoardDTO boardDTO = new BoardDTO();
		System.out.println("수정하려는 게시글의 번호를 입력하세요.");
		System.out.print(">>> ");
		int bno = inputInt.nextInt();

		MBoardDAO mBoardDAO = new MBoardDAO();
	    mBoardDAO.update(inputStr, boardDTO, bno, session.getId());
	} // 메서드 종료


	private void selectOne(MemberDTO session) throws SQLException {
		// 내가 쓴 게시글 확인 메서드
		mBoardDAO.selectOne(session);
	} // 메서드 종료

	
	private void selectAll() throws SQLException {
		// 전체 게시글 확인 메서드
		System.out.println("==========================");
		System.out.println("======= MBC 회원 목록 =======");
		mBoardDAO.seleteAll();
		System.out.println("==========================");
	} // 메서드 종료

	
	private  MemberDTO insertBoard(Scanner inputStr, MemberDTO session) throws SQLException {
		// 게시글 작성 메서드
		BoardDTO boardDTO = new BoardDTO();
		System.out.println("작성할 게시글의 제목을 입력하세요.");
		System.out.print(">>> ");
		boardDTO.setBtitle(inputStr.next());
		
		System.out.println("작성할 게시글의 내용을 입력하세요.");
		System.out.print(">>> ");
		boardDTO.setBcontent(inputStr.next());
		
		MBoardDAO.insertBoard(session, boardDTO);
		return session;
		
	} // 게시글 작성 메서드 종료


} // 클래스 종료
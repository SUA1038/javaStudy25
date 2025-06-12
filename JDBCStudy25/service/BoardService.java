package service;

import java.sql.SQLException;
import java.util.Scanner;

import dao.BoardDAO;
import dto.BoardDTO;

public class BoardService {
	
	public static BoardDAO boardDAO = new BoardDAO();
	
	public static void subMenu(Scanner inputStr) throws SQLException {
		boolean subRun = true;
		
		System.out.println("MBC 게시판 서비스입니다.");
		System.out.println("1. 게시물 작성");
		System.out.println("2. 게시글 보기");
		System.out.println("3. 게시글 수정");
		System.out.println("4. 게시글 삭제");
		System.out.println("5. 돌아가기");
		System.out.print(">>> ");
		String subSelect = inputStr.next();
		
		switch(subSelect) {
		
		case "1":
			System.out.println("게시글을 작성합니다.");
			insertBoard(boardDAO, inputStr);
			break;
			
		case "2":
			System.out.println("게시글을 확인합니다.");
			System.out.println("1. 전체 게시글 확인하기");
			System.out.println("2. 게시글 자세히 보기");
			System.out.print(">>> ");
			String readSelect = inputStr.next();
			switch(readSelect) {
			case "1" :
				System.out.println("전체 게시글을 확인합니다.");
				selectAll(boardDAO);
				break;
			
			case "2" :
				System.out.println("보고 싶은 게시글의 제목을 입력하세요.");
				System.out.print(">>> ");
				String title = inputStr.next();
				
				boardDAO.readOne(title);
				break;
				
			default :
				System.out.println("1~2의 값을 입력하세요.");
				
			} // 게시글 확인 스위치문 종료
			
			break;
			
		case "3":
			System.out.println("게시글을 수정합니다.");
			modify(inputStr, boardDAO);
			break;
			
		case "4":
			System.out.println("게시글을 삭제합니다.");
			deleteOne(inputStr, boardDAO);
			break;
			
		case "5":
			System.out.println("메인 메뉴로 돌아갑니다.");
			subRun = false;
			break;
			
		default : 
			System.out.println("1~5의 값을 입력해주세요.");
			break;
		
		} // 스위치문 종료
		
		
		
		
	} // 서브메뉴 메서드 종료

	private static void deleteOne(Scanner inputStr, BoardDAO boardDAO) throws SQLException {
		Scanner inputInt = new Scanner(System.in);
		
		System.out.println("삭제할 게시글의 번호를 입력하세요.");
		System.out.print(">>> ");
		int selectBno = inputInt.nextInt();
		boardDAO.deleteOne(selectBno);
	}

	private static void modify(Scanner inputStr, BoardDAO boardDAO) throws SQLException {
		BoardDTO boardDTO = new BoardDTO();
		
		System.out.println("수정하려는 게시글의 제목을 입력하세요.");
		System.out.print(">>> ");
		String title = inputStr.next();
		
		boardDAO.modify(inputStr, boardDTO, title);
		
		
		
	}

	private static void insertBoard(BoardDAO boardDAO, Scanner inputStr) throws SQLException {
		// 게시글 작성 메서드 시작
		Scanner inputLine = new Scanner(System.in);
		BoardDTO boardDTO = new BoardDTO(); // 빈 객체 생성
		
		System.out.print("작성자 : ");
		boardDTO.setBwriter(inputStr.next());
		
		System.out.print("제목 : ");
		boardDTO.setBtitle(inputStr.next());
		
		System.out.print("내용 : ");
		boardDTO.setBcontent(inputLine.nextLine());
		
		boardDAO.insertBoard(boardDTO);
		
		
	} // 게시글 작성 메서드 종료
	
	
	

	private static void selectAll(BoardDAO boardDAO) throws SQLException {
		// 게시글 전체 확인 메서드
		System.out.println("==========================");
		System.out.println("====== MBC 게시판 목록 ======");
		boardDAO.selectAll();
		System.out.println("==========================");
		
	} // 게시글 전체 확인 메서드 종료
	
	
	
	
} // 클래스 종료

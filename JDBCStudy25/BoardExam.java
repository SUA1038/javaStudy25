import java.sql.SQLException;
import java.util.Scanner;

import dto.MemberDTO;
import service.BoardService;
import service.MBoardService;
import service.MemberService;


// 만들어야 할 것들
// 회원전용 > 글 삭제, 수정 > 작성자만 글 삭제, 수정 가능하도록 구현
// 회원관리 > 계정 탈퇴 > ID는 기본키라 못 지우는데, 어떻게 할 건지 ... > 랜덤으로 아이디 부여?
// 아무래도 세션이 제대로 돌고 있지 않은 것 같음..... 고치기
// 관리자 권한 넣기 > 세션먼저 제대로 돌게 해야 할 수 있을듯...


public class BoardExam {

	// 필드
	public static Scanner inputStr = new Scanner(System.in);
	public static MemberService memberService = new MemberService();
	public static BoardService boardService = new BoardService();
	public static MBoardService mboardservice = new MBoardService();
	public static MemberDTO session = null;
	
	// 생성자 -> static 블럭

	// 메서드
	public static void main(String[] args) throws SQLException {
		// 메인 메뉴 구현용
		// dto : 객체를 담당
		// dao : 데이터베이스 연동 담당
		// service : 부메뉴, 서비스 담당

		boolean run = true;

		while (run) {
			System.out.println("MBC 자유 게시판");
			System.out.println("1. 로그인");
			System.out.println("2. 회원 관리");
			System.out.println("3. 회원 게시판");
			System.out.println("4. 비회원 게시판");
			System.out.println("5. 프로그램 종료");
			System.out.print(">>> ");
			String select = inputStr.next();

			switch (select) {
			case "1":
				System.out.println("로그인 서비스로 이동합니다.");
				session = memberService.login(inputStr);
				break;
			
			case "2":
				System.out.println("회원 관리 서비스로 이동합니다.");
				MemberService.subMenu(inputStr);
				break;

			case "3":
				MemberDTO memberDTO = new MemberDTO();
				if (session != null) {
					System.out.println("회원 전용 게시판 서비스로 이동합니다.");
					mboardservice.subMenu(inputStr, session);
				}else if(session == null){
					System.out.println("로그인이 필요한 서비스입니다.");
				}
				break;
				
			case "4":
				System.out.println("비회원 게시판 서비스로 이동합니다.");
				BoardService.subMenu(inputStr);
				break;

			case "5":
				System.out.println("프로그램을 종료합니다.");
				session = null; // 종료 시 자동 로그아웃
				run = false;
				break;

			default:
				System.out.println("1~5의 값을 입력하세요.");
				break;

			} // switch문 종료

		} // while 문 종료

	} // 메서드 종료

} // 클래스 종료

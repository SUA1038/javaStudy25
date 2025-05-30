package JavaTest;

import java.util.Scanner;

import JavaTest.DTO.MemberDTO;
import JavaTest.DTO.ScoreDTO;
import JavaTest.service.LoginService;
import JavaTest.service.ScoreService;

public class TestExam {
	// 자바 시험용 성적처리 프로그램 작성
	
	// 스캐너 객체 생성
	public static Scanner inputStr = new Scanner(System.in);
	public static Scanner inputInt = new Scanner(System.in);
	
	
	public static MemberDTO[] memberDTOs = new MemberDTO[15];
	public static MemberDTO loginState = new MemberDTO();
	
	
	public static ScoreDTO[] scoreDTOs = new ScoreDTO[15];
	public static ScoreDTO score = new ScoreDTO();
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println("MBC 아카데미 성적 관리 프로그램을 시작합니다.");
		MemberDTO loginState = null;
		
		
		boolean run = true;
		while(run) {
			System.out.println("1. 계정 관리 | 2. 성적 관리 | 3. 프로그램 종료");
			System.out.print(">>> ");
			String select = inputStr.next();
			
			switch(select) {
			case "1":
				System.out.println("계정 관리 메뉴로 이동합니다.");			
				LoginService loginService = new LoginService();  
				loginState = loginService.menu(inputStr, inputInt, memberDTOs, loginState);
				break;
				
			case "2":
			    if (loginState.getId() == null) {
			        System.out.println("※ 로그인 후 이용 가능한 메뉴입니다.");
			        break;
			    }
			    System.out.println("성적 관리 메뉴로 이동합니다.");
			    ScoreService scoreService = new ScoreService();
			    scoreService.menu(inputStr, inputInt, memberDTOs, loginState, scoreDTOs);
			    break;
				
			case "3":
				System.out.println("MBC 성적 관리 프로그램을 종료합니다.");
				run = false;
				break;
				
			default :
				System.out.println("입력 오류. 1~3의 값을 입력해주세요.");
				break;
			} // 메인 선택문 switch 종료
			
		} // 메인 화면 while 문 종료
		
		
	} // 메인 메서드 종료

} // 클래스 종료

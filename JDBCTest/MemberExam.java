package JDBCTest;

import java.sql.SQLException;
import java.util.Scanner;

import JDBCTest.dto.MemberDTO;
import JDBCTest.service.MemberBoardService;
import JDBCTest.service.MemberService;

public class MemberExam {
	
	// 필드
	public static Scanner inputStr = new Scanner(System.in);
	public static Scanner inputInt = new Scanner(System.in);
	public static MemberService memberservice = new MemberService();
	public static MemberBoardService memberboardservice = new MemberBoardService();
	public static MemberDTO session = null;

	public static void main(String[] args) throws SQLException {
		boolean run = true;
		
		
		while (run) {
			System.out.println(" ---- MBC 프로그램 ----");
			if(session != null) {
				System.out.println("현재 나의 계정 : " + session.getId());	
			}
			System.out.println("1. 로그인");
			System.out.println("2. 회원 관리");
			System.out.println("3. 게시판");
			System.out.println("4. 프로그램 종료");
			System.out.print(">>> ");
			String select = inputStr.next();
			

			
			
			switch(select) {
			
			case "1":
				System.out.println("로그인 페이지로 이동합니다.");
				session = memberservice.login(inputStr);
				break;
			
			case "2":
				System.out.println("회원 관리 페이지로 이동합니다.");
				memberservice.subMenu(inputStr, inputInt, session);
				break;
				
			case "3" :
				if(session != null) {
					System.out.println("게시판 페이지로 이동합니다.");
					memberboardservice.menu(inputStr, inputInt, session);
				}else {
					System.out.println("로그인이 필요한 서비스입니다.");
				}
				
				break;
				
			case "4" :
				System.out.println("프로그램을 종료합니다.");
				session = null;
				run = false;
				break;
			
			default :
				System.out.println("1~4의 값을 입력하세요.");
				
			}
			
			
			
		}
		

	}

}

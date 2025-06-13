package JDBCTest;

import java.sql.SQLException;
import java.util.Scanner;

import JDBCTest.dto.MemberDTO;
import JDBCTest.service.MemberBoardService;
import JDBCTest.service.MemberService;

public class MemberExam {
	
	// �ʵ�
	public static Scanner inputStr = new Scanner(System.in);
	public static Scanner inputInt = new Scanner(System.in);
	public static MemberService memberservice = new MemberService();
	public static MemberBoardService memberboardservice = new MemberBoardService();
	public static MemberDTO session = null;

	public static void main(String[] args) throws SQLException {
		boolean run = true;
		
		
		while (run) {
			System.out.println(" ---- MBC ���α׷� ----");
			if(session != null) {
				System.out.println("���� ���� ���� : " + session.getId());	
			}
			System.out.println("1. �α���");
			System.out.println("2. ȸ�� ����");
			System.out.println("3. �Խ���");
			System.out.println("4. ���α׷� ����");
			System.out.print(">>> ");
			String select = inputStr.next();
			

			
			
			switch(select) {
			
			case "1":
				System.out.println("�α��� �������� �̵��մϴ�.");
				session = memberservice.login(inputStr);
				break;
			
			case "2":
				System.out.println("ȸ�� ���� �������� �̵��մϴ�.");
				memberservice.subMenu(inputStr, inputInt, session);
				break;
				
			case "3" :
				if(session != null) {
					System.out.println("�Խ��� �������� �̵��մϴ�.");
					memberboardservice.menu(inputStr, inputInt, session);
				}else {
					System.out.println("�α����� �ʿ��� �����Դϴ�.");
				}
				
				break;
				
			case "4" :
				System.out.println("���α׷��� �����մϴ�.");
				session = null;
				run = false;
				break;
			
			default :
				System.out.println("1~4�� ���� �Է��ϼ���.");
				
			}
			
			
			
		}
		

	}

}

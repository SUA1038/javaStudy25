package ch05.mbcbank;

import java.util.Scanner;

import ch05.mbcbank.DTO.AccountDTO;
import ch05.mbcbank.DTO.HanaAccountDTO;
import ch05.mbcbank.DTO.NhAccountDTO;
import ch05.mbcbank.DTO.WuriAccountDTO;
import ch05.mbcbank.service.HanaBankService;
import ch05.mbcbank.service.WuriBankService;

public class BankExam {

	public static Scanner inputInt = new Scanner(System.in);
	public static Scanner inputStr = new Scanner(System.in);
	
	public static HanaAccountDTO[] hanaBank = new HanaAccountDTO[20];
	public static WuriAccountDTO[] wuriBank = new WuriAccountDTO[20];
	public static NhAccountDTO[] nhBank = new NhAccountDTO[20];
	public static AccountDTO[] session = null;
	
	static {
		HanaAccountDTO accountDTO1 = new HanaAccountDTO();
		hanaBank[0] = accountDTO1;
		
		WuriAccountDTO accountDTO2 = new WuriAccountDTO();
		wuriBank[0] = accountDTO2;
		
		NhAccountDTO accountDTO3 = new NhAccountDTO();
		nhBank[0] = accountDTO3;
		
		
	} // static 종료
	
	
	

	
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("======================");
			System.out.println("MBC 아카데미 금융 프로그램");
			System.out.println("======================");
			System.out.println("1. 하나은행");
			System.out.println("2. 우리은행");
			System.out.println("3. 농협은행");
			System.out.println("4. 프로그램 종료");
			System.out.print(">>> ");
			String select = inputStr.next();
			
			switch(select) {
			case "1":
				System.out.println("하나은행 메뉴로 진입합니다.");
				HanaBankService hanaBankService = new HanaBankService();
				hanaBankService.menu(inputStr, inputInt, hanaBank);
				break;
				
			case "2":
				System.out.println("우리은행 메뉴로 진입합니다.");
				WuriBankService wuriBankService = new WuriBankService();
				wuriBankService.menu(inputStr, inputInt, wuriBank);
				break;
				
			case "3":
				System.out.println("농협은행 메뉴로 진입합니다.");
				break;
				
			case "4":
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
				
			default :
				System.out.println("선택 오류. 1~4의 값을 입력해주세요.");
				break;
			
			
			} // 메인 메뉴 선택창 종료 (switch)
			
		} // 메인 메뉴 종료 (while)
		
		
		
		

	} // 메인 메뉴 종료 (main)

} // BankExam 클래스 종료

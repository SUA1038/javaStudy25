package ch05.lineage.service;

import java.util.Scanner;

import ch05.lineage.DTO.AccountDTO;

public class LoginService {
	
	public static AccountDTO menu(Scanner inputStr, Scanner inputInt, AccountDTO loginAccount, AccountDTO[] accountDTOs) {
		
		boolean run = true;
		while(run) {
		System.out.println("1. 로그인 | 2. 회원가입 | 3. 내 정보 확인 | 4. 내 정보 수정 | 5. 회원탈퇴 | 6. 메뉴로 돌아가기");
		System.out.print(">>> ");
		String select = inputStr.next();
		
		switch(select) {
		case "1" :
			System.out.println("로그인을 시작합니다.");
			login(inputStr, inputInt, loginAccount, accountDTOs);
			break;
			
		case "2" :
			System.out.println("회원가입을 시작합니다.");
			create(inputStr, inputInt, loginAccount, accountDTOs);
			break;
			
		case "3" :
			System.out.println("내 정보를 확인합니다.");
			break;
			
		case "4" :
			System.out.println("내 정보를 수정합니다.");
			break;
			
		case "5" :
			System.out.println("회원탈퇴를 진행합니다.");
			break;
			
		case "6" :
			System.out.println("메인 메뉴로 돌아갑니다.");
			run = false;
			break;
			
		default :
			System.out.println("선택 오류. 1~5의 값을 입력해주세요.");
			break;
		
		
		} // 부메뉴 선택문 switch 종료
		
		
		
		} // 부메뉴 반복문 while 종료
		
		
		
		
		return loginAccount;
	} // menu 종료

	
	
	

// 로그인 =========================================================================================
private static AccountDTO login(Scanner inputStr, Scanner inputInt, AccountDTO loginAccount, AccountDTO[] accountDTOs) {
	AccountDTO myLogin = new AccountDTO();
	
	System.out.print("ID : ");
	String id = inputStr.next();
	
	System.out.print("\nPW : ");
	String pw = inputStr.next();
	
	
	for(int i=0; i<accountDTOs.length; i++) {
		if(accountDTOs[i].equals(id) && accountDTOs[i].equals(pw)) {
			System.out.println(accountDTOs[i].getNickName() + "님 , 환영합니다.");
			break;
		} else {
			System.out.println("로그인 실패. ID 혹은 PW를 다시 확인해주세요.");		
		} // if문 종료
	}
	return loginAccount;
} // 로그인 메서드 login 종료		

// 로그인 =========================================================================================









// 회원가입 =========================================================================================
	private static AccountDTO create(Scanner inputStr, Scanner inputInt, AccountDTO loginAccount, AccountDTO[] accountDTOs) {
		AccountDTO myAcc = new AccountDTO();
		System.out.print("신규 생성 ID : ");
		myAcc.setId(inputStr.next());
		System.out.print("\n신규 생성 PW : ");
		myAcc.setPw(inputStr.next());
		System.out.print("\n신규 생성 닉네임 : ");
		myAcc.setNickName(inputStr.next());
		System.out.print("\n신규 생성 이메일 : ");
		myAcc.setEmail(inputStr.next());
		
		for(int i=0; i<accountDTOs.length; i++) {
			if(accountDTOs[i] == null) {
				System.out.println("회원 가입 한도를 초과했습니다.");
				System.out.println("관리자에게 문의 후 다시 시도해주세요.");
			}else {
				System.out.println(myAcc.getId() + "님, 회원가입이 완료되었습니다.");
				accountDTOs[i] = myAcc;
				System.out.println("검증 테스트 " + myAcc);
				break;
			} // if문 종료
		}
		return loginAccount;
	} // 회원가입 메서드 create 종료

//	회원가입 =========================================================================================
	
} // class 종료
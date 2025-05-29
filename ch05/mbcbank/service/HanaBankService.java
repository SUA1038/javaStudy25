package ch05.mbcbank.service;

import java.util.Scanner;

import ch05.mbcbank.DTO.HanaAccountDTO;

public class HanaBankService {

	public HanaAccountDTO menu(Scanner inputStr, Scanner inputInt, HanaAccountDTO[] hanaBank) {
		boolean subRun = true;

		while (subRun) {
			System.out.println("1. 계좌 생성");
			System.out.println("2. 계좌 조회");
			System.out.println("3. 예금");
			System.out.println("4. 출금");
			System.out.println("5. 이체");
			System.out.println("6. 메인 메뉴로 돌아가기");
			System.out.print(">>> ");
			String select = inputStr.next();

			switch (select) {
			case "1":
				System.out.println("계좌 생성 항목으로 이동합니다.");
				createAccount(inputStr, inputInt, hanaBank);
				break;

			case "2":
				System.out.println("계좌 조회 항목으로 이동합니다.");
				accountLists(inputStr, inputInt, hanaBank);
				break;

			case "3":
				System.out.println("계좌 예금 항목으로 이동합니다.");
				depositAccount(inputStr, inputInt, hanaBank);
				break;

			case "4":
				System.out.println("계좌 출금 항목으로 이동합니다.");
				withdrawAccount(inputStr, inputInt, hanaBank);
				break;

			case "5":
				System.out.println("계좌 이체 항목으로 이동합니다.");
				TransferFunds(inputStr, inputInt, hanaBank);
				break;

			case "6":
				System.out.println("메인 메뉴로 이동합니다.");
				subRun = false;
				break;

			default:
				System.out.println("선택 오류. 1~6의 값을 입력하세요.");
				break;

			} // 부메뉴 선택문 종료 (switch)

		} // 부메뉴 반복문 종료 (while)

		return null;
	} // 부메뉴 메서드 종료(menu)


	
	
	
	
	// 계좌 이체 ================================================
	private void TransferFunds(Scanner inputStr, Scanner inputInt, HanaAccountDTO[] hanaBank) {
		
		System.out.println("보낼 사람의 계좌 번호를 입력해주세요.");
		System.out.print(">>> ");
		String ano1 = inputStr.next();
		
		System.out.println("이체할 금액을 입력해주세요.");
		System.out.print(">>> ");
		int money1 = inputInt.nextInt();
		
		System.out.println("받을 사람의 계좌 번호를 입력해주세요.");
		System.out.print(">>> ");
		String ano2 = inputStr.next();
		
		HanaAccountDTO inputAccount = findAccount(ano1, hanaBank);
		
		
	}

	
	// 계좌 이체 ================================================
	
	
	
	
	
	
	// 계좌 예금 ================================================
	private void depositAccount(Scanner inputStr, Scanner inputInt, HanaAccountDTO[] hanaBank) {

		System.out.println("입금할 계좌의 번호를 입력하세요.");
		System.out.print(">>> ");
		String ano = inputStr.next();

		System.out.println("입금할 금액을 입력하세요.");
		System.out.print(">>> ");
		int money = inputInt.nextInt();
		
		System.out.println("내 계좌 번호를 입력하세요.");
		System.out.print(">>> ");
		String myAno = inputStr.next();

		HanaAccountDTO inputAccount = findAccount(ano, hanaBank);

		for(int i=0; i<hanaBank.length; i++) {
			if(inputAccount != null || hanaBank[i].getBalnce() <= 0) {
				
			}else {
				System.out.println("존재하지 않는 계좌번호입니다.");
				return;
			}
		}
		
		inputAccount.setBalnce(inputAccount.getBalnce() + money);
		System.out.println("정상 작동 테스트 : " + inputAccount);
		System.out.println(inputAccount.getOwner() + "님 입금이 완료되었습니다.");
		System.out.println("현재 잔액 : " + inputAccount.getBalnce());

	} // 예금 메서드 종료 (depositAccount)

	// 계좌 예금 ================================================
	
	
	
	
	
	// 계좌 출금 ================================================
		private void withdrawAccount(Scanner inputStr, Scanner inputInt, HanaAccountDTO[] hanaBank) {

			System.out.println("출금할 계좌의 번호를 입력하세요.");
			System.out.print(">>> ");
			String ano = inputStr.next();

			System.out.println("출금할 금액을 입력하세요.");
			System.out.print(">>> ");
			int money = inputInt.nextInt();

			HanaAccountDTO inputAccount = findAccount(ano, hanaBank);

			if (inputAccount == null) {
				System.out.println("존재하지 않는 계좌번호입니다.");
				return;
			} // if문 종료
			
			inputAccount.setBalnce(inputAccount.getBalnce() - money);
			System.out.println("정상 작동 테스트 : " + inputAccount);
			System.out.println(inputAccount.getOwner() + "님 입금이 완료되었습니다.");
			System.out.println("현재 잔액 : " + inputAccount.getBalnce());

		} // 예금 메서드 종료 (depositAccount)

		// 계좌 출금 ================================================

	
	
	
	
	
	
	

	// 반복문 ================================================
	private HanaAccountDTO findAccount(String ano, HanaAccountDTO[] hanaBank) {
		HanaAccountDTO account = null;

		for (int i = 0; i < hanaBank.length; i++) {
			if (hanaBank[i] != null) {
				// 하나은행이 null 값이 아닐 때
				String dbano = hanaBank[i].getAno();
				// 새 객체 dbano 에 하나은행 ano를 넣는다
				if (dbano.equals(ano)) {
					// 하나은행에서 받아온 ano가 입력한 ano와 같으면
					account = hanaBank[i];
					// account 변수에 하나은행에 있는 값을 넣는다
					break;
				} // 계좌번호 비교 if문 종료
			} // hanaBank 가 null값인지 확인하는 if문 종료
		} // for문 종료

		return account;
	} // findAccount 종료
		// 반복문 ================================================

	
	
	
	// 계좌 조회 ================================================
	private void accountLists(Scanner inputStr, Scanner inputInt, HanaAccountDTO[] hanaBank) {
		System.out.println("계좌 전체 조회를 시작합니다.");

		for (int i = 0; i < hanaBank.length; i++) {
			HanaAccountDTO accountList = hanaBank[i];

			if (hanaBank[i] != null) {
				System.out.println(".................................");
				System.out.print(accountList.getAno());
				System.out.print("\t");
				System.out.print(accountList.getOwner());
				System.out.print("\t");
				System.out.print(accountList.getBalnce());
				System.out.print("\t");
				System.out.print(accountList.getBankName());
				System.out.print("은행 \t\n");
				System.out.println(".................................");
			} // if문 종료

		} // for문 종료

	}// 계좌조회 메서드 종료 (accountLists)
		// 계좌 조회 ================================================

	
	
	
	
	
	// 계좌 생성 ================================================
	private void createAccount(Scanner inputStr, Scanner inputInt, HanaAccountDTO[] hanaBank) {
		HanaAccountDTO myAccount = new HanaAccountDTO();
		System.out.println("정보 등록을 시작합니다.");

		System.out.print("계좌 번호 : ");
		myAccount.setAno(inputStr.next());

		System.out.print("계좌주 : ");
		myAccount.setOwner(inputStr.next());

		System.out.print("초기 잔액 : ");
		myAccount.setBalnce(inputInt.nextInt());
		myAccount.setBankName("하나");

		for (int i = 0; i < hanaBank.length; i++) {
			if (hanaBank[i] == null) {
				System.out.println("계좌 생성 한도에 걸렸습니다. 관리자에게 문의하세요.");
			} else {
				hanaBank[i] = myAccount;
				System.out.println("입력 테스트 : " + myAccount);
				break;
			} // if문 종료
		} // for문 종료

		System.out.println("계좌 생성이 정상적으로 처리되었습니다.");

	} // 계좌 생성 메서드 종료 (create)
		// 계좌 생성 ================================================

	
	
	
	
} // 클래스 종료 (HanaBankSercice)

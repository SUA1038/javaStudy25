package ch03;

import java.util.Scanner;

public class flowExam {

	static Scanner inputInt = new Scanner(System.in);
	static Scanner inputStr = new Scanner(System.in);
	static Scanner inputChr = new Scanner(System.in);

	public static void main(String[] args) {
		// 자판기 프로그램 구현 실습
		// 관리자 권한 설명 : 관리자 권한은 메인 메뉴에서 '1588' 입력하여 권한을 부여받은 후, 다시 메인 메뉴에서 '1100'을 입력하여 수정 페이지에 진입할 수 있다.
		
		// while문에 쓰일 boolean 객체 생성
		boolean run = true;

		// 관리자 모드에 쓰일 boolean 객체 생성
		boolean edit = false;

		// 초기 사용값
		String[] drinkMenu = { "사이다", "콜라", "커피", "코코아", "물" }; // 음료 종류
		int numMenu = 5; // 음료 종류 수
		int[] numDrink = { 16, 18, 27, 15, 40 }; // 음료 재고
		int[] price = { 1800, 1800, 2200, 2000, 1500 }; // 음료 가격
		int money = 0;
		// 판매한 것들 초기값
		String totalDrink = null;
		int totalMoney = 0;
		int totalNum = 0;

		System.out.println("=====| MBC 음료 자판기 |=====");
		System.out.println("지불할 금액을 입력하세요.");
		System.out.print(">>> ");
		money = inputInt.nextInt();
		// 지불할 금액 입력 받음

		while (run) { // 프로그램 메인 while문 시작
			System.out.println("----------------------");
			System.out.println("현재 잔액 : " + money);
			System.out.println("----------------------");
			System.out.println("1. 음료 구매하기");
			System.out.println("2. 잔액 추가하기");
			System.out.println("3. 잔돈 돌려받기");
			System.out.println("4. 영수증 출력");
			System.out.println("5. 자판기 종료");
			System.out.println("----------------------");
			System.out.print(">>> ");
			int select = inputInt.nextInt();

			switch (select) {

			case 1: // 음료 구매 메뉴
				money = drink(numMenu, edit, money, drinkMenu, price, numDrink);
				// ** money 값을 돌려받기 위해서는 return money를 적은 후, 메서드 받는 쪽에서 맨 앞에 money를 붙여야 값이 적용된다.**
				
				
				break;

			case 2: // 잔액 추가하기 메뉴
				System.out.println("추가로 지불할 금액을 입력하세요.");
				System.out.print(">>> ");
				money += inputInt.nextInt();
				System.out.println("현재 잔액 : " + money);
				break;

			case 3: // 남은 잔액 환급 메뉴
				System.out.println("현재 남은 잔액 : " + money);
				System.out.println("잔돈을 돌려받겠습니까?");
				System.out.println("1. 네 2. 아니오");
				System.out.print(">>> ");
				int subSelect = inputInt.nextInt();
				if (subSelect == 1) { // 잔돈 if문 시작
					System.out.println("남은 잔돈" + money + " 원을 반환받습니다.");
					money = 0;
				} else if (subSelect == 2) {
					System.out.println("잔돈 반환을 중지합니다.");
				} else {
					System.out.println("잘못된 선택지 입력. 다시 시도해주세요.");
				} // 잔돈 if문 종료
				break;

			case 4: // 영수증 출력 메뉴
				System.out.println("영수증을 발급합니다.");
				
				System.out.println("************************************");
				System.out.println("구매한 상품 목록 : " + totalDrink);
				System.out.println("구매한 상품 수량 : " + totalNum);
				System.out.println("총 금액 : " + totalMoney);
				System.out.println("************************************");
				
				break;
				
			case 5: // 자판기 종료 메뉴
				System.out.println("자판기 가동을 중지합니다.");
				run = false;
				break;

			case 1100 : // 관리자 메뉴 진입
				
				if (edit == true) { // 관리자 권한 확인
					System.out.println("관리자 모드에 진입하셨습니다.");
					System.out.println("1. 음료 추가");
					System.out.println("2. 음료 확인");
					System.out.println("3. 음료 수정");
					System.out.println("4. 음료 삭제");
					System.out.println("5. 돌아가기");
					System.out.print(">>> ");
					int editSelect = inputInt.nextInt();

					switch (editSelect) {
					case 1:
						editer01(numMenu, edit, money, drinkMenu, price, numDrink);
						System.out.println("음료 추가 메뉴로 진입합니다.");
						System.out.println("---------------------");
						System.out.println("추가할 음료의 수를 입력하세요.");
						System.out.print(">>> ");
						int addCount = inputInt.nextInt();

						String[] newDrinkMenu1 = new String[drinkMenu.length + addCount];
						int[] newPrice1 = new int[price.length + addCount];
						int[] newNumDrink1 = new int[numDrink.length + addCount];

						for (int i = 0; i < drinkMenu.length; i++) {
							newDrinkMenu1[i] = drinkMenu[i];
							newPrice1[i] = price[i];
							newNumDrink1[i] = numDrink[i];
						}

						// 새로운 음료 정보를 입력받고 추가
						for (int i = drinkMenu.length; i < newDrinkMenu1.length; i++) {
							System.out.println("추가할 음료의 정보를 입력해주세요.");
							System.out.print("음료 상품명: ");
							newDrinkMenu1[i] = inputStr.next();
							System.out.print("가격을 설정해주세요: ");
							newPrice1[i] = inputInt.nextInt();
							System.out.print("재고 수량을 입력해주세요: ");
							newNumDrink1[i] = inputInt.nextInt();
							System.out.println(); 
							System.out.println("상품명 : " + newDrinkMenu1[i]);
							System.out.println("가격 : " + newPrice1[i]);
							System.out.println("재고 : " + newNumDrink1[i]);
							System.out.println("해당 상품을 추가하시겠습니까?");
							System.out.println("1. 예 2. 아니오");
							System.out.print(">>> ");
							int select1 = inputInt.nextInt();
							
							if(select1 == 1) {
								drinkMenu = newDrinkMenu1;
								price = newPrice1;
								numDrink = newNumDrink1;

								System.out.println("음료가 성공적으로 추가되었습니다.");
							} else if (select1 == 2) {
								System.out.println("음료 등록을 취소합니다.");
							} else {
								System.out.println("선택 오류. 등록을 취소합니다.");
							}

							
						}
						break;

					case 2:
						editer02(numMenu, edit, money, drinkMenu, price, numDrink);
						break;

					case 3:
						editer03(numMenu, edit, money, drinkMenu, price, numDrink);
						break;

					case 4:
						editer04(numMenu, edit, money, drinkMenu, price, numDrink);
						break;
						
					case 5:
						System.out.println("메뉴로 돌아갑니다.");
						break;

					default:
						System.out.println("1~4의 보기를 입력해주세요.");
						break;

					} // for문 종료
				}

			case 1588: // 관리자 메뉴 실행
				edit = true;
				System.out.println("관리자 권한이 추가됩니다.");
				break;

			default:
				System.out.println("1~5의 보기를 골라주세요.");
				break;

			} // 메인 항목 선택 switch문 종료

		} // 프로그램 메인 while문 종료

	} // 메인 메서드 종료




	




	static int drink(int numMenu, boolean edit, int money, String[] drinkMenu, int[] price, int[] numDrink) {
		// 음료 구매 메뉴 메서드 시작

	    System.out.println("음료 구매 메뉴입니다.");
	    System.out.println("구매할 음료를 선택해주세요.");

	    // 음료 목록을 표시 
	    for (int i = 0; i < drinkMenu.length; i++) {
	        System.out.println((i+1) + ". " + drinkMenu[i] + "			" + price[i] + "원, 남은 수량 : " + numDrink[i] + "개");
	    }

	    System.out.println("----------------------");
	    System.out.print(">>> ");
	    int subSelect = inputInt.nextInt();
        int k = subSelect-1;

	    if (subSelect < 1 || subSelect > drinkMenu.length) {
	        System.out.println("잘못된 번호를 선택하셨습니다. 다시 시도해주세요.");
	        return money;
	    } else {
	    System.out.println(drinkMenu[k] + "를 구매하시겠습니까?");
	    System.out.println("1. 예, 2. 아니오");
	    System.out.print(">>> ");
	    int select = inputInt.nextInt();
	    if (select == 1) {
	        System.out.println("구매 수량을 입력해주세요.");
	        System.out.print(">>> ");
	        int numSelect = inputInt.nextInt();
	        int buyDrink = price[k] * numSelect;

	        if (money >= buyDrink && numSelect <= numDrink[k]) {
	            money -= buyDrink; // 잔액 차감
	            numDrink[k] -= numSelect; // 음료 수량 차감

	            System.out.println(drinkMenu[k] + "를 " + numSelect + "개 구매하였습니다.");
	            System.out.println("구매 가격 : " + buyDrink);
	            System.out.println("남은 잔액 : " + money);
	            System.out.println("남은 수량 : " + numDrink[k]);
	            
	            
	            
	            
	        } else {
	        	System.out.println("구매할 수 없습니다. (잔액 혹은 물건 수량 부족)");
	        } 
	        	
	    } else if (select == 2) {
	        System.out.println("구매를 취소합니다.");

	    } else {
	    	System.out.println("입력 오류. 다시 시도해주세요.");
	    }
		
		return money;
		
		} 
	    
	} // 메서드 종료
	
	
	
	static void editer01(int numMenu, boolean edit, int money, String[] drinkMenu, int[] price, int[] numDrink) {
		// 음료 추가 메서드 시작

		
		
		
	} // 음료 추가 메서드 종료

	static void editer02(int numMenu, boolean edit, int money, String[] drinkMenu, int[] price, int[] numDrink) {
		// 음료 목록 확인 메서드 시작
		
		System.out.println("음료 확인 메뉴로 진입합니다.");
		System.out.println("---------------------");
		System.out.println("현재 등록되어 있는 음료입니다.");
		for (int i = 0; i < drinkMenu.length; i++) {
			System.out.println(drinkMenu[i] + ", 가격 : " + price[i] + ", (수량 : " + numDrink[i] + ")");
		} // for문 종료
		
	} // 음료 목록 확인 메서드 종료
	
	
	static void editer03(int numMenu, boolean edit, int money, String[] drinkMenu, int[] price, int[] numDrink) {
		// 음료 수정 메서드 시작
		
		System.out.println("음료 수정 메뉴로 진입합니다.");
		System.out.println("현재 등록된 음료 목록입니다.");
		System.out.println("현재 등록되어 있는 음료입니다.");
		for (int i = 0; i < drinkMenu.length; i++) { // for문 시작1
			System.out.println(drinkMenu[i] + ", 가격 : " + price[i] + ", 수량 : " + numDrink[i]);
		} // for문 종료1
		System.out.println("수정할 음료의 이름을 작성해주세요.");
		System.out.print(">>> ");
		String editDrink = inputStr.next();
		for (int i = 0; i < drinkMenu.length; i++) { // for문 시작2
			if (editDrink.equals(drinkMenu[i])) { // if문 시작1
				System.out.println(drinkMenu[i] + ", 해당 음료를 재등록합니다.");
				System.out.print("상품명 : ");
				String newDrinkName = inputStr.next();
				System.out.print("가격 : ");
				int newDrinkprice = inputInt.nextInt();
				System.out.print("수량 : ");
				int newDrinknum = inputInt.nextInt();
				System.out.println("상품명: " + newDrinkName + ", 가격 : " + newDrinkprice + ", 수량 : "
						+ newDrinknum + "이 맞습니까?");
				System.out.println("1. 예 2. 아니오");
				System.out.print(">>> ");
				int subSelect2 = inputInt.nextInt();
				if (subSelect2 == 1) { // if문 시작2
					System.out.println("상품이 정상적으로 등록되었습니다.");
					drinkMenu[i] = newDrinkName;
					price[i] = newDrinkprice;
					numDrink[i] = newDrinknum;
				} else if (subSelect2 == 2) {
					System.out.println("상품 등록이 취소되었습니다.");
				} else {
					System.out.println("선택 오류. 등록을 취소합니다.");
				} // if 문 종료

			} // if문 종료

		} // for문 종료

	} // 음료 수정 메서드 종료
	
	
	static void editer04(int numMenu, boolean edit, int money, String[] drinkMenu, int[] price, int[] numDrink) {
		// 음료 삭제 메서드 시작
		
		System.out.println("음료 삭제 메뉴로 진입합니다.");
		System.out.println("삭제할 음료의 이름을 작성해주세요.");
		System.out.print(">>> ");
		String deleteDrink = inputStr.next();
		for (int i = 0; i < drinkMenu.length; i++) { // for문 시작2
			if (deleteDrink.equals(drinkMenu[i])) { // if문 시작1
				System.out.println(deleteDrink + ", 해당 음료를 삭제합니다.");
				System.out.println("정말 삭제하시겠습니까?");
				System.out.println("1. 예 2. 아니오");
				System.out.print(">>> ");
				int subSelect2 = inputInt.nextInt();
				if (subSelect2 == 1) { // if문 시작2
					System.out.println("상품이 정상적으로 삭제되었습니다.");
					drinkMenu[i] = null;
					price[i] = 0;
					numDrink[i] = 0;
				} else if (subSelect2 == 2) {
					System.out.println("상품 삭제가 취소되었습니다.");
				} else {
					System.out.println("선택 오류. 삭제를 취소합니다.");
				} // if 문 종료

			} else {
				System.out.println("일치하는 음료가 없습니다.");
			}
			// if문 종료 

		} // for문 종료

		
	} // 음료 삭제 메서드 종료
	
		
} // 클래스 종료
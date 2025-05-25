package ch04.MarioKart.service;

import java.util.Scanner;

import ch04.MarioKart.dto.CartDTO;
import ch04.MarioKart.dto.CharacterDTO;
import ch04.MarioKart.dto.MemberDTO;

public class CartService {

	
// menu 시작 ====================================================================================================
	public static MemberDTO menu(Scanner input, CharacterDTO[] characterDTOs, CartDTO[] cartDTOs, MemberDTO loginState) {
		System.out.println("카트 관리 메뉴입니다.");
		
		boolean subrun = true;
		
		while (subrun) {
			System.out.println("1. 캐릭터 선택 | 2. 카트 선택 | 3. 돌아가기");
			System.out.print(">>> ");
			String select = input.next();
			switch (select) {
			case "1":
				System.out.println("캐릭터를 선택합니다.");
				loginState = characterMenu(input, characterDTOs, loginState);
				break;

			case "2":
				System.out.println("카트를 선택합니다.");
				 loginState = cartMenu(input, cartDTOs, loginState);
				break;

			case "3":
				System.out.println("메인 메뉴로 돌아갑니다.");
				subrun = false;
				break;

			} // switch문 종료
			
	} // while문 종료
		
		return loginState;
	} // menu 종료
	
// menu 시작 ====================================================================================================	
	
	
	
// characterMenu 시작 ============================================================================================
	public static MemberDTO characterMenu(Scanner input, CharacterDTO[] characterDTOs, MemberDTO loginState) {
	    if (loginState == null) {
	        System.out.println("로그인이 되어 있지 않습니다. 로그인 후 이용해주세요.");
	        return loginState;
	    }	
		
		for(int i=0; i<characterDTOs.length; i++) {
			if(characterDTOs[i] !=null) {
				System.out.println(" 이름 : " + characterDTOs[i].name + " | 무게 : " + characterDTOs[i].weight);
			} // if문 종료
		} // for문 종료
		
		System.out.println("캐릭터를 선택하세요.");
		System.out.print(">>> ");
		String selectChar = input.next();
		
		for(int i=0; i<characterDTOs.length; i++) {
			if(characterDTOs[i] !=null && selectChar.equals(characterDTOs[i].name)) {
				loginState.characterDTO = characterDTOs[i]; 
			}
		} // for문 종료
		
		System.out.println(loginState.nickName + "님은 " + loginState.characterDTO.name + "(을)를 선택했습니다.");
		return loginState;
		

	} // characterMenu 종료
// characterMenu 종료 ============================================================================================
	
	
	// cartMenu 시작 ============================================================================================
		public static MemberDTO cartMenu(Scanner input, CartDTO[] cartDTOs, MemberDTO loginState) {
			
			for (int i = 0; i < cartDTOs.length; i++) {
				if (cartDTOs[i] != null) {
					System.out.println("카트명 : " + cartDTOs[i].cartName 
						+ " | 무게 : " + cartDTOs[i].cartWeight 
						+ " | 색상 : " + cartDTOs[i].cartColor 
						+ " | 속도 : " + cartDTOs[i].cartSpeed + "\n");
				} // if문 종료
			} // for문 종료
			
			System.out.println("카트를 선택하세요.");
			System.out.print(">>> ");
			String selectCart = input.next();
			
			for(int i=0; i<cartDTOs.length; i++) {
				if(cartDTOs[i] !=null && selectCart.equals(cartDTOs[i].cartName)) {
					loginState.cartDTO = cartDTOs[i]; 	 
				}
			} // for문 종료
			
			System.out.println("(" + loginState.characterDTO.name + ")" + loginState.nickName + "님은 " + loginState.cartDTO.cartName + "(을)를 선택했습니다.");
			return loginState;
		} // cartMenu 종료
	// cartMenu 종료 ============================================================================================



		
} // class 종료

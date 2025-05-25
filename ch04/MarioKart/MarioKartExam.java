package ch04.MarioKart;

import java.util.Scanner;

import ch04.MarioKart.dto.CartDTO;
import ch04.MarioKart.dto.CharacterDTO;
import ch04.MarioKart.dto.GliderDTO;
import ch04.MarioKart.dto.ItemDTO;
import ch04.MarioKart.dto.MemberDTO;
import ch04.MarioKart.dto.TireDTO;
import ch04.MarioKart.service.CartService;
import ch04.MarioKart.service.GameService;
import ch04.MarioKart.service.MemberService;

public class MarioKartExam {
	// 필드
	public static Scanner input = new Scanner(System.in); // 스캐너 생성
	public static MemberDTO[] memberDTOs = new MemberDTO[10]; // 회원 배열
	public static CharacterDTO[] characterDTOs = new CharacterDTO[5]; // 캐릭터 배열
	public static CartDTO[] cartDTOs = new CartDTO[5]; // 카트 배열
	public static GliderDTO[] gliderDTOs = new GliderDTO[10]; // 글라이더 배열
	public static TireDTO[] tireDTOs = new TireDTO[5]; // 타이어 배열
	public static ItemDTO[] itemDTOs = new ItemDTO[10];	 // 아이템배열
	
	public static MemberDTO loginState;
	
	
	// 생성자
	static {
		CharacterDTO characterDTO1 = new CharacterDTO("마리오", 3.5, 3.8, 3.6, 3.2);
		CharacterDTO characterDTO2 = new CharacterDTO("루이지", 3.4, 3.5, 3.8, 3.7);
		CharacterDTO characterDTO3 = new CharacterDTO("쿠파", 3.3, 4.2, 4.0, 3.1);
		CharacterDTO characterDTO4 = new CharacterDTO("데이지", 3.6, 3.2, 3.5, 4.0);
		CharacterDTO characterDTO5 = new CharacterDTO("피치", 3.8, 3.4, 3.3, 3.5);
		
		characterDTOs[0] = characterDTO1 ;
		characterDTOs[1] = characterDTO2 ;
		characterDTOs[2] = characterDTO3 ;
		characterDTOs[3] = characterDTO4 ;
		characterDTOs[4] = characterDTO5 ;
		
	}

	static {
		CartDTO cartDTO1 = new CartDTO("람보르기니", "빨강", 5.0, 4.2, 5.3);
		CartDTO cartDTO2 = new CartDTO("페라리", "노랑", 4.7, 4.5, 5.6);
		CartDTO cartDTO3 = new CartDTO("부가티", "파랑", 4.6, 4.7, 5.7);
		CartDTO cartDTO4 = new CartDTO("포르쉐", "초록", 5.2, 4.3, 5.1);
		CartDTO cartDTO5 = new CartDTO("쿠페", "검정", 5.5, 4.9, 4.8);
		
		cartDTOs[0] = cartDTO1;
		cartDTOs[1] = cartDTO2;
		cartDTOs[2] = cartDTO3;
		cartDTOs[3] = cartDTO4;
		cartDTOs[4] = cartDTO5;
				
	}
	
	
	// 메서드
	
	
	
	
	
	
	public static void main(String[] args) {

		System.out.println("===== 마리오카트 게임 프로그램을 시작합니다. =====");
		
		boolean run = true;
		while(run) {
			System.out.println("1. 회원 관리 | 2. 카트 관리 | 3. 게임 시작 | 4. 프로그램 종료");
			System.out.print(">>> ");
			String select = input.next();
			
			switch(select) {
			case "1" :
				System.out.println("회원 관리로 이동합니다.");
				MemberService memberService = new MemberService();
				loginState = memberService.menu(input, memberDTOs, loginState);
				break;
			
			case "2" :
				System.out.println("카트 관리로 이동합니다.");
				CartService cartService = new CartService();
				
				loginState = CartService.menu(input, characterDTOs, cartDTOs, loginState);
				
				break;
				
			case "3" :
				System.out.println("게임을 시작합니다.");
				GameService.menu(input, characterDTOs, cartDTOs, memberDTOs,loginState);
				System.out.println("게임을 종료합니다.");
				run = false;
				break;
				
			case "4" :
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
				
			default :
				System.out.println("입력 오류. 1~4 의 값을 입력해주세요.");
				break;
			} // switch문 종료
			
			
		} // while문 종료
		
	} // main 종료

} // class 종료

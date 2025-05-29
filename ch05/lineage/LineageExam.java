package ch05.lineage;

import java.util.Scanner;

import ch05.lineage.DTO.AccountDTO;
import ch05.lineage.DTO.ElfDTO;
import ch05.lineage.DTO.KinghtDTO;
import ch05.lineage.service.LoginService;

public class LineageExam {

	// 스캐너
	public static Scanner inputStr = new Scanner(System.in);
	public static Scanner inputInt = new Scanner(System.in);
	
	// 로그인 객체
	public static AccountDTO[] accountDTOs = new AccountDTO[10];
	// 로그인 성공 시 세션 객체
	public static AccountDTO loginAccount;
	 
	// 기사 엘프 캐릭터 객체
	public static KinghtDTO kinghtDTO = new KinghtDTO();
	public static ElfDTO elfDTO = new ElfDTO();
	
	
	static {
		
		kinghtDTO.setSowrd("한손 검");
		kinghtDTO.setArmor("징 박힌 갑옷");
		kinghtDTO.setShield("징 박힌 방패");
		kinghtDTO.setName("기사");
		kinghtDTO.setGender("남성");
		kinghtDTO.setLeverl("1");
		kinghtDTO.setHp(5000);
		kinghtDTO.setMp(30);
		kinghtDTO.setMoney(50000);
		
		
		elfDTO.setBow("양손 활");
		elfDTO.setDress("천사드레스");
		elfDTO.setArrow("독화살");
		elfDTO.setName("요정");
		elfDTO.setGender("여성");
		elfDTO.setLevel("1");
		elfDTO.setHp(3000);
		elfDTO.setMp(2000);
		elfDTO.setMoney(70000);
		
		
		AccountDTO accountDTO = new AccountDTO();
		// 테스트용 계정 생성
		
		accountDTO.setId("idid");
		accountDTO.setPw("pwpw");
		accountDTO.setNickName("NAME");
		accountDTO.setEmail("123@gmail.com");
		
		accountDTOs[0] = accountDTO;
		// 배열 0번에 계정 객체 연결
	}
	
	
	public static void main(String[] args) {
		// 리지니 게임 프로그램 메인 메뉴
		
		System.out.println("=== 리니지 게임을 실행합니다. ===");
		boolean run = true;
		
		while (run) {
			System.out.println("1. 로그인 | 2. 캐릭터 생성 | 3. 게임 시작 | 4. 게임 종료");
			System.out.print(">>> ");
			String select = inputStr.next();
			
			
			switch(select) {
			case "1" :
				System.out.println("로그인을 시작합니다.");
				loginAccount = LoginService.menu(inputStr, inputInt, loginAccount, accountDTOs);
				break;
				
			case "2" :
				System.out.println("캐릭터 생성을 시작합니다.");
				break;
				
			case "3" :
				System.out.println("리니지 게임을 시작합니다.");
				break;
				
			case "4" :
				System.out.println("=== 리니지 게임을 종료합니다. ===");
				run = false; 
				break;
				
			default :
				System.out.println("선택 오류. 1~4의 값을 입력해주세요.");
				break;
			
			} // 메인 메뉴 선택문 switch 종료
			
			
			
			
		} // 메인 메뉴 반복문 while 종료
		
		
		
		
		

	} // main 메서드 종료

} // class종료

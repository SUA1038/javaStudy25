package JavaTest.service;

import java.util.Scanner;

import JavaTest.DTO.MemberDTO;

public class LoginService {

	public MemberDTO menu(Scanner inputStr, Scanner inputInt, MemberDTO[] memberDTOs, MemberDTO loginState) {
		
		
		boolean run = true;
		while(run) {
			System.out.println("1. 로그인 | 2. 회원가입 | 3. 내 정보 확인 | 4. 전체 정보 확인 | 5. 회원탈퇴 | 6. 메뉴로 돌아가기");
			System.out.print(">>> ");
			String select = inputStr.next();
			
			switch(select) {
			case "1" :
				System.out.println("로그인을 진행합니다.");
				loginState = login(inputStr, memberDTOs, loginState);
				break;
				
			case "2" :
				System.out.println("회원가입을 진행합니다.");
				create(inputStr, inputInt, memberDTOs);
				break;
				
			case "3" :
				System.out.println("내 정보를 확인합니다.");
				readOne(memberDTOs, loginState, inputStr);
				break;
				
			case "4" :
				System.out.println("전체 정보를 확인합니다. (관리자용)");
				break;
				
			case "5" :
				System.out.println("회원탈퇴를 진행합니다.");
				delete(inputStr, inputInt, memberDTOs, loginState);
				break;
				
			case "6" :
				System.out.println("메인 메뉴로 돌아갑니다.");
				run = false;
				break;
				
			default :
				System.out.println("입력 오류. 1~6의 값을 입력해주세요.");
			
			} // 부메뉴 선택문 switch 종료
			
		} // 부메뉴 while문 종료

		
		return loginState;

	} // menu 종료

	
	
	
	
	// 회원 탈퇴 메서드 ---------------------------------------------------------------
	private void delete(Scanner inputStr, Scanner inputInt, MemberDTO[] memberDTOs, MemberDTO loginState) {
		MemberDTO deleteMember = new MemberDTO();
		System.out.println("삭제할 계정의 ID를 입력하세요.");
		System.out.print(">>> ");
		deleteMember.setId(inputStr.next());
		System.out.println("삭제할 계정의 PW를 입력하세요.");
		System.out.print(">>> ");
		deleteMember.setPw(inputStr.next());

		for (int i = 0; i < memberDTOs.length; i++)
			if (memberDTOs[i] != null && memberDTOs[i].getId().equals(deleteMember.getId())
					&& memberDTOs[i].getPw().equals(deleteMember.getPw())) {

				memberDTOs[i] = null;

				loginState.setId(null);
				loginState.setPw(null);
				loginState.setName(null);
				loginState.setStudentNum(0);

				System.out.println("회원 탈퇴가 완료되었습니다.");

			} else {
				System.out.println("ID 혹은 PW 불일치. 다시 한번 시도해주세요.");
				break;
			}
		
		
	} // 회원 탈퇴 메서드 종료 ---------------------------------------------------------------






	// 내 정보 확인 메서드 ---------------------------------------------------------------
	private void readOne(MemberDTO[] memberDTOs, MemberDTO loginState, Scanner inputStr) {
		
		System.out.println("회원 정보 조회를 위하여 ID를 입력해주세요.");
		MemberDTO loginMember = new MemberDTO();
		System.out.print("ID : ");
		String id = inputStr.next();

		for (int i = 0; i < memberDTOs.length; i++) {
			if (memberDTOs[i] != null && memberDTOs[i].getId().equals(id)) {
				System.out.println("내 정보를 확인합니다.");
				System.out.println("===========================");
				System.out.println("이름 : " + memberDTOs[i].getName());
				System.out.println("ID : " + memberDTOs[i].getId());
				System.out.println("PW : " + memberDTOs[i].getPw());
				System.out.println("학생번호 : " + memberDTOs[i].getStudentNum());
				System.out.println("===========================");
				break;
			} else {
				System.out.println("ID 혹은 PW가 일치하지 않습니다.");
				break;
			} // if문 종료
		} // for문 종료

		
		
	} // 내 정보 확인 메서드 종료---------------------------------------------------------------



	// 로그인 메서드 ---------------------------------------------------------------
	private MemberDTO login(Scanner inputStr, MemberDTO[] memberDTOs, MemberDTO loginState) {
		System.out.print("ID : ");
		String id = inputStr.next();
		System.out.print("PW : ");
		String pw = inputStr.next();

	        for (int i = 0; i < memberDTOs.length; i++) {
	            MemberDTO memberDTO = memberDTOs[i];
	            if (memberDTO != null && memberDTO.getId().equals(id) && memberDTO.getPw().equals(pw)) {
	                System.out.println(memberDTO.getName() + "님 환영합니다!");
	                return memberDTO; // 로그인 성공 시 해당 회원 반환
	            } // if문 종료
	        } // for문 종료
	    

	        System.out.println("아이디 또는 비밀번호가 올바르지 않습니다.");
	        return null; 
	    
		
	} // 로그인 메서드 종료 ---------------------------------------------------------------




	// 회원가입 메서드 ---------------------------------------------------------------
	private void create(Scanner inputStr, Scanner inputInt, MemberDTO[] memberDTOs) { 
		MemberDTO memberDTO = new MemberDTO();
		
		System.out.print("이름 : ");
		memberDTO.setName(inputStr.next());
		
		System.out.print("ID : ");
		memberDTO.setId(inputStr.next());
		
		System.out.print("PW : ");
		memberDTO.setPw(inputStr.next());
		
		System.out.print("학생번호 : ");
		memberDTO.setStudentNum(inputInt.nextInt());
		
		for(int i=0; i<memberDTOs.length; i++) {
			if(memberDTOs[i] == null) {
				memberDTOs[i] = memberDTO;
				System.out.println(memberDTOs[i].getName() + "님, 회원가입에 성공했습니다.");
				break;
			}// if문 종료
		} // for문 종료
		
		System.out.println("테스트 : " + memberDTO);
		
	}// 회원가입 메서드 종료 ---------------------------------------------------------------



} // 클래스 종료

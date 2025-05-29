package ch04.MarioKart.service;

import java.util.Scanner;

import ch04.MarioKart.dto.MemberDTO;

public class MemberService {
	// 부메뉴

	public MemberDTO menu(Scanner input, MemberDTO[] memberDTOs, MemberDTO loginState) {
		boolean subrun = true;

		while (subrun) {
			System.out.println("1. 회원가입 | 2. 로그인 | 3. 내 정보 확인 | 4. 회원 정보 수정 | 5. 회원 탈퇴 | 6. 돌아가기");
			System.out.print(">>> ");
			String select = input.next();

			switch (select) {
			case "1":
				System.out.println("회원 가입 메뉴로 진입합니다.");
				create(input, memberDTOs);
				break;

			case "2":
				System.out.println("로그인 메뉴로 진입합니다.");
				loginState = login(input, memberDTOs, loginState, subrun);
				break;

			case "3":
				System.out.println("내 정보 확인 메뉴로 진입합니다.");
				loginState = viewProfile(memberDTOs, loginState);
				break;

			case "4":
				System.out.println("회원 정보 수정 메뉴로 진입합니다.");
				modify(input, memberDTOs, loginState);
				break;

			case "5":
				System.out.println("회원 탈퇴 메뉴로 진입합니다.");
				delete(input, memberDTOs, loginState);
				break;

			case "6":
				System.out.println("메인 메뉴로 이동합니다.");
				subrun = false;
				break;

			default:
				System.out.println("선택 오류. 1~5 의 값을 입력해주세요.");
			} // switch문 종료

		} // while문 종료

		return loginState;
	} // menu 종료

// 내 프로필 보기 ===========================================================
	MemberDTO viewProfile(MemberDTO[] memberDTOs, MemberDTO loginState) {

		System.out.println("내 정보를 확인합니다.");
		
		if (loginState == null || loginState == null) {
			System.out.println("로그인이 필요한 서비스입니다.");
		} else {
			System.out.println("================================");
			System.out.println("내 ID : " + loginState.getId());
			System.out.println("내 PW : " + loginState.getPw());
			System.out.println("내 닉네임 : " + loginState.getNickName());
			System.out.println("내 이메일 : " + loginState.getEmail());
			System.out.println("================================");	
		}


		return loginState;
	}
// 내 프로필 보기 ===========================================================

// 계정 생성 create ===========================================================
	void create(Scanner input, MemberDTO[] memberDTOs) {
		MemberDTO memberDTO = new MemberDTO();
		System.out.println("사용할 ID를 입력해주세요.");
		System.out.print(">>> ");
		memberDTO.setId(input.next());

		System.out.println("사용할 PW를 입력해주세요.");
		System.out.print(">>> ");
		memberDTO.setPw(input.next());

		System.out.println("사용할 닉네임을 입력해주세요.");
		System.out.print(">>> ");
		memberDTO.setNickName(input.next());

		System.out.println("사용할 이메일을 입력해주세요.");
		System.out.print(">>> ");
		memberDTO.setEmail(input.next());

		for (int i = 0; i < memberDTOs.length; i++) {
			if (memberDTOs[i] == null) {
				memberDTOs[i] = memberDTO;
			} // if문 종료
		} // for문 종료
		System.out.println(memberDTO.getNickName() + "님, 회원가입이 완료되었습니다.");
	} // create 종료
// 계정 생성 create ===========================================================

// 로그인 login ==============================================================	
	public MemberDTO login(Scanner input, MemberDTO[] memberDTOs, MemberDTO loginState, boolean subrun) {

		System.out.println("로그인할 ID를 입력해주세요.");
		MemberDTO loginMember = new MemberDTO();
		System.out.print(">>> ");
		loginMember.setId(input.next());

		System.out.println("로그인할 PW를 입력해주세요.");
		System.out.print(">>> ");
		loginMember.setPw(input.next());

		for (int i = 0; i < memberDTOs.length; i++) {
			if (memberDTOs[i] != null && memberDTOs[i].getId().equals(loginMember.getId())
					&& memberDTOs[i].getPw().equals(loginMember.getPw())) {
				System.out.println("ID & PW 일치 확인.");

				loginState = memberDTOs[i];
			} else {
				System.out.println("ID 혹은 PW가 일치하지 않습니다.");
				subrun = false;
			}

		} // for문 종료
		System.out.println(loginState.getNickName() + "님, 로그인에 성공하셨습니다.");

		return loginState;
	} // login 종료
// 로그인 login ==============================================================

// 회원 정보 수정 ==============================================================
	private void modify(Scanner input, MemberDTO[] memberDTOs, MemberDTO loginState) {
		MemberDTO modifyMember = new MemberDTO();
		System.out.println("ID를 입력하세요.");
		System.out.print(">>> ");
		modifyMember.setId(input.next());
		System.out.println("PW를 입력하세요.");
		System.out.print(">>> ");
		modifyMember.setPw(input.next());

		if (loginState.getId().equals(modifyMember.getId()) && loginState.getPw().equals(modifyMember.getPw())) {
			System.out.println("새 PW를 입력하세요.");
			System.out.print(">>> ");
			loginState.setPw(input.next());
			System.out.println("새 닉네임을 입력하세요.");
			System.out.print(">>> ");
			loginState.setNickName(input.next());
		} // if문 종료
	} // modify 종료
// 회원 정보 수정 ==============================================================

// 회원 정보 삭제 ==============================================================
	void delete(Scanner input, MemberDTO[] memberDTOs, MemberDTO loginState) {
		MemberDTO deleteMember = new MemberDTO();
		System.out.println("삭제할 계정의 ID를 입력하세요.");
		System.out.print(">>> ");
		deleteMember.setId(input.next());
		System.out.println("삭제할 계정의 PW를 입력하세요.");
		System.out.print(">>> ");
		deleteMember.setPw(input.next());

		for (int i = 0; i < memberDTOs.length; i++)
			if (memberDTOs[i] != null && memberDTOs[i].getId().equals(deleteMember.getId())
					&& memberDTOs[i].getPw().equals(deleteMember.getPw())) {

				memberDTOs[i] = null;

				loginState.setId(null);
				loginState.setPw(null);
				loginState.setNickName(null);
				loginState.setEmail(null);

				System.out.println("회원 탈퇴가 완료되었습니다.");

			} else {
				System.out.println("ID 혹은 PW 불일치. 다시 한번 시도해주세요.");
			}

	} // delete 종료
// 회원 정보 삭제 ==============================================================

} // class 종료

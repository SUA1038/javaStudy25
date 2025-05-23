package ch04;

import java.util.Scanner;

public class Member {

	Scanner input = new Scanner(System.in);
	public int mno; // 회원번호 객체 생성
	public String id; // 회원 ID 객체 생성
	public String pw; // 회원 PW 객체 생성

	// 생성자 : main으로 호출할 때 동작
	public Member() {

	} // Member 종료

	public Member memberAdd() { // 회원가입
		Member member = new Member(); // 리턴용 객체

		System.out.println("회원가입을 진행합니다.");

		System.out.println("회원번호를 작성해주세요.");
		System.out.print(">>> ");
		member.mno = input.nextInt();

		System.out.println("ID를 작성해주세요.");
		System.out.print(">>> ");
		member.id = input.next();

		System.out.println("PW를 작성해주세요.");
		System.out.print(">>> ");
		member.pw = input.next();

		return member;
	} // memberAdd end

	public void memberList(Member[] members) { // 회원 정보 확인, Member[] member을 가져옴

		System.out.println("회원 정보를 조회합니다.");
		System.out.println("현재 등록된 회원 목록입니다.");
		for (int i = 0; i < members.length; i++) {
			System.out.println("회원번호 : " + members[i].mno + " | ID : " + members[i].id + " | PW : " + members[i].pw);
			System.out.println("---------------------------------------------------------------");
		} // for end

	} // memberList end

	public void memberLogin(Member[] members) { // 회원 로그인

		System.out.println("로그인을 진행합니다.");
		System.out.println("ID를 입력해주세요.");
		System.out.print(">>> ");
		String ID = input.next();
		System.out.println("PW를 입력해주세요.");
		System.out.print(">>> ");
		String PW = input.next();

		for (int i = 0; i < members.length;) {
			if ((ID.equals(members[i].id)) || (PW.equals(members[i].pw))) {
				System.out.println(members[i] + " 님, 로그인에 성공했습니다.");
			} else {
				System.out.println("로그인에 실패했습니다. ID 혹은 PW 오류.");
			} // if end

		} // for end

	} // memberLogin end

	public void memberUpdate() {

		System.out.println("회원 정보를 수정합니다.");

	} // memberUpdate end

	public void memberDelete() {

		System.out.println("회원 정보를 삭제합니다.");

	} // memberDelete end

} // 클래스 종료

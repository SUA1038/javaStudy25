package ch04;

import java.util.Scanner;

public class MemberObjExam {

	public static void main(String[] args) {
		// Member 클래스를 호출하여 작업한다.

		Scanner input = new Scanner(System.in);
		Member[] members = null;

		boolean run = true;

		System.out.println("가입할 회원 수를 입력하세요.");
		System.out.print(">>> ");
		int count = input.nextInt(); // 키보드로 숫자 입력
		members = new Member[count]; // 키보드로 입력한 숫자만큼 배열 생성
		


		while (run) {
			
			System.out.println("==| 회원가입 프로그램 실행 |==");
			System.out.println("1. 회원가입");
			System.out.println("2. 회원 조회");
			System.out.println("3. 로그인");
			System.out.println("4. 회원정보 수정");
			System.out.println("5. 회원탈퇴");
			System.out.println("1~5의 숫자를 입력하세요. 외의 값은 프로그램을 종료시킵니다.");
			System.out.print(">>> ");
			int select = input.nextInt();
			
			switch (select) {

			case 1:
				Member member1 = new Member(); // 객체 생성
				for (int i = 0; i < members.length; i++) {
					member1 = member1.memberAdd(); // 생성된 객체 메서드 호출 및 실행
					members[i] = member1;
				}
				break;

			case 2:
				Member member2 = new Member();
				member2.memberList(members); // 회원 조회 가져오기
				break;

			case 3:
				Member member3 = new Member();
				member3.memberLogin(members); // 로그인 가져오기
				break;

			case 4:
				Member member4 = new Member();
				member4.memberUpdate(); // 회원정보 수정 가져오기
				break;

			case 5:
				Member member5 = new Member();
				member5.memberDelete(); // 회원탈퇴 가져오기
				break;

			default:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;

			} // switch end

		} // while end

	} // method end

} // class end

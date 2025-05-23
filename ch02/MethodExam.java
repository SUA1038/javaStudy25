package ch02;

import java.util.Scanner;

public class MethodExam {

	public static void main(String[] args) {
		// 성적 처리 시스템을 메서드로 깔끔하게 작성해보기

		// 교직원 정보 입력
		String TName1 = "김기원";
		int TAge1 = 20;
		String TGender1 = "남성";

		Scanner inputInt = new Scanner(System.in);

		boolean run = true;
		String id = "kimsua";
		String pw = "1234";

		boolean session = false;

		while (run) {
			System.out.println("==| MBC 아카데미 성적 처리 프로그램 |==");
			System.out.println("1. 로그인");
			System.out.println("2. 교직원 관리");
			System.out.println("3. 학생 관리");
			System.out.println("4. 성적 관리");
			System.out.println("9. 프로그램 종료");
			System.out.print(">>> ");
			int select = inputInt.nextInt();

			switch (select) {
			case 1:
				System.out.println("로그인 메뉴로 이동합니다.");
				session = login(id, pw, session);

				if (session == true) {
					System.out.println(id + " 님, 환영합니다.");
					System.out.println("2~4 메뉴를 사용하실 수 있습니다.");
				} else {
					System.out.println("로그인에 다시 시도해주세요.");
				}
				// if문 종료
				break;

			case 2:
				if (session == true) {
					System.out.println("교직원 관리 메뉴로 이동합니다.");
					session = teacher(session, TName1, TAge1, TGender1);
				} else {
					System.out.println("로그인 후 이용 가능합니다.");
				}

				break;

			case 3:
				System.out.println("학생 관리 메뉴로 이동합니다.");
				if (session == true) {
					session = student(session);
				} else {
					System.out.println("로그인 후 이용 가능합니다.");
				}

				break;

			case 4:
				System.out.println("성적 관리 메뉴로 이동합니다.");
				if (session == true) {
					session = score(session);
				} else {
					System.out.println("로그인 후 이용 가능합니다.");
				}
				break;

			case 9:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;

			default:
				System.out.println("입력 오류. 1~4 사이 값을 입력해주세요.");
				break;

			} // switch end

		} // while end

	} // main method end

	static boolean login(String id, String pw, boolean session) {
		// login method 생성
		Scanner inputLogin = new Scanner(System.in);

		System.out.print("ID : ");
		String inputID = inputLogin.next();
		System.out.print("PW : ");
		String inputPW = inputLogin.next();

		if (id.equals(inputID) && pw.equals(inputPW)) {
			session = true;
			System.out.println("ID, PW 일치 확인.");
			System.out.println("로그인에 성공했습니다.");
		} else {
			System.out.println("ID 혹은 PW가 일치하지 않습니다.");
			System.out.println("로그인에 실패했습니다.");
			session = false;
		} // id equals if end
		return session;
	} // login method end

	static boolean teacher(boolean session, String tName1, int tAge1, String tGender1) {
		// 교직원 관리 method 생성
		Scanner inputChar = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);

		System.out.println("a. 교직원 추가");
		System.out.println("b. 교직원 조회");
		System.out.println("c. 교직원 수정");
		System.out.println("d. 교직원 삭제");
		System.out.print(">>> ");
		char subSelect = inputChar.next().charAt(0);

		boolean addTeaher = true;
		boolean reedTeacher = true;

		switch (subSelect) {

		case 'a':
		case 'A':
			teacherA(addTeaher);
			break;

		case 'b':
		case 'B':
			teacherB(reedTeacher, tName1, tAge1, tGender1);
			break;

		case 'c':
		case 'C':
			teacherC(tName1, tAge1, tGender1);
			
			break;

		case 'd':
		case 'D':
			System.out.println("교직원 삭제 메뉴로 이동합니다.");
			// 삭제하는 방법을 배우지 못했다............

			break;

		default:
			System.out.println("a~d 값을 입력해주세요.");
			break;

		} // 교직원 관리 메뉴 switch end

		return session;

	}// 교직원 관리 method 종료

	private static void teacherA(boolean addTeaher) {
		// 교직원 추가 method
		Scanner inputChar = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);

		System.out.println("교직원 추가 메뉴로 이동합니다.");
		System.out.println("추가할 교직원의 이름을 입력해주세요.");
		System.out.print(">>> ");
		String newTName = inputStr.next();
		System.out.println("추가할 교직원의 나이를 입력해주세요.");
		System.out.print(">>> ");
		int newTAge = inputInt.nextInt();
		System.out.println("추가할 교직원의 성별을 입력해주세요.");
		System.out.print(">>> ");
		String newTGender = inputStr.next();

		System.out.println(newTAge + "세 " + newTGender + " " + newTName + " 님이 정상적으로 추가되었습니다.");
	} // 교직원 추가 method end

	private static void teacherB(boolean reedTeacher, String tName1, int tAge1, String tGender1) {
		// 교직원 조회 method 시작

		Scanner inputChar = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);

		System.out.println("교직원 조회 메뉴로 이동합니다.");

		System.out.println("1. 전체 교직원 확인");
		System.out.println("2. 교직원 직접 검색");
		System.out.print(">>> ");
		int subSelect2 = inputInt.nextInt();

		switch (subSelect2) {

		case 1:
			System.out.println("현재 등록되어 있는 교직원의 목록");
			System.out.println(tName1 + ": " + tAge1 + "세 " + tGender1);
			break;

		case 2:
			System.out.println("조회할 교직원의 이름을 작성해주세요.");
			System.out.print(">>> ");
			String reedTName = inputStr.next();

			if (reedTName.equals(tName1)) {
				System.out.println(tName1 + " 님을 조회합니다.");
				System.out.println(tName1 + ": " + tAge1 + "세 " + tGender1);
			} else {
				System.out.println(reedTName + " 님은 등록되지 않은 교직원입니다.");

			} // if end
		} // 교직원 조회 method 종료
		
		
	}// switch end
	
	private static void teacherC(String tName1, int tAge1, String tGender1) {
		// 교직원 수정 method 시작
		
		Scanner inputChar = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);		
		
		System.out.println("교직원 수정 메뉴로 이동합니다.");
		System.out.println("수정할 교직원의 이름을 입력하세요.");
		System.out.print(">>> ");
		String editTName = inputStr.next();

		if (editTName.equals(tName1)) {
			System.out.println(tName1 + " 님의 정보를 수정합니다.");
			System.out.println("현재 " + tName1 + "님의 정보입니다.");
			System.out.println("이름 : " + tName1);
			System.out.println("나이 : " + tAge1);
			System.out.println("성별 : " + tGender1);
			System.out.println("신규 정보를 입력해주세요.");
			System.out.print("이름 : ");
			String newTName1 = inputStr.next();
			System.out.print("나이 : ");
			int newTAge1 = inputInt.nextInt();
			System.out.print("성별 : ");
			String newTGender1 = inputStr.next();

			System.out.println(newTAge1 + "세 " + newTGender1 + " " + newTName1 + " 님이 정상적으로 수정되었습니다.");
			tName1 = newTName1;
			tAge1 = newTAge1;
			tGender1 = newTGender1;

		} // if end

		
	} // 교직원 수정 method end

	private static boolean student(boolean session) {
		// 학생 관리 method 시작
		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		Scanner inputchar = new Scanner(System.in);

		System.out.println("a. 학생 추가");
		System.out.println("b. 학생 조회");
		System.out.println("c. 학생 수정");
		System.out.println("d. 학생 삭제");
		System.out.print(">>> ");
		char subSelect = inputchar.next().charAt(0);

		switch (subSelect) {

		case 'a':
		case 'A':
			System.out.println("학생 추가 메뉴로 이동합니다.");
			break;

		case 'b':
		case 'B':
			System.out.println("학생 조회 메뉴로 이동합니다.");
			break;

		case 'c':
		case 'C':
			System.out.println("학생 수정 메뉴로 이동합니다.");
			break;

		case 'd':
		case 'D':
			System.out.println("학생 삭제 메뉴로 이동합니다.");
			break;

		} // switch end

		return session;
	} // 학생 관리 method end

	static boolean score(boolean session) {
		// 성적 관리 method start
		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		Scanner inputchar = new Scanner(System.in);

		System.out.println("a. 성적 등록");
		System.out.println("b. 성적 조회");
		System.out.println("c. 성적 수정");
		System.out.println("d. 성적 삭제");
		System.out.println("e. 성적 평균 계산");
		System.out.print(">>> ");
		char subSelect = inputchar.next().charAt(0);

		switch (subSelect) {

		case 'a':
		case 'A':
			System.out.println("성적 등록 메뉴로 이동합니다.");
			break;

		case 'b':
		case 'B':
			System.out.println("성적 조회 메뉴로 이동합니다.");
			break;

		case 'c':
		case 'C':
			System.out.println("성적 수정 메뉴로 이동합니다.");
			break;

		case 'd':
		case 'D':
			System.out.println("성적 삭제 메뉴로 이동합니다.");
			break;

		case 'e':
		case 'E':
			System.out.println("성적 평균 계산 메뉴로 이동합니다.");
			break;

		} // switch end

		return false;
	} // 성적 관리 method end

} // class end

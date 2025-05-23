package ch03;

import java.util.Scanner;

public class ArrayInputExam {

	public static void main(String[] args) {
		// 키보드로 입력받은 값을 배열에 저장 후 CRUD 테스트
		// C 성적을 입력
		// R 성적을 보기 (전체, 1개 보기)
		// U 성적을 수정
		// D 성적을 삭제
		// 개선사항 -> 성적 입력 시 NULL 값을 보고 넣어보기
		
		Scanner inputInt = new Scanner(System.in);
		
		System.out.println("=====| 엠비씨 성적처리 프로그램 |====");
		System.out.println("학생 수를 입력해주세요.");
		System.out.print(">>> ");
		int count = inputInt.nextInt();
		System.out.println(count + "명의 학생 데이터를 관리합니다.");
		
		String[] names = new String[count];	// 이름 배열
		int[] kors = new int[count];		// 국어 점수 배열
		int[] mats = new int[count];		// 수학 점수 배열
		int[] engs = new int[count];		// 영어 점수 배열
		// 국어, 영어, 수학 점수의 배열을 학생명 수만큼 만듦
		
		boolean run = true;
		
		while (run) {
			System.out.println("***** 성적 처리 *****");
			System.out.println("1. 성적 입력");
			System.out.println("2. 전체 성적 보기");
			System.out.println("3. 개인 성적 보기");
			System.out.println("4. 성적 수정하기");
			System.out.println("5. 성적 삭제하기");
			System.out.println("9. 프로그램 종료");
			System.out.print(">>> ");
			int select = inputInt.nextInt();
			
			switch (select) {
			case 1 :
				System.out.println("성적 입력 메뉴입니다.");
				// 메서드를 생성할 때는 입력 값과 출력 값을 먼저 생각해야 한다.
				scoreAdd(names, kors, mats, engs);
				
				break;
				
			case 2 :
				System.out.println("전체 성적 보기 메뉴입니다.");
				break;
				
			case 3 :
				System.out.println("개인 성적 보기 메뉴입니다.");
				break;
				
			case 4 :
				System.out.println("성적 수정하기 메뉴입니다.");
				break;
				
			case 5 :
				System.out.println("성적 삭제하기 메뉴입니다.");
				break;
				
			case 9 :
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			
			} // switch end
			
			
		} // while end

	} // main method end

	static void scoreAdd(String[] names, int[] kors, int[] mats, int[] engs) {
		// main에서 만든 배열 4개를 키보드로 값을 넣는다.
		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		
		for(int i=0; i<names.length; i++) {
			System.out.println("이름을 입력하세요.");
			System.out.print(">>> ");
			names[i] = inputStr.next();
			
			System.out.println("국어 점수 : ");
			kors[i] = inputInt.nextInt();
			
			System.out.println("수학 점수 : ");
			mats[i] = inputInt.nextInt();
			
			System.out.println("영어 점수 : ");
			engs[i] = inputInt.nextInt();
		} // for end
		
		System.out.println("성적 입력이 완료되었습니다.");
		
	} // scoreAdd method end

} // class end

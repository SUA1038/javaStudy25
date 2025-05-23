package ch04;

import java.util.Scanner;

public class RankingExam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] names = null;
		String[] ids = null;
		String[] pws = null;
		Ranking[] grades = null;
		
		
		System.out.println("등록할 회원의 인원을 작성하세요.");
		System.out.print(">>> ");
		int count = input.nextInt();
		
		names = new String[count];
		ids = new String[count];
		pws = new String[count];
		grades = new Ranking[count];
		
		System.out.println("회원가입을 진행합니다.");
		
		for(int i=0; i<names.length; i++) {
		System.out.println("사용하실 이름을 작성해주세요.");
		System.out.print(">>> ");
		names[i] = input.next();
		System.out.println("사용하실 ID를 작성해주세요.");
		System.out.print(">>> ");
		ids[i] = input.next();
		System.out.println("사용하실 PW를 작성해주세요.");
		System.out.print(">>> ");
		pws[i] = input.next();
		System.out.println("해당되는 등급을 선택해주세요. ");
		System.out.println("1. GUEST | 2. MEMBER | 3. VIP | 4. VVIP | 5.VVVIP | 6.VVVIP");
		System.out.print(">>> ");
		String grade = input.next();
		
		switch(grade) {
		case "1" :
			grades[i] = Ranking.GUEST;
			System.out.println("방문자 등급으로 등록되었습니다.");
			break;
			
		case "2" :
			grades[i] = Ranking.MEMBER;
			System.out.println("손님 등급으로 등록되었습니다.");
			break;
			
		case "3" :
			grades[i] = Ranking.VIP;
			System.out.println("고급 손님 등급으로 등록되었습니다.");
			break;
			
		case "4" :
			grades[i] = Ranking.VVIP;
			System.out.println("최고급 손님 등급으로 등록되었습니다.");
			break;
			
		case "5" :
			grades[i] = Ranking.VVVIP;
			System.out.println("초특급 우대 손님 등급으로 등록되었습니다.");
			break;
			
		case "9" :
			grades[i] = Ranking.MANAGER;
			System.out.println("관리자 등급으로 등록되었습니다.");
			break;
			
		default :
			System.out.println("오류 발생. 잘못된 입력입니다.");
			break;
		} // switch문 종료
		
		System.out.println(names[i] + "님, " + grades[i] + "등급으로 가입 완료되었습니다.");
		System.out.println("이름 : " + names[i]);
		System.out.println("ID : " + ids[i]);
		System.out.println("PW : " + pws[i]);
		System.out.println("등급 : " + grades[i]);
		
		} // for문 종료
		

	} // 메서드 종료

} // 클래스 종료

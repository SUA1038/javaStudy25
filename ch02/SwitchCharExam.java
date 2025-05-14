package ch02;

import java.util.Scanner;

public class SwitchCharExam {

	public static void main(String[] args) {
		// switch문은 동등비교 연산자로 문자(char)도 동등비교할 수 있다.
		
		Scanner inChar = new Scanner(System.in); 
		// char용 스캐너 객체 생성
		
		System.out.println("회원 등급을 입력하세요. (A~C)");
		System.out.print(">>> ");
		
		// String gradeStre = inChar.next();	// 문자열로 데이터를 입력받아 String에 넣음
		// char gradeChr = gradeStr.charAt(0);	// 문자열 0번 인덱스 문자를 char 타입 변수에 넣음
		
		char gradeChaStr = inChar.next().charAt(0); // 문자열로 받은 값을 문자 처리함.
		
		// System.out.println("검증용 코드(2줄) : " + gradeChr);
		System.out.println("검증용 코드(1줄) : " + gradeChaStr);
		
		switch (gradeChaStr) {
		
		case 'a' :
		case 'A' :
			System.out.println("우수회원 입니다.");
			break;
			
		case 'b' :
		case 'B' :
			System.out.println("일반회원 입니다.");
			break;
			
		case 'c' :
		case 'C' :
			System.out.println("사업자회원 입니다.");
			break;
			
		default :
			System.out.println("처음 방문하는 고객님이십니까??");
			System.out.println("회원가입을 진행하시려면 yes를 입력해주세요.");
			System.out.println(">>> ");
			String newMember = inChar.next();
			if (newMember.equalsIgnoreCase("yes")) { // 회원가입 if문 시작
				System.out.println("회원가입을 진행합니다.");
				System.out.print("ID : ");
				String id = inChar.next();
				System.out.println("회원가입에 성공했습니다.");
				break;
			} else {
				System.out.println("안녕히 가세요. 다음 기회에 뵙겠습니다.");
								
			} // 회원가입 if문 종료
			
		} // switch문 종료
	
	}

}

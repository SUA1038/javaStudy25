package ch02;

import java.util.Scanner;

public class SsnExam {

	public static void main(String[] args) {
		// 주민번호를 입력하여 성별을 구분하는 switch문
		
		System.out.println("당신의 주민등록번호를 입력하세요. (010101-1234567)");
		Scanner in = new Scanner(System.in);
		String regNo = in.nextLine();
		char gender = regNo.charAt(7); // 8번째 글자 추출
				//System.out.println("gender");

		switch(gender) { // switch문 시작
		case '1' : case '3' : case '5' : case '7' :
			System.out.println("당신은 남자입니다.");
			break;
			
		case '2' : case '4' : case '6' : case '8' :
			System.out.println("당신은 여자입니다.");
			break;
			
		default :
			System.out.println("당신은 외계인입니다.");
			
		} // switch문 종료
		
	} // main 메서드 종료

}

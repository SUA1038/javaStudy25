package ch02;

import java.util.Scanner;

public class IfExam2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("회원가입을 진행합니다..");
		System.out.println("고객님의 성함을 작성해주세요.");
		System.out.print(">>> ");
		String name = in.next();
		
		System.out.println("고객님의 주민등록번호를 작성해주세요. (-는 제외)");
		System.out.print(">>> ");
		String ssn = in.next();
		
		System.out.println("정보를 자동으로 기입합니다.");
		
		char ssn2 = ssn.charAt(6); // 성별 추출
		int num = Character.getNumericValue(ssn2); 
		
		if(num % 2 ==0) { // 성별 if문 시작
			System.out.println("성별 : 여자");
		} else if (num % 2 ==1) {
			System.out.println("성별 : 남자");
		} else {
			System.out.println("오류 발생. 다시 작성해주세요.");	
		} // 성별 if문 종료
		
		int year = Integer.parseInt(ssn.substring(0,2)); // 태어난 연도 추출
		
		if(num ==1 || num ==2 || num == 5 || num == 6) {
			System.out.println("나이 : " + (2025 - (1900 + year) + 1));
		} else if (num == 3 || num == 4 || num == 7 || num == 8) {
			System.out.println("나이 : " + (2025 - (2000 + year) + 1));
		} else {
			System.out.println("오류 발생. 다시 작성해주세요.");
		}
		
		int month = Integer.parseInt(ssn.substring(2,4)); // 태어난 월 추출
		
		if(month <= 0 || month >=13) {
			System.out.println("오류 발생. 다시 작성해주세요.");
		} else if (month >=3 && month <= 5) {
			System.out.println("봄에 태어났습니다..");
		} else if (month >=6 && month <= 8) {
			System.out.println("여름에 태어났습니다.�.");
		} else if (month >=9 && month <= 11) {
			System.out.println("가을에 태어났습니다.");
		} else {
			System.out.println("겨울에 태어났스빈다.");
		}
		
		System.out.println("입력한 정보가 일치하다면 yes를 작성해주세요.");
		System.out.print(">>> ");
		String yes = in.next();
		// 정보확인
		if (yes.equalsIgnoreCase("yes") || yes.equalsIgnoreCase("y") || yes.equalsIgnoreCase("yess") || yes.equalsIgnoreCase("ye")) {  
		System.out.println("회원가입에 성공했습니다.");
		} else {
			System.out.println("오류 발생. 다시 시도해주세요.");
		} // 정보확인if문 종료

	} // main 메서드 종료

}

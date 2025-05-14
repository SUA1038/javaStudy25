package ch02;

import java.util.Scanner;

public class LottoExam {

	public static void main(String[] args) { // 주메서드 시작
		/* 
		로또 당첨 프로그램
		랜덤값으로 1~45의 숫자를 맞추세요.
		 */
		
		Scanner in = new Scanner(System.in);
		// 키보드로 입력받는 객체를 in 변수에 연결
		System.out.println("1부터 45까지의 번호중 6개를 입력해주세요.");
		
		System.out.print(">>> ");
		int myNum1 = in.nextInt();
		System.out.println("첫번째 번호 : " + myNum1);
		
		System.out.print(">>> ");
		int myNum2 = in.nextInt();
		System.out.println("두번째 번호 : " + myNum2);
		
		System.out.print(">>> ");
		int myNum3 = in.nextInt();
		System.out.println("세번째 번호 : " + myNum3);
		
		System.out.print(">>> ");
		int myNum4 = in.nextInt();
		System.out.println("네번째 번호 : " + myNum4);
		
		System.out.print(">>> ");
		int myNum5 = in.nextInt();
		System.out.println("다섯번째 번호 : " + myNum5);
		
		System.out.print(">>> ");
		int myNum6 = in.nextInt();
		System.out.println("여섯번째 번호 : " + myNum6);
		// 키보드로 번호 6개를 입력받는다
		
		int num1 = (int)(Math.random()*45)+1;
		int num2 = (int)(Math.random()*45)+1;
		int num3 = (int)(Math.random()*45)+1;
		int num4 = (int)(Math.random()*45)+1;
		int num5 = (int)(Math.random()*45)+1;
		int num6 = (int)(Math.random()*45)+1;
		// 6개 번호를 추첨한다
		
		int x = 0; 
		
		if ( myNum1 == num1 || myNum1 == num2 || myNum1 == num3 || myNum1 == num4 || myNum1 == num5 || myNum1 == num6 ) {
			
			++x;
		}
		
		if ( myNum2 == num1 || myNum2 == num2 || myNum2 == num3 || myNum2 == num4 || myNum2 == num5 || myNum2 == num6 ) {
			
			++x;
		}
		
		if ( myNum3 == num1 || myNum3 == num2 || myNum3 == num3 || myNum3 == num4 || myNum3 == num5 || myNum3 == num6 ) {
			
			++x;
		}
		
		if ( myNum4 == num1 || myNum4 == num2 || myNum4 == num3 || myNum4 == num4 || myNum4 == num5 || myNum4 == num6 ) {
			
			++x;
		}
		
		if ( myNum5 == num1 || myNum5 == num2 || myNum5 == num3 || myNum5 == num4 || myNum5 == num5 || myNum5 == num6 ) {
			
			++x;
		}
		
		if ( myNum6 == num1 || myNum6 == num2 || myNum6 == num3 || myNum6 == num4 || myNum6 == num5 || myNum6 == num6 ) {
			
			++x;
		} 
		
		System.out.println("=======================================");
		System.out.println("로또 결과 발표.");
		System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6 );
		System.out.println("=======================================");
		
		if (x == 0) {
			System.out.println("번호가 하나도 맞지 않았습니다.");
		} else if (x == 1) {
			System.out.println("축하합니다. 번호가 1개 맞았습니다.");
		} else if (x == 2) {
			System.out.println("축하합니다. 번호가 2개 맞았습니다.");
		} else if (x == 3) {
			System.out.println("축하합니다. 번호가 3개 맞았습니다.");
		} else if (x == 4) {
			System.out.println("축하합니다. 번호가 4개 맞았습니다.");
		} else if (x == 5) {
			System.out.println("축하합니다. 번호가 5개 맞았습니다.");
		} else if (x == 6) {
			System.out.println("축하합니다. 번호가 6개 맞았습니다.");
		} else {
			System.out.println("시스템 오류.");
		} 
	
	} // main 메서드 종료

}

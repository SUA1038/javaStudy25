package ch02;

import java.util.Scanner;

public class IfElseExam {

	public static void main(String[] args) {
		// 홀수인지 짝수인지 구분하는 if문 작성
		
		Scanner in = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int number = in.nextInt();
		
		if (number % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
			System.out.println("시스템을 종료합니다.");

	}

}

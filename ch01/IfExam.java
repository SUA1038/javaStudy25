package ch01;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		// 다중 if문
		
		Scanner in = new Scanner (System.in);
		// Sacnner 객체를 생성하여 키보드로 값을 입력받는다.
		System.out.println("귀하의 이름을 입력해주세요.");
		System.out.print(": ");
		String name = in.nextLine();
		System.out.println("귀하의 학년을 입력해주세요.");
		System.out.print(": ");
		int age = in.nextInt();
		System.out.println("귀하의 점수를 입력하세요. ");
		System.out.print(": ");
		int score = in.nextInt();
		// 키보드로 입력받은 정수를 score 변수에 넣는다.
		
		
	
		
		
		if (score >= 98) { 
			System.out.println("점수가 98점 이상입니다.");
			System.out.println(age + "학년 " + name + "님의 등급은 1등급 입니다.");			
		} else if (score >= 92) {
			System.out.println("점수가 92점 이상입니다.");
			System.out.println(age + "학년 " + name + "님의 등급은 2등급 입니다.");
		} else if (score >=85) {
			System.out.println("점수가 85점 이상입니다.");
			System.out.println(age + "학년 " + name + "님의 등급은 3등급 입니다.");
		} else if (score >=70) {
			System.out.println("점수가 70점 이상입니다.");
			System.out.println(age + "학년 " + name + "님의 등급은 4등급 입니다.");
		} else if (score < 60) {
			System.out.println("점수가 60점 이하입니다.");
			System.out.println(age + "학년 " + name + "님은 퇴학당하셨습니다.");
				
		}

	}

}

package ch01;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		// ���� if��
		
		Scanner in = new Scanner (System.in);
		// Sacnner를 생성하여 객체 입력받기
		System.out.println("이름을 작성해주세요.");
		System.out.print(": ");
		String name = in.nextLine();
		System.out.println("나이를 작성해주세요.");
		System.out.print(": ");
		int age = in.nextInt();
		System.out.println("점수를 작성해주세요. ");
		System.out.print(": ");
		int score = in.nextInt();
		
		System.out.println("등급을 안내합니다.");
		if (score >= 98) { 
			System.out.println(age + "세" + name + "님은 1등급입니다.");			
		} else if (score >= 92) {
			System.out.println("등급을 안내합니다..");
			System.out.println(age + "세" + name + "님은 2등급입니다.");	
		} else if (score >=85) {
			System.out.println("������ 85�� �̻��Դϴ�.");
			System.out.println(age + "세" + name + "님은 3등급입니다.");	
		} else if (score >=70) {
			System.out.println("������ 70�� �̻��Դϴ�.");
			System.out.println(age + "세" + name + "님은 4등급입니다.");	
		} else if (score < 60) {
			System.out.println("������ 60�� �����Դϴ�.");
			System.out.println(age + "세" + name + "님은 5등급입니다.");	
				
		}

	}

}

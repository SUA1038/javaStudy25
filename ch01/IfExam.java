package ch01;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		// ���� if��
		
		Scanner in = new Scanner (System.in);
		// Sacnner ��ü�� �����Ͽ� Ű����� ���� �Է¹޴´�.
		System.out.println("������ �̸��� �Է����ּ���.");
		System.out.print(": ");
		String name = in.nextLine();
		System.out.println("������ �г��� �Է����ּ���.");
		System.out.print(": ");
		int age = in.nextInt();
		System.out.println("������ ������ �Է��ϼ���. ");
		System.out.print(": ");
		int score = in.nextInt();
		// Ű����� �Է¹��� ������ score ������ �ִ´�.
		
		
	
		
		
		if (score >= 98) { 
			System.out.println("������ 98�� �̻��Դϴ�.");
			System.out.println(age + "�г� " + name + "���� ����� 1��� �Դϴ�.");			
		} else if (score >= 92) {
			System.out.println("������ 92�� �̻��Դϴ�.");
			System.out.println(age + "�г� " + name + "���� ����� 2��� �Դϴ�.");
		} else if (score >=85) {
			System.out.println("������ 85�� �̻��Դϴ�.");
			System.out.println(age + "�г� " + name + "���� ����� 3��� �Դϴ�.");
		} else if (score >=70) {
			System.out.println("������ 70�� �̻��Դϴ�.");
			System.out.println(age + "�г� " + name + "���� ����� 4��� �Դϴ�.");
		} else if (score < 60) {
			System.out.println("������ 60�� �����Դϴ�.");
			System.out.println(age + "�г� " + name + "���� ���д��ϼ̽��ϴ�.");
				
		}

	}

}

package ch01;

import java.util.Scanner;

public class PrintfExam {

	public static void main(String[] args) {
		
		int i = 97 ; 
		String s = "JAVA" ;
		double f = 3.14d ;
		
		System.out.printf("%d\n", i);
		System.out.printf("%o\n", i);
		System.out.printf("%x\n", i);
		System.out.printf("%c\n", i);
		System.out.printf("%5d\n", i);
		System.out.printf("%05d\n", i);
		System.out.printf("%S\n", s);
		System.out.printf("%5S\n", s);
		System.out.printf("%-5S\n", s);
		System.out.printf("%f\n", f);
		System.out.printf("%e\n", f);
		System.out.printf("%4.1f\n", f);
		System.out.printf("%04.1f\n", f);
		System.out.printf("%-4.1f\n", f);
		
		Scanner input = new Scanner(System.in);
		System.out.println("=============================");
		System.out.print("�̸� : ");
		String name = input.next(); // ���ڿ� �Է¿�
		
		System.out.print("���� : "); // ���� �Է¿�
		String age = input.next(); 
		
		System.out.print("��� : "); //�Ǽ� �Է¿�
		String ave = input.next();
		
		System.out.printf("���� ����� �̸��� %S\n ����� ���̴� %d\n ����� %5.2f\n�Դϴ�.", name, age, ave);

	}

}

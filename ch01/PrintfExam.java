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
		System.out.print("이름 : ");
		String name = input.next(); // 문자열 입력용
		
		System.out.print("나이 : "); // 정수 입력용
		String age = input.next(); 
		
		System.out.print("평균 : "); //실수 입력용
		String ave = input.next();
		
		System.out.printf("현재 당신의 이름은 %S\n 당신의 나이는 %d\n 평균은 %5.2f\n입니다.", name, age, ave);

	}

}

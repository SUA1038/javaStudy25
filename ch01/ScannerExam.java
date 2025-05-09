package ch01;

import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.printf("%d * %d은 %입니다. \n", a, b, a* b);

	}

}

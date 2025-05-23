package ch03;

import java.util.Scanner;

public class Array1Demo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int scores[] = new int [5];
		int sum = 0;
		
		for(int i = 0; i<scores.length; i++) {
			scores[i] = in.nextInt();
		} // 키보드로 입력받은정수를 scores 배열에 차례대로 삽입한다.
		
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		
		System.out.println("총점은 : " + sum);
		System.out.println("평균은 : " + sum / (double) scores.length);

	}

}

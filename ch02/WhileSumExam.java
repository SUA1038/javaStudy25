package ch02;

public class WhileSumExam {

	public static void main(String[] args) {
		// for문으로 만든 1~100까지의 합을 while문으로 개선
		
		int sum = 0;
		int i = 1;
		while (i <= 100) {
			sum = sum + i;
			i++;
		}

		System.out.println("1~" + (i-1) + " 까지의 합 : " + sum);
		
	}

}

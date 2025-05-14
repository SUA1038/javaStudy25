package ch02;

public class WhilePrintExam {

	public static void main(String[] args) {
		
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
			// 증감식을 꼭 넣어야 한다. 없을 경우 무한루프에 빠진다.
		}

	}

}

package ch02;

public class ForPrintExam {

	public static void main(String[] args) {
		// for문 연습

		for (int i = 1; i <= 10; i++) { // for문 시작
			System.out.println("1~10까지 출력 : " + i);
		} // for문 종료

		System.out.println("===============================");
		
		for (int k = 2; k <= 10; k = k + 2) { // for문 시작
			System.out.println("1~10까지 짝수만 출력 : " + k);
		} // for문 종료

		for(int t=0, f=100; t<=10 && f>=90; t++, f--) {
			System.out.println("t 값의 증가 : " + t + "	f 값의 감소 : " + f);
		}
		
	}

}

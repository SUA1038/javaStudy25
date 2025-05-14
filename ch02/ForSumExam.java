package ch02;

public class ForSumExam {

	public static void main(String[] args) {
		// 1부터 100까지의 합을 구해본다. 1+2+3+... 100 = sum / 5050
		int sum = 0; // 누적합계를 구하는 변수를 선언
		
		for (int i = 1; i<=100; i++) { //1~100까지 증가값
			sum = sum + i;
		}
		
		System.out.println("1~100까지의 합 : " + sum);
		
		
		int sum2 = 0;
		int k = 1;
		for(; k<=500; k++) {
			sum2 = sum2 + k;
			
		}

		System.out.println("1~" + (k-1) + " 까지의 합 : " + sum2);
		
		// for문 작성 시 루프 카운트변수를 부동 소수점인 실수방식을 사용하면 안된다. 오류가 발생할 수 있다.
		
	}

}

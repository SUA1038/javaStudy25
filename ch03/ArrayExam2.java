package ch03;

public class ArrayExam2 {

	public static void main(String[] args) {
		// 배열에 들어있는 값중에 최대값과 최소값을 구하는 예제
		int [] scores = { 88, 50, 97, 79, 100, 94, 74 };
		
		int max = scores[0];	// 최대값을 구하는 변수에 0번 인덱스 값을 삽입
		int min = scores[0];	// 최소값을 구하는 변수에 0번 인덱스 값을 삽입
		
		for(int i=1; i<scores.length; i++) {
			if(scores[i] > max) {
				max = scores[i];
			} else if(scores[i] < min) {
				min = scores[i];
			}
		} // for end
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	} // main end
	
} // class end

package ch03;

public class ArrayExam1 {

	public static void main(String[] args) {
		// 총합과 평균을 구하는 배열 (배열의 모든 요소를 더해서 총점과 평균을 구한다.
		int sum = 0; // 총점을 저장하기 위한 변수
		float average = 0F; // 평균을 저장하기 위한 변수
		
		int[] scores = { 100, 88, 100, 94, 89}; // 5개 자료를 제공
		// 총점 공식
		for (int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		
		average = sum / (float)scores.length; // 계산 결과를 float으로 얻기 위함
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + average);

	} // main end

} // class end

package ch03;

public class ArrayLangthExam {

	public static void main(String[] args) {
		int[] scores = {90, 86, 95};
		int sum = add(scores);
		
		System.out.println("총합 : " + sum);
		double avg = avg(sum, scores);
		System.out.println("평균 : " + avg);

	} // main end

	static int add(int[] scores) {
		int sum = 0;
		System.out.println("현재 인원은 : " + scores.length);
		for (int i=0; i<scores.length; i++) { // 0~2까지 1씩 증가
			sum += scores[i]; // scores 0~2까지 합계를 구한다.
		}
		return sum;
	} // add end

	static double avg(int sum, int[] scores) {
		double avg = (double) sum / scores.length;
		return avg;
	}
	
} // class end

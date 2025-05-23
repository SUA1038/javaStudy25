package ch03;

public class ArrayCreateExam {

	public static void main(String[] args) {
		// 배열을 이용하여 총점과 평균 값을 구해보자
		int[] scores = null;
		scores = new int[] {83, 90, 87};
		
		System.out.println("score[0] : " + scores[0]); // 0부터 시작한다.
		System.out.println("score[1] : " + scores[1]);
		System.out.println("score[2] : " + scores[2]);
		
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += scores[i];
			// System.out.println(sum);		총점을 구하는 방법
		}
		System.out.println("총점 : " + sum);
		double avg = ((double) sum / 3);
		System.out.println("평균 : " + avg);
		

	} // main method end

} // class end

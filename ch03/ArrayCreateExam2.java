package ch03;

public class ArrayCreateExam2 {

	public static void main(String[] args) {
		// 메서드를 활용하여 평균 계산을 해보자
		
		int total1 = add(new int[] {30, 40, 50});
		int total2 = add(new int[] {50, 60, 70});
		int total3 = add(new int[] {70, 80, 90});
		System.out.println("1그룹의 총합 : " + total1);
		System.out.println("2그룹의 총합 : " + total2);
		System.out.println("3그룹의 총합 : " + total3);

	} // main method end

	static int add(int[] scores) {
		// 신규 메서드 생성 
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		return sum;
	} // add method end

	
	
	
} // class end

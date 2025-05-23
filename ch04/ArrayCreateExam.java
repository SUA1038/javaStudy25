package ch04;

public class ArrayCreateExam {

	public static void main(String[] args) {
		int total1 = add(new int[] {70, 80, 90});
		int total2 = add(new int[] {70, 80, 60});
		int total3 = add(new int[] {70, 60, 50});
		System.out.println("1반의 총합 : " + total1);
		System.out.println("2반의 총합 : " + total2);
		System.out.println("3반의 총합 : " + total3);
	} // 메인 메서드 종료
	
public static int add(int[] scores) {
	int sum = 0;
	for(int i=0; i<3; i++) {
		sum += scores[i];
	} // for문 종료
	return sum;
} // add 종료
	
	
} // 클래스 종료

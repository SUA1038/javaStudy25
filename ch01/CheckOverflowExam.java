package ch01;

public class CheckOverflowExam {

	public static void main(String[] args) {
		
		try {
			int sua = safeAdd(10000000, 10000000) ;
			System.out.println(sua);
		} catch(ArithmeticException e) {
			System.out.println("오버플로우 발생, 계산 불가");
		}
		
	}

	private static int safeAdd(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}
}
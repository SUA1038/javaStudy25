package ch01;

public class CheckOverflowExam {

	public static void main(String[] args) {
		
		try {
			int sua = safeAdd(10000000, 10000000) ;
			System.out.println(sua);
		} catch(ArithmeticException e) {
			System.out.println("�����÷ο� �߻�, ��� �Ұ�");
		}
		
	}

	private static int safeAdd(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}
}
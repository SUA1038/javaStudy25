package ch01;

public class OverFlowExam {

	public static void main(String[] args) {
		int x = 100000 ;
		int y = 100000 ;
		int z = x * y ;
		System.out.println(z); // Á¦´ë·Î Ç¥±â ¾ÈµÊ
		
		long a = 1000000 ;
		long b = 1000000 ;
		long c = a * b ;
		System.out.println(c); // Ç¥±âµÊ


	}

}

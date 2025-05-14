package ch01;

public class StringConcatExam {

	public static void main(String[] args) {
		String A1 = "JAVA" + 6.0 ;
		String A2 = A1 + "특징" ;
		System.out.println(A1);
		System.out.println(A2);
		System.out.println("====================");
		
		String A3 = "JAVA" + 7 + 7.0;
		String A4 = 7 + 7.0 + "JAVA" ;
		System.out.println(A3);
		System.out.println(A4);
				
		
		int rt = 0 ;
		rt += 20 ;
		System.out.println("================");
		System.out.println(rt);
		
		rt -= 7 ;
		System.out.println(rt);
		
		rt *= 2 ;
		System.out.println(rt);
		
		rt /= 4 ;
		System.out.println(rt);
		
		rt %= 2 ;
		System.out.println(rt);

	}

}

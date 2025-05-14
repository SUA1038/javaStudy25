package ch01;

public class StringEqualExam {

	public static void main(String[] args) {
		String st1 = "김수아" ; // 김수아라는 string 객체 생성
		String st2 = "김수아" ; // 같은 객체가 있어서 새로 생성하지 않음
		String st3 = new String("김수아") ; // 새로운 객체를 생성
		
		System.out.println(st1 == st2);
		System.out.println(st1 == st3);
		System.out.println("====================");
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));
		
		int kim1 = 20 ;
		int kim2 = 20;
		boolean su1 = (kim1 == kim2) ;
		boolean su2 = (kim1 != kim2) ;
		boolean su3 = (kim1 <= kim2) ;
		
		System.out.println("===================");
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
		System.out.println("su3 : " + su3);
		
		char ch1 = 'x' ;
		char ch2 = 'y' ;
		boolean su4 = (ch1 < ch2) ;
		System.out.println("su4 : " + su4);
		
		int a1 = 3 ;
		double a2 = 3.0 ;
		System.out.println("==================");
		System.out.println(a1 == a2);
		
		double a3 = 0.5 ;
		float a4 = 0.5F ;
		System.out.println("======================");
		System.out.println(a3 == a4);
		System.out.println((float)a3 == a4);
		System.out.println((int)(a3*10) == (int)(a4*10));


	}

}

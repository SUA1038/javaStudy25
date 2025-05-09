package ch01;

public class CharExam {

	public static void main(String[] args) {

		
		char c1 = 75 ;		// A문자를 출력하기 위해 char에 대입
		char c2 = 105 ;		// 10진수 65를 char에 대입하여 유니코드
		char c3 = 109 ;		// u라는 유니코드표에 있는 16진수 41을 출력
		
		
		//char c4 = 75 ;
		//char c5 = 105 ;
		
		//char c6 = 87 ;
		//char c7 = 111 ;
		//char c8 = 110 ;
		
		
		System.out.print(c1);
		System.out.print(c2);
		System.out.println(c3); //줄 변경
		
		char han1 = '가' ;
		char han2 = 44032 ;
		char han3 = '\uac00' ;
		
		System.out.println(han1);
		System.out.println(han2);
		System.out.println(han3);
		
		int uniCode1 = '김' ;
		int uniCode2 = '기' ;
		int uniCode3 = '원' ;
		
		System.out.println(uniCode1);
		System.out.println(uniCode2);
		System.out.println(uniCode3);

	}

}
 
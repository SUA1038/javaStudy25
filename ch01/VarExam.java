package ch01;

public class VarExam {

	public static void main(String[] args) {
		
		// 변수 선언 테스트
		
		int x = 1 ; 
		// 정수타입 x 변수에 1값을 넣는다.
		
		char y = 65 ;
		// char은 문자타입인데 숫자로 변환되기도 한다.
		// 컴퓨터는 문자를 유니코드로 변환 처리한다.
		// 유니코드 표에 65는 A를 의미한다. 
		// 유니코드 계산은 PC에 있는 계산기에서 프로그래밍 항목에 들어가 확인할 수 있다.
				
		char z = 'A' ;
		// char 타입의 z 변수에 문자 A를 넣음
		
		System.out.println("int x =" + x);
		System.out.println("char y = " + y);
		System.out.println("char z = " + z);
		
		// qustndml tjsdjs
		
		int x1 ; // 초기화 안된 변수
		x1 = 10 ; // 변수에 초기값을 10으로 넣음
		
		System.out.println(x1);
		
		// 다중 변수 선언
		int kor, mat, eng, total, avg ;
		
		kor = 90 ;
		mat = 80 ;
		eng = 70 ;
		
		total = kor + mat + eng ; // 총점
		avg = total / 3 ; //평균
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		
		// 그러나 소수점이 표기되지 않아 문제가 생길 수 있다.
		
		// 변수 작성 규칙
		// 변수는 첫글자가 영문이어야 되며, $, +를 사용할 수 있다.
		// 관례로 첫글자 영문은 소문자로, 2번째 단어부터는 대문자로 시작한다.
		
		// int price, $price, _price ;
		// 가급적이면 특수문자는 사용하지 않도록 한다.
		
		// 안되는 예시
		// int 1v;
		// int @speed
		// int @#value
		
		char firstname = '김' ;
		char firstName = '이' ;
		
		System.out.println("성: " + firstname);
		System.out.println("성: " + firstName);
		// 변수 중에 대소문자는 다른 변수로 인식된다.
		
		// 변수명에 예약어는 사용할 수 없다.
		// 예약어는 자바에서 이미 사용중인 명령어다.
		
		// 안되는 예시
		// int char
		
		// 리터럴 : 직접 입력된 값
		
		int literal1 = 75 ;
		// 10진수
		
		int literal2 = 075 ;
		// 8진수
		
		int literal3 = 0b0011 ;
		// 2진수
		
		int literal4 = 0xA ;
		// 16진수
		
		System.out.println("10진수 75: " + literal1);
		System.out.println("8진수 : " + literal2);
		System.out.println("2진수 0011: " + literal3);
		System.out.println("16진수 A: " + literal4);
		
				
	}

}

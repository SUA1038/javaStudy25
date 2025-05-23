package ch04;

public class Calculator {
	//메소드 연습용 계산기 프로그램
	void powerOn() {
		System.out.println("계산기의 전원을 킵니다.");
	} // void end
	
	int plus(int x, int y) { // 덧셈
		int result = x + y ; // int타입이 결과 리턴
		return result;
	} // x와 y의 매개값을 전달받아 더한 뒤 리턴
	
	int plus1(int x, int y) { // 덧셈
		byte result = (byte)(x + y) ; // byte 타입으로 강제타입 변환 후 리턴
		return result;
	} // 큰 값에서 작은 값으로 리턴하려면 강제타입 변환, 작은 값에서 큰 값으로 리턴하면 자동타입변환 된다.

	int minus(int x, int y) { // 뺄셈
		int result = x - y ;
		return result;
	}
	
	int multiply (int x, int y) { // 곱셈
		int result = x * y;
		return result ;
	}
		
	double divide(int x, int y) { // 나눗셈
		double result = (double)x / (double)y ;
		return result ;
	}
	
	int remainder(int x, int y) { // 나머지
		int result = x % y ;
		return result;
	}
	
	
	void pwerOff() {
		System.out.println("전원을 끕니다.");
	}
	
}

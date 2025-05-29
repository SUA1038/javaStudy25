package ch04.calculator;

public class Calculator { // 계산기 프로그램
	static double pi = 3.141592;
	// pi필드 선언 및 초기값 입력
	
	static int plus (int x, int y) {
		return x + y;
	} // plus 메서드 생성 후 x + y 값 리턴
	
	static int minus (int x, int y) {
		return x - y;
	} // minus 메소드 생성 후 x - y 값 리턴  
	
	static int multiply (int x, int y) {
		return x * y;
	}
	
	static int result (int x, int y, int z) {
		return x + y * z;
	}

}

package ch05.extended;

public class ExtendedsTeach extends ExtendesTest {
	// 상속 사용 연습
	
	int field2 ;
	void method2() {
		// 실행문
	} // 메서드 종료

	
	public static void main (String[] ages) {
		
		ExtendedsTeach b = new ExtendedsTeach(); // 객체 생성
		b.field1 = 10;
		b.method1();
		
		b.field2 = 20;
		b.method2();
		
	}
	
} // 자식 클래스로 부모 객체를 활용한다.


// 상속을 이용하면 클래스의 수정을 최소화 가능
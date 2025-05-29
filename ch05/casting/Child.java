package ch05.casting;

public class Child extends Parent {
	String field2 ; // 부모 클래스에 있는 필드만 사용
	void method2() {}; // 오버라이딩 전에 사용 안됨
	void method3() {}; // 부모클래스에 메소드만 사용

}

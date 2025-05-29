package ch05.casting;

public class ChildExam {

	public static void main(String[] args) {
		Parent parent = new Child();
		// 자동타입 변환으로 자식 객체를 통해 부모 객체도 생성한다.
		
		parent.field1 = "김기원";
		parent.method1(); // 부모클래스의 메소드
		parent.method2(); // 부모클래스의 메소드
//		parent.method3(); // 자식클래스의 메소드
//		parent.field2 + "김기원"; // 자식클래스의 메소드
		
		
		Child child = new Child();
		child.method3(); // 자식클래스의 메소드
		child.field2 = "김기원" ;
		
		Child ch = new Child(); // 강제타입변환
		ch.method3(); // 자식클래스의 메소드
		ch.field2 = "김기원" ; // 자식클래스의 필드
		
	}

	public void method(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent ; // 강제타입 변환
		} // parent 매개변수가 참좃하는 것이 Child인지 조사
	}
	
	
}

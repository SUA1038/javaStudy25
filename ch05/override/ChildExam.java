package ch05.override;

public class ChildExam {

	public static void main(String[] args) {
		Child ch = new Child();
		Parent pr = ch; // 자동타입변환
		
		pr.method1();
		pr.method2();
		// pr.method3(); // 자식에 있는 method3는 호출 불가
		
		
		// 왜 이렇게 자동타입 변환을 하는가 ?
		// -> 다향성을 구현하기 위해서.
		// 실무 : 필드 값을 다양화하여 실행 결과가 다르게 나오게 함. 
		// 필드의 타입에는 변화가 없으나 실행 도중 어떤 결과가 나오는지 달라질 수 있다.
		
		

	}

}

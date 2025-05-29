package ch04.singleton;

public class Singleton {
	// 싱글톤 : 전체에서 단 하나의 객체만 쓸 때 사용하는 것
	// 외부에서 new로 생성 불가
	// 자신의 타입인 정적 필드를 하나 선언하고, 자신의 객체를 생성해 초기화
	// 정적 필드도 private 접근 제한자를 붙여 외부에서 필드값 변경 못하게 함
	
	// 정적 필드
	private static Singleton st = new Singleton();
	// 객체 1개만 만들어지는 싱글톤 객체 생성
	
	// 생성자
	private Singleton() {
		
	}
	
	// 정적 메소드
	static Singleton getInstance() {
		return st;
	}
}

package ch04.car;

public class CarExam {
	// 정적 메소드와 정적 블록에서 인스턴스 멤버를 사용하고 싶으면 객체를 먼저 생성하고 참조 변수로 접근한다.
	// main()메서도드 동일한 규칙 적용. 
	// -> 필드나 메소드에 static을 붙여 사용
	// -> 객체를 생성하여 변수로 호출해서 사용
	
	static double speed ; // 필드 생성
	static void run() {// 메소드 생성
		System.out.println(speed + "으로 달립니다.");
	}; 

	public static void main (String[] args) {
		CarExam myCar = new CarExam();
		speed = Math.random()+100;
		run();
	}

}
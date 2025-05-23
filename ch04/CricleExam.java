package ch04;

public class CricleExam {

	public static void main(String[] args) {
		// Circle 클래스를 객체로 받아서 동작하는 메서드
		
		Circle circle = new Circle(); // 생성자를 통해 객체를 ㅐㅅㅇ성
		// 객체는 circle이라는 변수와 연결한다.
		
		circle.name = "김수아"; 	// name 필드에 String 값을 넣는다.
		circle.radius = 10; 	// radius 필드에 int값을 넣는다.
		
		double result = circle.getArea(); // Circle 객체의 getArea()메서드 실행]
		
		System.out.println("원의 넓이 : " + circle.radius + "는 " + result + "이다.");
		System.out.println("작성자 : " + circle.name);
	}

}

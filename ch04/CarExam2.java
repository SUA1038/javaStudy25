package ch04;

public class CarExam2 {

	public static void main(String[] args) {
		Car2 car1 = new Car2() ;
		System.out.println("car1 변수가 Car2 객체를 참조합니다.");
		
		Car2 car2 = new Car2();
		System.out.println("car2 변수가 Car2 객체를 참조합니다.");
		
		System.out.println("car1과 car2에 동등비교 값 : " + (car1 == car2));

	}

}

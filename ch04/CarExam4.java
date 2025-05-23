package ch04;

public class CarExam4 {

	public static void main(String[] args) {
		Car4 myCar1 = new Car4();
		System.out.print("myCar1.company : " + myCar1.company);
		System.out.println();
		
		Car4 myCar2 = new Car4("자가용");
		System.out.println("myCar2.company : "+ myCar2.company);
		System.out.println("myCar2.model : " + myCar2.model);
		System.out.println();
		
		Car4 myCar3 = new Car4("SUV", "빨강");
		System.out.println("myCar3.company : "+ myCar3.company);
		System.out.println("myCar3.model : "+ myCar3.model);
		System.out.println("myCar3.color : "+ myCar3.color);
		System.out.println();
		
		Car4 myCar4 = new Car4("SuperCar", "검정", 400);
		System.out.println("myCar4.company : "+ myCar4.company);
		System.out.println("myCar4.model : "+ myCar4.model);
		System.out.println("myCar4.color : "+ myCar4.color);
		System.out.println("myCar4.maxSpeed : "+ myCar4.maxSpeed);
		System.out.println();

	} // 메인 메서드 종료

} // 클래스 종료

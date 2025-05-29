package ch05.promotion.vehicle;

public class DriverExam {
	

	public static void main(String[] args) {

		Driver driver = new Driver();
		// Driver 객체를 생성
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		// Bus, Taxi 객체 생성
		
		// drive() 메소드를 호출할 때 Bus 객체와 Taxi객체를 제공
		driver.drive(bus);
		// 자동타입변환 Vehicle vehicle = bus;
		driver.drive(taxi);
		// 자동타입변환 Vehicle vehicle = taxi;
		

	}

}

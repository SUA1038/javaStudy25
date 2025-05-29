package ch05.getter_setter;

public class CarExam3 {

	public static void main(String[] args) {
		Car3 myCar = new Car3();
		
		myCar.setSpeed(50);
		System.out.println("현재 속력 : " + myCar.getSpeed());
		
		myCar.setSpeed(-20);
		System.out.println("현재 속력 : " + myCar.getSpeed());
		
		if(!myCar.isStop()) {
			System.out.println("차량 정지 여부 : " +myCar.getSpeed());
		}

	}

}

package ch05.getter_setter;

public class CarExam2 {
	
	public static void main(String[] args) {
		
		Car2 myCar = new Car2();
		
		myCar.setSpeed(-50);
		System.out.println("차량 속도 : " + myCar.getSpeed());
		
		myCar.setSpeed(80);
		System.out.println("차량 속도 : " + myCar.getSpeed());
		
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재 중지 상태 : " + myCar.getSpeed());
	}

}

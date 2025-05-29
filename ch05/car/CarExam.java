package ch05.car;

public class CarExam {

	public static void main(String[] args) {
		Car car = new Car();
		
		for (int i=1; 1<=10; i++) { // 자동차 마일리지 소모
			int problmLocation = car.run();
			
			
			if(problmLocation != 0) { // 15번 반복
				System.out.println(car.tires[problmLocation=1].location + " 한국 타이어로 교체.");
				car.tires[problmLocation-1] = new HankookTire(car.tires[problmLocation-1].location, 15);
				
			}
			
			
			
//			switch(problmLocation) {
//			case 1:
//				System.out.println("앞왼쪽 한국타이어로 교체");
//				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
//				break;
//				
//			case 2:
//				System.out.println("앞오른쪽 한국타이어로 교체");
//				car.frontRightTire = new HankookTire("앞오른쪽", 20);
//				break;
//				
//			case 3:
//				System.out.println("뒤왼쪽 금호타이어로 교체");
//				car.backLeftTire = new KumhoTire("뒤왼쪽", 12);
//				break;
//				
//			case 4:
//				System.out.println("뒤오른쪽 금호타이어로 교체");
//				car.backRightTire = new KumhoTire("뒤오른쪽", 17);
//				break;
//			} // 마일리지 소모 후 자동으로 교체되는 코드
			
			System.out.println("----------------");
			
		} // for문 종료

	} // 메인 메서드 종료

} // 클래스 종료

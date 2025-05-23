package ch04;

public class CarExam3 {

	public static void main(String[] args) {

		Car3 myCar = new Car3();
		// 필드 사용
		myCar.speed = 20;
		System.out.println("나의 자동차 현재 속도 : " + myCar.speed);
		// 필드 값 읽기
		System.out.println("제작 회사: " +  myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("생산년도 : " + myCar.productionYear);
		System.out.println("주행속도 : " + myCar.currentSpeed);
		System.out.println("시동상태 : " + myCar.engineStart);
		
	} // 메서드 종료

} // 클래스 종료

package ch04;

import java.util.Scanner;

public class Car {
	// 필드 (객체가 가지고 있어야 하는 값) -> 글로벌변수(GV)
	// 고유 데이터
	public String company; // 제작회사 (현대, 기아, KGM, 쉐보레, 아우디)
	public String model; // 아반테, 그렌져, 소나타
	public String color; // 빨간색, 은색, 검정색, 하얀색
	int maxSpeed; // 최고속도
	public String oilType; // 경유, 휘발류
	public boolean carRun = false;
	public boolean carFire = false;

	// 상태값(변동가능)
	public int speed;
	public int rpm;
	public int oil;
	final int MAXSPEED = 300;

	// 부품 -> 다른 클래스를 생성하여 연결한다.
//	public Body body ;
//	public Engine engine ;
//	public Tire tire ;

	// 부품에 필드 사용법
	// Car myCar = new Car(); -> 객체 생성(인스턴스)
	// myCar.maxSpeed = 300; -> 객체에 있는 maxSpeed에 300 정수를 넣는다.
	// (필드)---------------------------------------------------------------

	// 기본생성자: 생략 가능 (객체가 생성할 때 사용되는 메서드 : 클래스명과 같은 이름)
	public Car() {
		speed = 0;
		rpm = 50;
		oil = 100;
		int randomOilType = (int)(Math.random()*4)+1;
		switch(randomOilType) {
		case 1:
			this.oilType = "경유";
			break;
			
		case 2:
			this.oilType = "휘발류";
			break;
			
		case 3:
			this.oilType = "LPG";
			break;
			
		case 4:
			this.oilType = "CNG";
			break;
		} // switch문 종료
	} // 객체가 생성되면서 변수에 값이 저장됨.

	// 사용자 지정 생성자 -> 개발자가 응용하는 기법
	// 사용자 지정 생성자가 만들어지면 기본 생성자는 자동으로 생성되지 않는다.
	public Car(String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
	} // Car myCar = new Car("벤츠", "이클레스", "빨강") ;

	// 메서드 (객체가 수행해야 되는 동작)
	// C(시동 시작) R(차량상태, 주행상태) U(가속, 감속, 주차) D(시동 종료)
	// (시동걸기)---------------------------------------------------------------
	public void start() {
		System.out.println(this.model + "(이)의 시동이 켜집니다.");
		this.carRun = true;
		int randomOilType = (int)(Math.random()*4)+1;
		switch(randomOilType) {
		case 1:
			this.oilType = "경유";
			break;
			
		case 2:
			this.oilType = "휘발류";
			break;
			
		case 3:
			this.oilType = "LPG";
			break;
			
		case 4:
			this.oilType = "CNG";
			break;
		} // switch문 종료
		System.out.println("현재 속도 : " + this.speed);
		System.out.println("현재 rpm : " + this.rpm);
		System.out.println("현재 주유량 : " + this.oil);
		System.out.println("현재 연료 : " + this.oilType);
	} // 메서드 종료
	// (시동걸기)---------------------------------------------------------------
	
	
	
	// (차량 조작하기)---------------------------------------------------------------
	public boolean run(Scanner input, boolean run) {
		if(carFire==true) { // 차량에 불이 났는지 if문
			System.out.println("차량에 화재가 발생했습니다.");
			System.out.println("당신은 죽었습니다.");
			run = false;
		} else {
			if(carRun==true) {
				if (this.oil <= 0) { // 차량에 연료가 있는지 if문
					System.out.println("연료가 부족합니다. 차량을 운행할 수 없습니다.");
				} else {
					System.out.println();
					System.out.println(this.model + "(이)가 주행을 시작합니다. ");
					System.out.println("무엇을 하시겠습니까?");
					System.out.println("1. 엑셀 밟기 2. 브레이크 밟기 3. 아무것도 하지 않음");
					System.out.print(">>> ");
					int select = input.nextInt();
					switch (select) {

					case 1:
						if(speed < MAXSPEED){
							System.out.println("속도를 높입니다.");
							speed += 30;
							rpm += 100;
							oil -= 10;	
						} else {
							System.out.println("최대 속도입니다.");
						}
						
						
						System.out.println("현재 속도 : " + this.speed);
						break;

					case 2:
						if (this.speed <= 0) {
							System.out.println("차량이 정지해있습니다.");
						} else {
							System.out.println("속도를 줄입니다.");
							speed -= 30;
							rpm -= 50;
							System.out.println("현재 속도 : " + this.speed);
						} // if문 종료
						break;

					case 3:
						System.out.println("메뉴로 돌아갑니다.");
						break;

					default:
						System.out.println("선택 오류 발생. 메뉴로 돌아갑니다.");
						
						break;
					} // switch문 종료
					
				}	// 연료 if문 종료
			} else {
				System.out.println("차량의 시동을 켜주세요.");
			} // 시동 if문 종료
			
		} // 화재 if문 종료

		return run;

	} // 메서드 종료
	// (차량 조작하기)---------------------------------------------------------------
	
	
	// (시동종료)---------------------------------------------------------------
	public void stop() {
		if (this.speed <= 0) {
			System.out.println("시동을 끕니다.");
			carRun = false;
			rpm = 0;
		} else {
			System.out.println("시동을 끌 수 없습니다.");
			System.out.println("차량을 멈춰주세요.");
		} // if문 종료
	} // 메서드 종료
	// (시동종료)---------------------------------------------------------------
	

	
	
	// (주유하기)---------------------------------------------------------------
	public void refuel(Scanner input) {
		
		System.out.println("주유할 연료를 고르세요. (현재 연료량 : " + this.oil + ", 연료 종류 : " + this.oilType + ")");
		System.out.println("a. 경유 | b. 휘발류 | c. LPG | d. CNG");
		System.out.print(">>> ");
		String selectOilType = input.next();
		
		switch(selectOilType) {
		case "a":
		case "A":
			selectOilType = "경유";
			break;
			
		case "b":
		case "B":
			selectOilType = "휘발류";
			break;
			
		case "c":
		case "C":
			selectOilType = "LPG";
			break;
			
		case "d":
		case "D":
			selectOilType = "CNG";
			break;
		}
		
		System.out.println("충전할 양을 입력하세요. (숫자만 입력하세요.)");
		System.out.print(">>> ");
		this.oil += input.nextInt();
		
		if(selectOilType.equals(this.oilType)) {
			System.out.println("충전이 완료되었습니다. (충전 후 현재 연료량 : " + this.oil + ", 연료 종류 : " + this.oilType + ")");
		} else {
			System.out.println("문제가 발생했습니다.");
			System.out.println("차량의 기존 연료 : " + this.oilType);
			System.out.println("당신이 넣은 연료 : " + selectOilType);
			System.out.println("곧 차가 고장납니다. 시동 끄고 도망가세요.");
			carFire = true;
		} // if문 종료
					
		} // 메서드 종료
	
	// (주유하기)---------------------------------------------------------------
	
	// (차에서 나가기)---------------------------------------------------------------
	public void out() {
		if (this.carRun == false || speed == 0) {
			System.out.println("시동 종료 확인. 차량에서 빠져나갑니다.");
		} else {
			System.out.println("긴급 탈출. 달리는 차량에서 뛰어내리립니다.");
			if(speed < 80) {
				System.out.println("다쳤습니다. 시동을 끄고 내립시다.");
			} else if(speed > 80) {
				System.out.println("당신은 죽었습니다.");
			}
		} // if문 종료
	} // 메서드 종료
	// (차에서 나가기)---------------------------------------------------------------
} // 클래스 종료

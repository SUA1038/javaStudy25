package ch04;

import java.util.Scanner;

public class CarExam {

	public static void main(String[] args) {
		// 자동차 주 실행 프로그램
		Scanner input = new Scanner(System.in);
		boolean run = true;
		System.out.println("===| 차량 정보 입력 |===");
		Car myCar = new Car(); // 기본 생성자로 객체 생성
		// 생성 시 속도와 rpm과 오일량은 기본값으로 생성
		System.out.print("제조 회사 : ");
		myCar.company = input.next();

		System.out.print("차량 모델 : ");
		myCar.model = input.next();

		System.out.print("색상 : ");
		myCar.color = input.next();

		while (run) {
			System.out.println("==================");
			System.out.println("1. 차량 정보 확인");
			System.out.println("2. 차량 시동 걸기");
			System.out.println("3. 차량 조작하기");
			System.out.println("4. 차량 시동 끄기");
			System.out.println("5. 주유하기");
			System.out.println("9. 차량에서 나가기");
			System.out.println("==================");
			System.out.print(">>> ");
			String select = input.next();

			switch (select) {
			case "1":
				System.out.println("차량명 : " + myCar.company);
				System.out.println("모델명 : " + myCar.model);
				System.out.println("색상 : " + myCar.color);
				break;

			case "2":
				System.out.println("차량에 시동이 걸렸습니다.");
				myCar.start();
				break;

			case "3":
				System.out.println("주행을 시작합니다.");
				run = myCar.run(input, run);
				break;

			case "4":
				System.out.println("주행을 종료합니다.");
				myCar.stop();
				break;
				
			case "5":
				System.out.println("주유소로 진입합니다.");
				myCar.refuel(input);
				break;
				
				
			case "9":
				System.out.println("차량 밖으로 빠져나갑니다.");
				myCar.out();
				run = false;
				break;

			default:
				System.out.println("입력 오류.");
				break;
			}

		} // while문 종료

	} // 메서드 종료

} // 클래스 종료

package ch02;

import java.io.IOException;

public class WhileExam {

	public static void main(String[] args) throws Exception {
		// 키보드의 입력을 받아 제어하는 실행문

		boolean run = true; // 실행 여부를 판단
		int speed = 100; // 현재 속도는 100km/h
		int keycode = 0; // 키보드로 입력되는 값

		while (run) { // run에 초기값이 true이기 떄문에 주행 중이라는 뜻
			if (keycode != 13 && keycode != 10) { // 엔터가 아니면
				System.out.println("---------------------------");
				System.out.println("1. 엑셀 | 2. 브레이크 | 3. 중지");
				System.out.println("---------------------------");
				System.out.print("선택: ");
			} // if문 종료
			keycode = System.in.read();
			// System.out.println(keycode);

			if (keycode == 49) {
				speed += 5;
				System.out.println("현재 속도 : " + speed);
			} else if (keycode == 50) {
				speed -= 5;
				System.out.println("현재 속도 : " + speed);
			} else if (keycode == 51) {
				run = false;
				System.out.println("크루즈 기능이 종료됩니다.");
				System.out.println("현재 속도 : " + speed);
				System.out.println("안전운전 하세요.");
			} // if문 종료

		} // while문 종료

		System.out.println("프로그램 종료");
		
	}

}

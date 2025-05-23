package ch04;

public class CarGasExam {

	public static void main(String[] args) {
		CarGas myCar = new CarGas();
		
		myCar.setGas(5); // gas 양을 5로 충전
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) { // isLeftGas 메소드를 이용하여 0이면 false
			System.out.println("출발합니다.");
			myCar.run(); // 가스를 소모하여 주행하는 메소드 호출
		}
		if(myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입하세요.");
		}
	}

}

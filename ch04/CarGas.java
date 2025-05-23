package ch04;

public class CarGas {
	//필드
	int gas ;
	// 생성자 생략
	// 메소드 기입
	void setGas(int gas) {
		this.gas = gas;
	} // 리턴값이 없는 메소드로 매개 값을 받아서 gas필드 값 변경
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false ;
		}
		System.out.println("gas가 있습니다.");
		return true;
	} // gas량 유무를 판단하여 리턴

	void run() {
		while(true)
			if(gas>0) {
				System.err.println("달립니다. gas잔량 : " + gas);
				gas -= 1;
			} else {
				System.out.println("멈춥니다. gas잔량 :" + gas);
				return;
		}
	}
}

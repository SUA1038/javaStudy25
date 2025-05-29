package ch05.extended.phone;

public class DmbCellPhone extends CellPhone {
	int channel; // 자식 필드 추가
	
	// 생성자 -> 매개값을 입력받아 초기값을 진행
	DmbCellPhone(String model, String color, int channel){
		super(); // 부모 기본 생성자 호출
		this.model = model; // 부모필드
		this.color = color; // 부모필드
		this.channel = channel ; // 자신필드
	}
	
	
	// 메소드 -> 자식 클래스에 추가된 기능
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB 방송 수신을 시작합니다.");
	} // DMB 방송 시작
	void changeChannelDbm(int channel) {
		this.channel = channel ; // 채널 번호를 입력받아 채널 변경 진행
		System.out.println("채널을 " + channel + "번으로 변경합니다.");
	} // DMB 채널 변경
	void TurnOffDmb() {
		System.out.println("DMB 방송 수신을 중지합니다.");
	} // DMB 방송 종료
	
	
	
	
	
	
	
	
}

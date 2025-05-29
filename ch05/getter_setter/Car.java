package ch05.getter_setter;

public class Car {
	private int speed; // 개인적인 필드 선언
	private boolean stop;
	
	// 공용 메서드
	public int getSpeed() {
		return speed;	
	}
	
	public void setSpeed (int speed) {
		if(speed < 0) {
			this.speed = 0;
		} else {
			this.speed = speed;
		} // speed 입력값이 음수이면 0으로 입력
	} 
	
	// getter
	public boolean isStop() {
		return stop;
	}
	
	// setter
	public void setStop(boolean stop) {
		this.stop = stop ;
		this.speed = 0 ;
	} // stop값이 true이면 스톱을 진행하고 스피드를 0으로 조절
	
}

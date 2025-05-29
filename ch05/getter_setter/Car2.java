package ch05.getter_setter;

public class Car2 {
	
	private int speed ;
	private boolean stop ;
	
	public int getSpeed() {
		if(speed<0) {
			speed = 0;
		} else {
			this.speed = speed ;
		}
		return speed;
	}
	public boolean isStop() {
		return stop;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}

}

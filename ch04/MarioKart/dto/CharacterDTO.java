package ch04.MarioKart.dto;

public class CharacterDTO {
	// 필드
	
	
	private String name;
	private double speed;
	private double weight;
	private double acceleration;
	private double handling;
	
	
	// 생성자
	public CharacterDTO(String name, double speed, double weight, double acceleration, double handling) {
		super();
		this.name = name ;
		this.speed = speed ;
		this.weight = weight ;
		this.acceleration = acceleration ;
		this.handling = handling ; 
				
	}
	
	// 객체
	public String toString(){
			
		return "[ 이름 : " + name +  " | 속도 : " + speed + " | 무게 : " + weight + " | 가속도 : " + acceleration + " | 핸들링 : " + handling + "]";
	} // toString 종료
	
	public String getName() {
		return name;
	}

	public double getSpeed() {
		return speed;
	}

	public double getWeight() {
		return weight;
	}

	public double getAcceleration() {
		return acceleration;
	}

	public double getHandling() {
		return handling;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setAcceleration(double acceleration) {
		this.acceleration = acceleration;
	}

	public void setHandling(double handling) {
		this.handling = handling;
	}
	
	
	
	
} // 클래스 종료

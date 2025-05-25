package ch04.MarioKart.dto;

public class CharacterDTO {
	// 필드
	
	
	public String name;
	public double speed;
	public double weight;
	public double acceleration;
	public double handling;
	
	
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
	
	
} // 클래스 종료

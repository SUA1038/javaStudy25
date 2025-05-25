package ch04.MarioKart.dto;

public class CartDTO {

	// 객체
	public  String cartName;
	public  String cartColor;
	public  double cartSpeed;
	public  double cartWeight;
	public  double acceleration;
	
	// 생성자
	
	public CartDTO(String cartName, String cartColor, double cartSpeed, double cartWeight, double acceleration) {
		
		this.cartName = cartName ;
		this.cartColor = cartColor ;
		this.cartSpeed = cartSpeed ;
		this.cartWeight = cartWeight ;
		this.acceleration = acceleration;
		
	}
	
	
	// 메서드
	
	public String toString(){
		
		return "[ 카트명 : " + cartName +  " | 속도 : " + cartSpeed + " | 무게 : " + cartWeight + " | 가속도 : " + acceleration + "]";
		
}
	
}

package ch04.MarioKart.dto;

public class CartDTO {

	// 객체
	private String cartName;
	private String cartColor;
	private double cartSpeed;
	private double cartWeight;
	private double acceleration;
	
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

	public String getCartName() {
		return cartName;
	}


	public String getCartColor() {
		return cartColor;
	}


	public double getCartSpeed() {
		return cartSpeed;
	}


	public double getCartWeight() {
		return cartWeight;
	}


	public double getAcceleration() {
		return acceleration;
	}


	public void setCartName(String cartName) {
		this.cartName = cartName;
	}


	public void setCartColor(String cartColor) {
		this.cartColor = cartColor;
	}


	public void setCartSpeed(double cartSpeed) {
		this.cartSpeed = cartSpeed;
	}


	public void setCartWeight(double cartWeight) {
		this.cartWeight = cartWeight;
	}


	public void setAcceleration(double acceleration) {
		this.acceleration = acceleration;
	}
	
	
}


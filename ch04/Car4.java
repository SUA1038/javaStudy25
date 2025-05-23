package ch04;

public class Car4 { // Car4 클래스를 공용으로 선언
	
	// 필드 : 객체의 데이터가 저장되는 곳
	String company = "볼보" ; // 제작회사
	String model ; // 모델
	String color ; // 색상
	int maxSpeed ; // 최고속도
	int speed ; // 현재 속도
	
	// 생성자 : 객체 생성 시 초기화 역할 담당
	
	// 생성자 오버로딩 : 매개변수 타입, 개수, 순서가 다르게 선언
	// 매개 변수의 타입과 개수, 선언된 순서가 똑같은 경우 매개 변수 이름만 바꾸는 것은 생성자 오버로딩이 아니다.
	Car4(){
		
	}
	
	Car4(String model){ // 기본 생성자
		this(model, "은색", 250);
	}
	Car4(String model, String color){ 
		this.model = model; this.color = color; this.maxSpeed = 250;
	}
	
	Car4(String model, String color, int maxSpeed){
		this.model = model ; this.color = color; this.maxSpeed = maxSpeed;
	}
	

} // 클래스 종료

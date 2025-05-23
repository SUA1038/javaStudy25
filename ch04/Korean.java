package ch04;

public class Korean {
	//필드 선언
	String nation = "대한민국";
	String name ; 	// 이름
	String ssn ; 	// 주민번호
	
	// 생성자
	public Korean(String name, String ssn) {
		this.name = name ;
		this.ssn = ssn;
		// this는 객체 자신의 참조하는 것이다.
	} // Korean 종료
} // 클래스 종료

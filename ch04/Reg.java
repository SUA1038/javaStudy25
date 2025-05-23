package ch04;

public class Reg {
	
	// 필드
	String id ; 	// 아이디
	String pw ; 	// 비밀번호
	String name ;	// 이름
	int age ;	// 나이
	String gender ;	// 성별
	int num ; 		// 회원번호
	
	
	// 생성자
	Reg(){
		
	}
	
	Reg(int age, String gender){
		
	}
	
	// this()는 자신의 다른 생성자를 호출하는 코드로 반드시 생성자의 첫줄에서만 허용된다.
	Reg(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	Reg(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
	}
	
	Reg(String name, String gender, int age, int num) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	
	// 메소드
	
}

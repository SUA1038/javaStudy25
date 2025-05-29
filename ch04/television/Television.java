package ch04.television;

public class Television {
	
	// 인스턴스 -> 객체마다 다른 값을 지님
	int field1 ; // 인스턴스 필드
	void method1 () { //인스턴스 메서드
		
	}
	
	// 정적 -> 공용으로 사용하는 데이터
	static int field2 ; // 정적 필드
	static void method2 () { // 정적 메소드
		
	}
	
	static { // 정적 블록
		// fied1 = 10; // 인스턴스 필드 사용 불가
		// method1(); // 인스턴스 메소드 사용 불가
		field2 = 10;
		method2();
	}
	
	// 정적 메소드 사용 시 주의할 점
	// 객체가 없어도 실행이 되기 때문에, 내부에 인스턴스 필드나 인스턴스 메소드를 사용할 수 없다.
	// 또한 자기 자신의 참조인 this도 사용할 수 없다. 
	static void Method3() { // 정적 메소드
		// this.field1 = 10; // 컴파일 오류
		// this.method1();// 컴파일 오류
		field2 = 10;
		method2();
		
		Television tel = new Television() ;
		tel.field1 = 10 ; // 객체 생성하여 변수와 연결
		field2 = 10;
		method2();
	}
	
	
	static String company = "SAMSUNG" ;
	static String model = "LED" ;
	static String sound = "back";
	static String info ;
	
	static { // 정적 블록
		info = company + "-" + model + " sound : " + sound ;
	}

}

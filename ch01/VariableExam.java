package ch01;

public class VariableExam {

	public static void main(String[] args) {

		int mach; // 정수 타입의 mach 변수 선언
		int distance; // 정수 타입의 distance 변수 선언
		mach = 340;
		distance = mach * 60 * 60;

		System.out.println("소리가 1시간 동안 가는 거리 : " + distance + "m");

		double radius; // 실수 타입의 radius 선언
		double area; // 실수 타입의 area 선언
		radius = 10; // 실수 값을 입력
		area = radius * radius * 3.14; // 원의 넓이 계산

		System.out.print("반지름이 " + radius + " 인 원의 넓이" + area);

		char firstName; // 문자타입의 firstName 변수 생성
		char midName;
		char lastName;

		firstName = '김'; // firstName에 문자 입력
		midName = '기';
		lastName = '원';

		char firstname;
		char midname;
		char lastname;

		firstname = '이';
		midname = '성';
		lastname = '계';

		System.out.print(firstName);
		System.out.print(midName);
		System.out.println(lastName);

		System.out.print(firstname);
		System.out.print(midname);
		System.out.println(lastname);

		System.out.println("제 이름은 " + firstName + midName + lastName + "입니다.");
		System.out.println("제 이름은 " + firstname + midname + lastname + "입니다.");

		System.out.println("제 이름은 " + firstName + midname + lastName + "입니다.");
		System.out.println("제 이름은 " + firstname + midName + lastname + "입니다.");

	} // main 메서드 종료

} // 클래스 종료

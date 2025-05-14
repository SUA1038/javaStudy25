package ch01;

public class CastingExam {

	public static void main(String[] args) {
		
		int intvalue = 103029770;
		byte bytevalue = (byte) intvalue ;
		
		System.out.println(intvalue);
		System.out.println(bytevalue);
		
		
		
		int intValue = 100 ;
		byte byteValue = (byte) intValue ; // int(4byte) -> byte(11byte) 강제타입변환
		
		System.out.println(intValue);
		System.out.println(byteValue);
		
		
		
		intValue = 44032;
		char charValue = (char) intValue ; // int(4byte) -> char(2byte) 강제타입변환
		
		System.out.println(charValue);
		
		
		
		double doubleValue = 3.14 ;
		intValue = (int) doubleValue ; // double(8byte) -> int(4byte) 강제타입변환
		System.out.println(intValue);
		
		
		int i = 128 ;
		
		if ( (i<Byte.MIN_VALUE)||(i>Byte.MAX_VALUE) ) { // if문 시작
			//i의 값이 Byte의 최소값보다 작거나 최대값보다 크면
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println(Byte.MIN_VALUE + "값보다 작거나");
			System.out.println(Byte.MAX_VALUE + "값보다 큽니다.");
		} else {
		byte b = (byte) i ; // int를 byte로 강제타입변환
		System.out.println(b);
		} // if문 종료
		
	} // main 메서드 종료

} // 클래스 종료

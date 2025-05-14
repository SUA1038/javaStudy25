package ch01;

public class CastingExam2 {

	public static void main(String[] args) {

		
		int intValue = 1350 ;
		byte byteValue = (byte) intValue ; // int (4byte) -> byte(1byte) 강제타입변환
		
		System.out.println(intValue);
		System.out.println(byteValue);
		
		intValue = 248395 ;
		char charValue = (char) intValue ; // int(4byte) -> char(2byte) 강제타입변환
		System.out.println(charValue);
		
		double doubleValue = 9.3214 ;
		intValue = (int)doubleValue ; //double(8) -> int(4)
		System.out.println(intValue); // 강제타입변환
		
		byte bT1 = 20 ;
		byte bT2 = 50 ;
		int iT1 = bT1 + bT2 ;
		System.out.println("==============================");
		System.out.println(iT1);
		
		char cH1 = 'G';
		char cH2 = 4 ;
		int iT2 = cH1 + cH2 ;
		System.out.println("G의 유니코드 값 = " + iT1);
		System.out.println("4의 유니코드 값 = " + iT2);
		
				

	}

}

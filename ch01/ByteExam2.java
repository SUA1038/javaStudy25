package ch01;

public class ByteExam2 {

	public static void main(String[] args) {
		
		byte byteValue = 35 ;
		int intValue = byteValue ; // 자동타입변환
		System.out.println(intValue); 
		// byte byteValue = intValue ; 큰타입에서 작은 타입은 오류
		
		char charValue = '가';
		intValue = charValue ;
		System.out.println("가의 유니코드 값 : " + intValue);
		
		intValue = 1000 ;
		long longValue = intValue ; // int(4)를 큰타입인 long(8)로 변환
		System.out.println(longValue);
		
		intValue = 1500 ;
		double doubleValue = intValue ; // int(4)를 큰타입인 long(8)로 변환
		System.out.println(doubleValue);
		
		
		int v1 = 40 ;
		int v2 = 60 ;
		int result1 = v1 + v2 ;
		System.out.println("=============");
		System.out.println("result1 = " + result1);
		
		int result2 = v1 - v2 ;
		System.out.println(result2);
		
		int result3 = v1 * v2 ;
		System.out.println(result3);
		
		int result4 = v2 / v1 ;
		System.out.println(result4);
		
		int result5 = v2 % v1 ;
		System.out.println(result5);
		
		double result6 = (double) v2 / v1 ;
		System.out.println(result6);
	}

}

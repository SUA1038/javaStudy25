package ch01;

public class ByteExam2 {

	public static void main(String[] args) {
		// �ڵ�Ÿ�Ժ�ȯ �׽�Ʈ
		
		byte byteValue = 35 ;
		int intValue = byteValue ; // �ڵ�Ÿ�Ժ�ȯ
		System.out.println(intValue); 
		// byte byteValue = intValue ; ūŸ�Կ��� ���� Ÿ���� ��������.
		
		char charValue = '��';
		intValue = charValue ;
		System.out.println("���� �����ڵ� �� : " + intValue);
		
		intValue = 1000 ;
		long longValue = intValue ; // int(4)�� ūŸ���� long(8)���� ��ȯ
		System.out.println(longValue);
		
		intValue = 1500 ;
		double doubleValue = intValue ; // int(4)�� ūŸ���� double(8)�� ��ȯ
		System.out.println(doubleValue);
		
		// ���� Ÿ�Կ��� ū Ÿ������ �ٲٴ� ���� ������ �߻����� �ʴ´�.

		
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

package ch01;

public class PromotionExam {

	public static void main(String[] args) {
		// �ڵ�Ÿ�Ժ�ȯ �׽�Ʈ
		
		byte byteValue = 10 ;
		int intValue = byteValue ; // �ڵ�Ÿ�Ժ�ȯ
		System.out.println(intValue); // 10�� ���
		// byte byteValue = intValue ; ū Ÿ�Կ��� ���� Ÿ���� ������ ����.
		
		char charValue = '��' ;
		intValue = charValue ;
		System.out.println("���� �����ڵ� �� = " + intValue);
		
		intValue = 500 ;
		long longValue = intValue ; // int(4)�� ūŸ���� long(8)���� ��ȯ
		System.out.println(longValue);
		
		intValue = 200 ;
		double doubleValue = intValue ; // int(4)�� ūŸ���� double(8)�� ��ȯ
		System.out.println(doubleValue);
		

	}

}

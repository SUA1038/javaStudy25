package ch01;

public class CastingExam {

	public static void main(String[] args) {
		//����Ÿ�Ժ�ȯ
		
		int intvalue = 103029770;
		byte bytevalue = (byte) intvalue ;
		
		System.out.println(intvalue);
		System.out.println(bytevalue);
		
		
		
		int intValue = 100 ;
		byte byteValue = (byte) intValue ; // int(4byte) -> byte(11byte) ����Ÿ�Ժ�ȯ
		
		System.out.println(intValue);
		System.out.println(byteValue);
		
		
		
		intValue = 44032;
		char charValue = (char) intValue ; // int(4byte) -> char(2byte) ����Ÿ�Ժ�ȯ
		
		System.out.println(charValue);
		
		
		
		double doubleValue = 3.14 ;
		intValue = (int) doubleValue ; // double(8byte) -> int(4byte) ����Ÿ�Ժ�ȯ
		System.out.println(intValue);
		
		
		int i = 128 ;
		
		if ( (i<Byte.MIN_VALUE)||(i>Byte.MAX_VALUE) ) {
			//i�� ���� Byte�� �ּҰ����� �۰ų� �ִ밪���� ũ��
			System.out.println("byteŸ������ ��ȯ�� �� �����ϴ�.");
			System.out.println(Byte.MIN_VALUE + "������ �۰ų�");
			System.out.println(Byte.MAX_VALUE + "������ Ů�ϴ�.");
		} else {
		byte b = (byte) i ; // int��  byte�� ����Ÿ�Ժ�ȯ
		System.out.println(b);
		}
		
	}

}

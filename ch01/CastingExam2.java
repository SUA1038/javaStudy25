package ch01;

public class CastingExam2 {

	public static void main(String[] args) {
		// ����Ÿ�Ժ�ȯ �׽�Ʈ
		
		int intValue = 1350 ;
		byte byteValue = (byte) intValue ; // int (4byte) -> byte(1byte)�� ����Ÿ�Ժ�ȯ
		
		System.out.println(intValue);
		System.out.println(byteValue);
		
		intValue = 248395 ;
		char charValue = (char) intValue ; // int(4byte) -> char(2byte) ����Ÿ�Ժ�ȯ
		System.out.println(charValue);
		
		double doubleValue = 9.3214 ;
		intValue = (int)doubleValue ; //double(8) -> int(4)
		System.out.println(intValue); // �Ҽ����� ��������.
		
		byte bT1 = 20 ;
		byte bT2 = 50 ;
		int iT1 = bT1 + bT2 ;
		System.out.println("==============================");
		System.out.println(iT1);
		
		char cH1 = 'G';
		char cH2 = 4 ;
		int iT2 = cH1 + cH2 ;
		System.out.println("�����ڵ� = " + iT1);
		System.out.println("��¹��� = " + iT2);
		
				

	}

}

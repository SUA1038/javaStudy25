package ch01;

public class ByteExam {

	public static void main(String[] args) {
		
		//byte var1 = -128 ;
		//byte var2 = -30 ;
		//byte var3 = 0 ;
		//byte var4 = 30 ;
		//byte var5 = 127 ;
		// byte var6 = 128 ;
		
		// byte Ÿ���� -128~127���� ���ȴ�.
		
		byte Var1 = 125 ;
		int Var2 = 125 ;
		for(int i=0 ; i<5 ; i++) { //���� i�� 0~5���� 1�� ������Ű�� �ݺ���
			Var1++;		// byte 125�� 1�� ����
			Var2++;		// int 125�� 1�� ����
			
			System.out.println(" Var1 : " + Var1 + "                  Var2 : " + Var2);
			
			// 128�� �Ѿ�� ���� ������ ����.
			
		}
		

	}

}

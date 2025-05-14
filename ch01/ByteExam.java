package ch01;

public class ByteExam {

	public static void main(String[] args) {
		
		//byte var1 = -128 ;
		//byte var2 = -30 ;
		//byte var3 = 0 ;
		//byte var4 = 30 ;
		//byte var5 = 127 ;
		// byte var6 = 128 ;
		
		// byte 값이 128을 넘어가면 오류가 발생한다.
		
		byte Var1 = 125 ;
		int Var2 = 125 ;
		for(int i=0 ; i<5 ; i++) { //변수 i를 0~5까지 1씩 증가하는 반복문
			Var1++;		// byte 125를 1씩 증가
			Var2++;		// int 125를 1씩 증가
			
			System.out.println(" Var1 : " + Var1 + "			 Var2 : " + Var2);
			
			
		}
		

	}

}

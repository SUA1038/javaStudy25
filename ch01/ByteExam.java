package ch01;

public class ByteExam {

	public static void main(String[] args) {
		
		//byte var1 = -128 ;
		//byte var2 = -30 ;
		//byte var3 = 0 ;
		//byte var4 = 30 ;
		//byte var5 = 127 ;
		// byte var6 = 128 ;
		
		// byte 타입은 -128~127까지 사용된다.
		
		byte Var1 = 125 ;
		int Var2 = 125 ;
		for(int i=0 ; i<5 ; i++) { //변수 i를 0~5까지 1씩 증가시키는 반복문
			Var1++;		// byte 125를 1씩 증가
			Var2++;		// int 125를 1씩 증가
			
			System.out.println(" Var1 : " + Var1 + "                  Var2 : " + Var2);
			
			// 128을 넘어가는 값은 오류가 난다.
			
		}
		

	}

}

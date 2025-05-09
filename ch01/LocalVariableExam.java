package ch01;

public class LocalVariableExam {

	public static void main(String[] args) {
		
		int v1 = 15 ;
		int v2 = 0 ;
				
				if(v1>10) { // if 비교문. 괄호 안이 참일 경우 박스 안의 명령 실행. 명령은 박스 안에 있는 것들만 영향을 받음
					v2 = v1 + 10 ;			
				}
		
		int v3 = v1 + v2 + 5 ;
		
		System.out.println("v1의 값 : " + v1);
		System.out.println("v2의 값 : " + v2);
		System.out.println("v3의 값 : " + v3);
		
		
	}
	
}

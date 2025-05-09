package ch01;

public class ConditionalExam {

	public static void main(String[] args) {
		// 삼항연산자, score가 90 이상이면 A 등급, 80 이상이면 B등급, 나머지는 C등급으로 판단하시오.
		int score = 85 ;
		char grade = (score>90) ? 'A' : ( (score>80) ? 'B' : 'C' ) ;
		System.out.println(score + "점은 " + grade + " 등급입니다.");

		
		
		int score1 = 70 ;
		char grade1 = (score1>90) ? 'A' : ( (score1>80) ? 'B' : ( ( score1>70) ? 'C' : 'D' ) ) ;
		System.out.println(score1 + "점은 " + grade1 + " 등급입니다.");
		
		int X = 10 ;
		String Y = (X>15) ? "참" : ( (X>5) ? "약간 거짓" : "진짜 거짓") ;
		
		System.out.println(Y + " 입니다.");
		
		
		
	}

}

package ch01;

public class ConditionalExam {

	public static void main(String[] args) {
		int score = 85 ;
		char grade = (score>90) ? 'A' : ( (score>80) ? 'B' : 'C' ) ;
		System.out.println(score + "점은" + grade + " 등급입니다.");

		
		
		int score1 = 70 ;
		char grade1 = (score1>90) ? 'A' : ( (score1>80) ? 'B' : ( ( score1>70) ? 'C' : 'D' ) ) ;
		System.out.println(score1 + "점은 " + grade1 + " 등급입니다.");
		
		
		
		
	}

}

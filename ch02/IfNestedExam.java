package ch02;

public class IfNestedExam {

	public static void main(String[] args) {
		// 중첩 if문
		
		int score = (int)(Math.random()*20) + 81;
		// 81~100 사이값을 난수로 발생시킨다.
		
		System.out.println("���� ������ : " + score);
		String grade ;
		if(score >= 90) {		// 90점 이상인지를 묻는다.
			if(score >=95) {	// 95점 이상인지를 묻는다.
				grade = "A+"; 	// 95점 이상이면 A+
			} else {
				grade = "A"; 	// 90점 이상이면 A
			} 
		} else {
			if(score >=85) {	// 85점 이상인지를 묻는다.
				grade = "B+";	// 85점 이상이면 B+
			} else {
				grade = "B"; 	// 80점 이상이면 B
			}
		}
		
		System.out.println("���� : " + grade);
	}

}

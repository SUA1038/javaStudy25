package ch02;

public class IfDiceExam {

	public static void main(String[] args) {
		// if문을 활용한 주사위게임
		
		int num1 = (int)(Math.random()*45) + 1 ;
		int num2 = (int)(Math.random()*45) + 1 ;
		int num3 = (int)(Math.random()*45) + 1 ;
		int num4 = (int)(Math.random()*45) + 1 ;
		int num5 = (int)(Math.random()*45) + 1 ;
		int num6 = (int)(Math.random()*45) + 1 ;
		
		System.out.println("로또 당첨 결과");
		System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6 );

	}

}

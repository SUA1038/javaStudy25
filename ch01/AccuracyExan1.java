package ch01;

public class AccuracyExan1 {

	public static void main(String[] args) {
	
		int apple = 1 ;
		int totalPieces = apple * 10 ; // 정수로 계산하기 위해 *10
		int number = 7 ;
		int temp = totalPieces - number ; // 10 - 7 = 3 조각
		
		//double result = apple - number * pieceUnit ;
		double result = temp / 10.0 ; // 3조각을 소수점으로 표현 -> 나누기 10.0
		//System.out.println(number*pieceUnit);
		
		System.out.println("사과 한개에서");
		System.out.println("0.7 조각을 빼면");
		System.out.println(result + " 조각이 남는다.");
		
	}

}

package ch01;

public class AccuracyExan1 {

	public static void main(String[] args) {
	
		int apple = 1 ;
		int totalPieces = apple * 10 ; // ������ ����ϱ� ���� *10
		int number = 7 ;
		int temp = totalPieces - number ; // 10 - 7 = 3 ����
		
		//double result = apple - number * pieceUnit ;
		double result = temp / 10.0 ; // 3������ �Ҽ������� ǥ�� -> ������ 10.0
		//System.out.println(number*pieceUnit);
		
		System.out.println("��� �Ѱ�����");
		System.out.println("0.7 ������ ����");
		System.out.println(result + " ������ ���´�.");
		
	}

}

package ch01;

public class ConditionalExam {

	public static void main(String[] args) {
		// ���׿�����, score�� 90 �̻��̸� A ���, 80 �̻��̸� B���, �������� C������� �Ǵ��Ͻÿ�.
		int score = 85 ;
		char grade = (score>90) ? 'A' : ( (score>80) ? 'B' : 'C' ) ;
		System.out.println(score + "���� " + grade + " ����Դϴ�.");

		
		
		int score1 = 70 ;
		char grade1 = (score1>90) ? 'A' : ( (score1>80) ? 'B' : ( ( score1>70) ? 'C' : 'D' ) ) ;
		System.out.println(score1 + "���� " + grade1 + " ����Դϴ�.");
		
		int X = 10 ;
		String Y = (X>15) ? "��" : ( (X>5) ? "�ణ ����" : "��¥ ����") ;
		
		System.out.println(Y + " �Դϴ�.");
		
		
		
	}

}

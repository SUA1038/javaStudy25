package ch02;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("성적 계산 프로그램을 실행합니다..");
		System.out.println("계산에 동의하실 경우 yes를 입력해주세요..");
		System.out.print(">>> ");
		String yes = input.next();
		if (yes.equalsIgnoreCase("yes") || yes.equalsIgnoreCase("y") || yes.equalsIgnoreCase("yess") || yes.equalsIgnoreCase("ye")) {  
			
		System.out.println("성함을 입력해주세요.");
		System.out.print(">>> ");
		String name = input.next();
		

		System.out.println("국어 성적을 입력해주세요.");
		System.out.print(">>> ");
		int kor = input.nextInt();
		

		if (kor > 0 && kor <= 100) { // 국어 점수 if문 시작
			if (kor >= 90) {
				System.out.println(name + " 님의 점수는 90점 이상입니다.");
				System.out.println("점수: " + kor + " , 등급 (A)");
			} else if (kor >= 80) {
				System.out.println(name + " 님의 점수는 89~80점 입니다.");
				System.out.println("점수: " + kor + " , 등급 (B)");
			} else if (kor >= 70) {
				System.out.println(name + " 님의 점수는 79~70점 입니다.");
				System.out.println("점수: " + kor + " , 등급 (C)");
			} else if (kor >= 60) {
				System.out.println(name + "  님의 점수는 69~60점 입니다.");
				System.out.println("점수: " + kor + " , 등급 (D)");
			} else {
				System.out.println(name + " 님의 점수가 너무 낮아 F등급으로 결정되었습니다.");
				System.out.println("점수: " + kor + " , 등급 (F)");
			} // 국어 점수 if문 종료
		} else {
			System.out.println(name + "님.");
			System.out.println("���� �Է°��� " + kor + " �Դϴ�.");
		} // �������� �ԷµǾ��� ���� ��¹�
		
		System.out.println("=======================");
		System.out.println("������ ���� ������ �Է��ϼ���.");
		System.out.print(">>> ");
		int eng = input.nextInt();
		// ���� ���� �ۼ�

		if (eng > 0 && eng <= 100) { // ���� ����
			if (eng>= 90) {
				System.out.println(name + " ���� �Է��Ͻ� ������ 90�� �̻��Դϴ�.");
				System.out.println("���� : " + eng + " , ���� ��� (A)");
			} else if (eng >= 80) {
				System.out.println(name + " ���� �Է��Ͻ� ������ 89~80�� �̻��Դϴ�.");
				System.out.println("���� : " + eng + " , ���� ��� (B)");
			} else if (eng >= 70) {
				System.out.println(name + " ���� �Է��Ͻ� ������ 79~70�� �̻��Դϴ�.");
				System.out.println("���� : " + eng + " , ���� ��� (C)");
			} else if (eng >= 60) {
				System.out.println(name + " ���� �Է��Ͻ� ������ 69~60�� �̻��Դϴ�.");
				System.out.println("���� : " + eng + " , ���� ��� (D)");
			} else {
				System.out.println(name + " ���� �Է��Ͻ� ������ ���� ����� F�� �����Ǿ����ϴ�.");
				System.out.println("���� : " + eng + " , ���� ��� (F)");
			} // ���� ���� ��� ���� ���
		} else {
			System.out.println(name + " ��, �Է°��� Ȯ���� �ּ���.");
			System.out.println("���� �Է°��� " + eng + " �Դϴ�.");
		} // �������� �ԷµǾ��� ���� ��¹�
	
		System.out.println("=======================");
		System.out.println("������ ���� ������ �Է��ϼ���.");
		System.out.print(">>> ");
		int mat = input.nextInt();
		// ���� ���� �ۼ�

		if (mat > 0 && mat <= 100) { // ���� ����
			if (mat >= 90) {
				System.out.println(name + " ���� �Է��Ͻ� ������ 90�� �̻��Դϴ�.");
				System.out.println("���� : " + mat + " , ���� ��� (A)");
			} else if (mat >= 80) {
				System.out.println(name + " ���� �Է��Ͻ� ������ 89~80�� �̻��Դϴ�.");
				System.out.println("���� : " + mat + " , ���� ��� (B)");
			} else if (mat >= 70) {
				System.out.println(name + " ���� �Է��Ͻ� ������ 79~70�� �̻��Դϴ�.");
				System.out.println("���� : " + mat + " , ���� ��� (C)");
			} else if (mat >= 60) {
				System.out.println(name + " ���� �Է��Ͻ� ������ 69~60�� �̻��Դϴ�.");
				System.out.println("���� : " + mat + " , ���� ��� (D)");
			} else {
				System.out.println(name + " ���� �Է��Ͻ� ������ ���� ����� F�� �����Ǿ����ϴ�.");
				System.out.println("���� : " + mat + " , ���� ��� (F)");
			} // ���� ���� ��� ���� ���
		} else {
			System.out.println(name + " ��, �Է°��� Ȯ���� �ּ���.");
			System.out.println("���� �Է°��� " + mat + " �Դϴ�.");
		} // �������� �ԷµǾ��� ���� ��¹�

		
		System.out.println("===================================================");
		System.out.println("������ ��� ������ Ȯ���ϰ� �ʹٸ� ���� �׸� YES�� �Է��ϼ���.");
		System.out.print(">>> ");
		String yes2 = input.next();
		// Ű����� ��� Ȯ�� ���� üũ
		if (yes2.equalsIgnoreCase("yes") || yes2.equalsIgnoreCase("y") || yes2.equalsIgnoreCase("yess") || yes2.equalsIgnoreCase("ye")) {
			int total = kor + eng + mat; 
			// ���� ���
			double avg = (double)total / 3;
			// ��� ���
			System.out.println("��� ������ ����մϴ�.");
			System.out.println("===================================================");
			System.out.println(name + " ���� ��� ������ " + avg + " �� �Դϴ�.");
			
			if (avg >= 90) {
				System.out.println("���� 5%�� �ش��մϴ�.");
			} else if (avg >= 80) {
				System.out.println("���� 10%�� �ش��մϴ�.");
			} else if (avg >= 70) {
				System.out.println("���� 20%�� �ش��մϴ�.");
			} else if (avg >= 60) {
				System.out.println("���� 40%�� �ش��մϴ�.");
			} else {
				System.out.println("���� 40%�� �ش��մϴ�.");
			} 
						
		} else {
			System.out.println("��� ���� ����� �����մϴ�.");}
		
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	} else {
		System.out.println("���α׷� ������ �����մϴ�.");
	}
		
	}
}

package ch01;

import java.util.Scanner;

public class StringEqualsExam {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("�Ʒ� ������ ������ �м��� ���� �ۼ��ϴ� �����Դϴ�. ��Ȯ�� �Է� ��Ź�帳�ϴ�.");
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = in.nextLine();
		System.out.print("������� 6�ڸ��� �Է��ϼ��� : ");
		String age = in.nextLine();	
		System.out.print("�̸����� �Է��ϼ��� : ");
		String email = in.nextLine();
	
		System.out.println(name + "�� ��ŷ ���Ͻ� ���� ���ϵ帳�ϴ�. ������");
		System.out.println("����� �ֹε�Ϲ�ȣ ���ڸ��� " + age + "�̱���." );
		System.out.println(email + " �ּ� �� ����ϰڽ��ϴ�. �����մϴ�.");
	

	}

}

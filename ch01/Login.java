package ch01;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner(System.in) ;
		// �ֿܼ� Ű����� �� �Է��ϵ���
		
		
		System.out.println("ȸ�������� �����մϴ�.");
		System.out.println("=======================");
		
		
		System.out.println("ID�� �������ּ���.");
		System.out.print("ID : ");
		String ID = input.nextLine();
		System.out.println("ID�� Ȯ�εǾ����ϴ�.");
		// id ����
		
		System.out.println("PW�� �������ּ���.");
		System.out.print("PW : ");
		String PW = input.nextLine();
		System.out.println("PW�� Ȯ�εǾ����ϴ�.");
		// pw ����
		
		System.out.println("=======================");
		System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�. ");
		System.out.println("=======================");
		// ȸ������ �Ϸ�
		
		System.out.println("�α����� �����մϴ�.");
		System.out.print("ID : ");
		String userID = input.nextLine();
		// id �Է�
		
		System.out.print("PW : ");
		String userPW = input.nextLine();
		// pw �Է�
		
		if((userID.equals(ID)) & (userPW.equals(PW))) {	
			System.out.println("ID�� PW�� ��ġ�մϴ�.");
			System.out.println("=======================");
			System.out.println("���������� �α��� �Ǿ����ϴ�.");
			System.out.println("=======================");
			// �α��� ����
			
		} else {
			System.out.println("ID Ȥ�� PW�� ��ġ���� �ʽ��ϴ�.");
			System.out.println("=======================");
			System.out.println("�α��ο� �����Ͽ����ϴ�.");
			System.out.println("=======================");
			// �α��� ����
		}
		

	}

}

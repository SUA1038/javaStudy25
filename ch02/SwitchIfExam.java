package ch02;

import java.util.Scanner;

public class SwitchIfExam {

	public static void main(String[] args) {
		// Switch�� ���� ����̴�. 
				// ������ ������ case: �� �ִ� ���๮�� ����ȴ�.
				// if���� true�� false�� ������ 2�� ������, Switch���� �������� ���� ����� �޴´�.
				
				// ���� ó�� ���α׷��� ����� ����.
				// keypoint : C(����) R(�б�) U(����) D(����)
				// ������		: 
				// �л�		:
				// ����		:
				// ���α׷� ����
		
		
		// ������ ��� ����
		String tName1 = "�����";
		String tAge1 = "22";
		String tGender1 = "����";
		
		String tName2 = "����";
		String tAge2 = "20";
		String tGender2 = "����";
		
		// �л� ��� ����
		String sName1 = "��ȫ��";
		String sAge1 = "17";
		String sGender1 = "����";
		// ��ȫ�� �л��� ����
		int s1kor = 97;
		int s1eng = 89;
		int s1mat = 78;
		
		String sName2 = "�赵��";
		String sAge2 = "16";
		String sGender2 = "����";
		// �赵�� �л��� ����
		int s2kor = 67;
		int s2eng = 49;
		int s2mat = 96;
		
		
				
				// �޴� ����(���ĺ��� ������ �޴��� ����)
				
				Scanner input = new Scanner(System.in);
				System.out.println("===============================");
				System.out.println("==========���� ��ī����==========");
				System.out.println("==========����ó�����α׷�==========");
				System.out.println("===============================");
				System.out.println("a. ������ ����");
				System.out.println("b. �л� ����");
				System.out.println("c. ���� ����");
				System.out.println("z. ���α׷� ����");
				System.out.print("(a~z)>>> ");
				
				char select = input.next().charAt(0);
				// System.out.println("������ ���� : " + select );
				
				switch(select) { // switch�� ����
				
				//������ ���� �޴� ����
				case 'A' :
				case 'a' :
					System.out.println("������ ���� �޴��� �����ϼ̽��ϴ�.");
					System.out.println("1. ������ ���");
					System.out.println("2. ������ ����");
					System.out.println("3. ������ ����");
					System.out.println("4. ������ ����");
					System.out.print("(1~4)>>> ");
					int subSelect = input.nextInt();
					switch(subSelect){
					
					case 1 : 
						// ��ϵ� ������
						
						
						//������ ���
						System.out.println("������ ��� �޴��� �̵��մϴ�.");
						System.out.println("����� �������� �̸��� �ۼ��ϼ���.");
						System.out.print(">>> ");
						String tName3 = input.next();
						
						System.out.println("����� �������� ���̸� �ۼ��ϼ���.");
						System.out.print(">>> ");
						String tAge3 = input.next();
						
						System.out.println("����� �������� ���� �ۼ��ϼ���.");
						System.out.print(">>> ");
						String tGender3 = input.next();
						
						System.out.println(tAge3 + "�� " + tGender3 + ", " + tName3 + " ���� ��ϵǾ����ϴ�.");
						break; // ������ ���� ��� ����
						
					case 2 :
						System.out.println("������ ���� �޴��� �̵��մϴ�.");
						System.out.println("ã���ô� �������� �̸��� �ۼ��ϼ���.");
						System.out.print(">>> ");
						String teacherName = input.next();
						if (teacherName.equals(tName1)) { // ��ϵǾ��ִ� ������ ���� ���
							System.out.println(tName1 + " ���� " + tAge1 + " �� " + tGender1 + "�Դϴ�.");
						} else if (teacherName.equals(tName2)){ // ��ϵǾ��ִ� ������ ���� ���
							System.out.println(tName2 + " ���� " + tAge2 + " �� " + tGender2 + "�Դϴ�.");
						} else {
							System.out.println("��ϵ� ������ �����ϴ�.");
						}
						break; // ������ ���� ã�� ����
						
					case 3 :
						System.out.println("������ ���� �޴��� �̵��մϴ�.");
						System.out.println("�����Ϸ��� �������� �̸��� �ۼ��ϼ���.");
						System.out.print(">>> ");
						String uTName = input.next();
						if (uTName.equals(tName1)) { // ������ ���� ���� if�� ����
							System.out.println("���� ��ϵ� " + tName1 + " ���� �����Դϴ�." );
							System.out.println("�̸� : " + tName1);
							System.out.println("���� : " + tAge1);
							System.out.println("���� : " + tGender1);
							
							System.out.println("���� ����� ������ �Է����ּ���.");
							System.out.print("�̸� : ");
							String newTName1 = input.next();
							System.out.print("���� : ");
							String newTAge1 = input.next();
							System.out.print("���� : ");
							String newTGender1 = input.next();
							
							System.out.println("������ ������Ʈ �մϴ�.");
							tName1 = newTName1;
							tAge1 = newTAge1;
							tGender1 = newTGender1;		
						} else if (uTName.equals(tName2)) { // ������ ���� ���� if�� ����
							System.out.println("���� ��ϵ� " + tName2 + " ���� �����Դϴ�." );
							System.out.println("�̸� : " + tName2);
							System.out.println("���� : " + tAge2);
							System.out.println("���� : " + tGender2);
							
							System.out.println("���� ����� ������ �Է����ּ���.");
							System.out.print("�̸� : ");
							String newTName2 = input.next();
							System.out.print("���� : ");
							String newTAge2 = input.next();
							System.out.print("���� : ");
							String newTGender2 = input.next();
							
							System.out.println("������ ������Ʈ �մϴ�.");
							tName2 = newTName2;
							tAge2 = newTAge2;
							tGender2 = newTGender2;		
						} else {
							System.out.println("������ ã�� �� �����ϴ�. �ű� ����� ���ּ���.");
						} // ������ ���� ���� if�� ���� 
						
						break; // ������ ���� ���� ����
						
					case 4 : 
						System.out.println("������ ���� �޴��� �̵��մϴ�.");
						System.out.println("�����Ϸ��� �������� �̸��� �ۼ��ϼ���.");
						System.out.print(">>> ");
						String dTName = input.next();
						if (dTName.equals(tName1)) { // ������ ���� ���� if�� ����
							System.out.println(tName1 + " ���� ���� ������ �����Ͻø� yes�� �ۼ����ּ���.");
							System.out.print(">>> ");
							String yes = input.next();
							// ���� ���� if�� 1 ����
							if (yes.equalsIgnoreCase("yes")) {
								// ��ϵǾ��ִ� ���� �ʱ�ȭ
								tName1 = "�̵��";
								tAge1 = "�̵��";
								tGender1 = "�̵��";
								System.out.println("�ش� �������� ������ �����Ǿ����ϴ�.");
							} else System.out.println("������ ���� ������ ����մϴ�.");
							// ���� ���� if�� 1 ����
						} // ���� if�� ����
						else if (dTName.equals(tName2)){
							System.out.println(tName2 + " ���� ���� ������ �����Ͻø� yes�� �ۼ����ּ���.");
							System.out.print(">>> ");
							String yes = input.next();
							// ���� ���� if�� 2 ����
							if (yes.equalsIgnoreCase("yes")) {
								// ��ϵǾ��ִ� ���� �ʱ�ȭ
								tName2 = "�̵��";
								tAge2 = "�̵��";
								tGender2 = "�̵��";
								System.out.println("�ش� �������� ������ �����Ǿ����ϴ�.");
							} else System.out.println("������ ���� ������ ����մϴ�."); 
							// ���� ���� if�� 2 ����
						} else {
							System.out.println("���� ����, �ش� �ι��� Ȯ���� �� �����ϴ�.");
						} // ������ ���� ���� if�� ����
						break; // ������ ���� ���� ����
						
					default :
						System.out.println("1~4���� �Է��ϼ���.");
						System.out.println("���α׷��� �ٽ� �����ϼ���.");
						break;
						
					} // ������ ����ġ�� ����
					break; // ������ ���� �޴� ����
				
				// �л� ���� �޴� ����
				case 'B' :
				case 'b' :
					System.out.println("�л� ���� �޴��� �����ϼ̽��ϴ�.");
					System.out.println("1. �л� ���");
					System.out.println("2. �л� ����");
					System.out.println("3. �л� ����");
					System.out.println("4. �л� ����");
					System.out.print("(1~4)>>> ");
					int subSelect2 = input.nextInt();
					switch(subSelect2){ // �л� ���� switch ����
					
					// �л� ��� �޴� ����
					case 1 : 
						System.out.println("�л� ��� �޴��� �̵��մϴ�.");
						System.out.println("����� �л��� �̸��� �ۼ��ϼ���.");
						System.out.print(">>> ");
						String sName3 = input.next();
						
						System.out.println("����� �л��� ���̸� �ۼ��ϼ���.");
						System.out.print(">>> ");
						String sAge3 = input.next();
						
						System.out.println("����� �л��� ���� �ۼ��ϼ���.");
						System.out.print(">>> ");
						String sGender3 = input.next();
						
						System.out.println(sAge3 + "�� " + sGender3 + ", " + sName3 + " ���� ��ϵǾ����ϴ�.");	
					break;
					// �л� ��� �޴� ����
					
					// �л� ���� �޴� ����
					case 2 : 
						System.out.println("�л� ���� �޴��� �̵��մϴ�.");
						System.out.println("ã���ô� �л��� �̸��� �ۼ��ϼ���.");
						System.out.print(">>> ");
						String studentName = input.next();
						if (studentName.equals(sName1)) { // ��ϵǾ��ִ� �л� ���� ���
							System.out.println(sName1 + " ���� " + sAge1 + " �� " + sGender1 + "�Դϴ�.");
						} else if (studentName.equals(sName2)){ // ��ϵǾ��ִ� ������ ���� ���
							System.out.println(sName2 + " ���� " + sAge2 + " �� " + sGender2 + "�Դϴ�.");
						} else {
							System.out.println("��ϵ� ������ �����ϴ�.");
						}
					break;
					// �л� ���� �޴� ����
					
					// �л� ���� �޴� ����
					case 3 : 
						System.out.println("�л� ���� �޴��� �̵��մϴ�.");
						System.out.println("�����Ϸ��� �л��� �̸��� �ۼ��ϼ���.");
						System.out.print(">>> ");
						String uSName = input.next();
						if (uSName.equals(sName1)) { // �л� ���� ���� if�� ����
							System.out.println("���� ��ϵ� " + sName1 + " ���� �����Դϴ�." );
							System.out.println("�̸� : " + sName1);
							System.out.println("���� : " + sAge1);
							System.out.println("���� : " + sGender1);
							
							System.out.println("���� ����� ������ �Է����ּ���.");
							System.out.print("�̸� : ");
							String newSName1 = input.next();
							System.out.print("���� : ");
							String newSAge1 = input.next();
							System.out.print("���� : ");
							String newSGender1 = input.next();
							
							System.out.println("������ ������Ʈ �մϴ�.");
							sName1 = newSName1;
							sAge1 = newSAge1;
							sGender1 = newSGender1;		
						} else if (uSName.equals(sName2)) { // ������ ���� ���� if�� ����
							System.out.println("���� ��ϵ� " + sName2 + " ���� �����Դϴ�." );
							System.out.println("�̸� : " + sName2);
							System.out.println("���� : " + sAge2);
							System.out.println("���� : " + sGender2);
							
							System.out.println("���� ����� ������ �Է����ּ���.");
							System.out.print("�̸� : ");
							String newSName2 = input.next();
							System.out.print("���� : ");
							String newSAge2 = input.next();
							System.out.print("���� : ");
							String newSGender2 = input.next();
							
							System.out.println("������ ������Ʈ �մϴ�.");
							sName2 = newSName2;
							sAge2 = newSAge2;
							sGender2 = newSGender2;		
						} else {
							System.out.println("������ ã�� �� �����ϴ�. �ű� ����� ���ּ���.");
						} // �л� ���� ���� if�� ���� 
					break;
					// �л� ���� �޴� ����
					
					// �л� ���� �޴� ����
					case 4 : 
						System.out.println("������ �л� �޴��� �̵��մϴ�.");
						System.out.println("�����Ϸ��� �л��� �̸��� �ۼ��ϼ���.");
						System.out.print(">>> ");
						String dSName = input.next();
						if (dSName.equals(sName1)) { // �л� ���� ���� if�� ����
							System.out.println(sName1 + " ���� ���� ������ �����Ͻø� yes�� �ۼ����ּ���.");
							System.out.print(">>> ");
							String yes = input.next();
							// ���� ���� if�� 1 ����
							if (yes.equalsIgnoreCase("yes")) {
								// ��ϵǾ��ִ� ���� �ʱ�ȭ
								sName1 = "�̵��";
								sAge1 = "�̵��";
								sGender1 = "�̵��";
								System.out.println("�ش� �л��� ������ �����Ǿ����ϴ�.");
							} else System.out.println("�л� ���� ������ ����մϴ�.");
							// ���� ���� if�� 1 ����
						} // ���� if�� ����
						else if (dSName.equals(sName2)){
							System.out.println(sName2 + " ���� ���� ������ �����Ͻø� yes�� �ۼ����ּ���.");
							System.out.print(">>> ");
							String yes = input.next();
							// ���� ���� if�� 2 ����
							if (yes.equalsIgnoreCase("yes")) {
								// ��ϵǾ��ִ� ���� �ʱ�ȭ
								sName2 = "�̵��";
								sAge2 = "�̵��";
								sGender2 = "�̵��";
								System.out.println("�ش� �л��� ������ �����Ǿ����ϴ�.");
							} else System.out.println("�л� ���� ������ ����մϴ�."); 
							// ���� ���� if�� 2 ����
						} else {
							System.out.println("���� ����, �ش� �ι��� Ȯ���� �� �����ϴ�.");
						} // �л� ���� ���� if�� ����
					break;
					// �л� ���� �޴� ����
					
					default :
						System.out.println("1~4���� �Է��ϼ���.");
						System.out.println("���α׷��� �ٽ� �����ϼ���.");
						break;
					} // �л� ���� switch ����
					break;
					
				case 'C' :
				case 'c' :
					System.out.println("���� ���� �޴��� �����ϼ̽��ϴ�.");
					System.out.println("1. ���� ���");
					System.out.println("2. ���� ����");
					System.out.println("3. ���� ��� ���");
					System.out.print("(1~3)>>> ");
					int subSelect3 = input.nextInt();
					switch(subSelect3){ // ���� ���� switch ����
					
					// ���� ��� �޴� ����
					case 1 :
						System.out.println("������ ���� ������ �Է��ϼ���.");
						System.out.print(">>> ");
						int kor = input.nextInt();
						// ���� ���� �ۼ�

						if (kor > 0 && kor <= 100) { // ���� ����
							if (kor >= 90) {
								System.out.println("�Է��Ͻ� ������ 90�� �̻��Դϴ�.");
								System.out.println("���� : " + kor + " , ���� ��� (A)");
							} else if (kor >= 80) {
								System.out.println("�Է��Ͻ� ������ 89~80�� �̻��Դϴ�.");
								System.out.println("���� : " + kor + " , ���� ��� (B)");
							} else if (kor >= 70) {
								System.out.println("�Է��Ͻ� ������ 79~70�� �̻��Դϴ�.");
								System.out.println("���� : " + kor + " , ���� ��� (C)");
							} else if (kor >= 60) {
								System.out.println("�Է��Ͻ� ������ 69~60�� �̻��Դϴ�.");
								System.out.println("���� : " + kor + " , ���� ��� (D)");
							} else {
								System.out.println("�Է��Ͻ� ������ ���� ����� F�� �����Ǿ����ϴ�.");
								System.out.println("���� : " + kor + " , ���� ��� (F)");
							} // ���� ���� ��� ���� ���
						} else {
							System.out.println("���� �߻�. �Է°��� Ȯ���� �ּ���.");
							System.out.println("���� �Է°��� " + kor + " �Դϴ�.");
						} // �������� �ԷµǾ��� ���� ��¹�
						
						System.out.println("������ ���� ������ �Է��ϼ���.");
						System.out.print(">>> ");
						int eng = input.nextInt();
						// ���� ���� �ۼ�

						if (eng > 0 && eng <= 100) { // ���� ����
							if (eng >= 90) {
								System.out.println("�Է��Ͻ� ������ 90�� �̻��Դϴ�.");
								System.out.println("���� : " + eng + " , ���� ��� (A)");
							} else if (eng >= 80) {
								System.out.println("�Է��Ͻ� ������ 89~80�� �̻��Դϴ�.");
								System.out.println("���� : " + eng + " , ���� ��� (B)");
							} else if (eng >= 70) {
								System.out.println("�Է��Ͻ� ������ 79~70�� �̻��Դϴ�.");
								System.out.println("���� : " + eng + " , ���� ��� (C)");
							} else if (eng >= 60) {
								System.out.println("�Է��Ͻ� ������ 69~60�� �̻��Դϴ�.");
								System.out.println("���� : " + eng + " , ���� ��� (D)");
							} else {
								System.out.println("�Է��Ͻ� ������ ���� ����� F�� �����Ǿ����ϴ�.");
								System.out.println("���� : " + eng + " , ���� ��� (F)");
							} // ���� ���� ��� ���� ���
						} else {
							System.out.println("���� �߻�. �Է°��� Ȯ���� �ּ���.");
							System.out.println("���� �Է°��� " + eng + " �Դϴ�.");
						} // �������� �ԷµǾ��� ���� ��¹�
						
						System.out.println("������ ���� ������ �Է��ϼ���.");
						System.out.print(">>> ");
						int mat = input.nextInt();
						// ���� ���� �ۼ�

						if (mat > 0 && mat <= 100) { // ���� ����
							if (mat >= 90) {
								System.out.println("�Է��Ͻ� ������ 90�� �̻��Դϴ�.");
								System.out.println("���� : " + mat + " , ���� ��� (A)");
							} else if (mat >= 80) {
								System.out.println("�Է��Ͻ� ������ 89~80�� �̻��Դϴ�.");
								System.out.println("���� : " + mat + " , ���� ��� (B)");
							} else if (mat >= 70) {
								System.out.println("�Է��Ͻ� ������ 79~70�� �̻��Դϴ�.");
								System.out.println("���� : " + mat + " , ���� ��� (C)");
							} else if (mat >= 60) {
								System.out.println("�Է��Ͻ� ������ 69~60�� �̻��Դϴ�.");
								System.out.println("���� : " + mat + " , ���� ��� (D)");
							} else {
								System.out.println("�Է��Ͻ� ������ ���� ����� F�� �����Ǿ����ϴ�.");
								System.out.println("���� : " + mat + " , ���� ��� (F)");
							} // ���� ���� ��� ���� ���
						} else {
							System.out.println("���� �߻�. �Է°��� Ȯ���� �ּ���.");
							System.out.println("���� �Է°��� " + mat + " �Դϴ�.");
						} // �������� �ԷµǾ��� ���� ��¹�		

					break;
					// ���� ��� �޴� ����
					
					// ���� ���� �޴� ����
					case 2 :
						System.out.println("���� ���� �޴��� �̵��մϴ�.");
						System.out.println("���� ��ȸ�� �л��� �̸��� �ۼ��ϼ���.");
						System.out.print(">>> ");
						String studentName1 = input.next();
						if (studentName1.equals(sName1)) { // ��ϵǾ��ִ� �л� ���� ���
							System.out.println(sName1 + " ���� ������ ��ȸ�մϴ�.");
							if (s1eng > 0 && s1eng <= 100) {
								System.out.println("���� : " + s1kor);
								System.out.println("���� : " + s1eng);
								System.out.println("���� : " + s1mat);
							} else {
								System.out.println("���� �߻�. ������ �����ؾ� �մϴ�.");
							}
						} else if (studentName1.equals(sName2)){ // ��ϵǾ��ִ� �л� ���� ���
							System.out.println(sName2 + " ���� ������ ��ȸ�մϴ�.");
							if (s2eng > 0 && s2eng <= 100) {
								System.out.println("���� : " + s2kor);
								System.out.println("���� : " + s2eng);
								System.out.println("���� : " + s2mat);
							} else {
								System.out.println("���� �߻�. ������ �����ؾ� �մϴ�.");
							}
						} else {
							System.out.println("��ϵ� ������ �����ϴ�.");
						}
					break;
					// ���� ���� �޴� ����
					
					// ���� ��� ��� ����
					case 3 :
						System.out.println("���� ��� ��� �޴��� �̵��մϴ�.");
						System.out.println("���� ����� ����� �л��� �̸��� �ۼ��ϼ���.");
						System.out.print(">>> ");
						String studentName2 = input.next();
							
					if (studentName2.equals(sName1)) {
							System.out.println(sName1 + " ���� ������ ��ȸ�մϴ�.");
							if (s1eng > 0 && s1eng <= 100) {
								System.out.println("���� : " + s1kor);
								System.out.println("���� : " + s1eng);
								System.out.println("���� : " + s1mat);
							
							int total1 = s1kor + s1eng + s1mat;
							double avg1 = total1/3;
							System.out.println(sName1 + "���� ����� " + avg1 + "�Դϴ�.");
							} else {
								System.out.println("���� �߻�. ���� ������ �ʿ��մϴ�.");
							}
					} else if (studentName2.equals(sName2)) {
						System.out.println(sName2 + " ���� ������ ��ȸ�մϴ�.");
						if (s2eng > 0 && s2eng <= 100) {
							System.out.println("���� : " + s2kor);
							System.out.println("���� : " + s2eng);
							System.out.println("���� : " + s2mat);
							
							int total2 = s2kor + s2eng + s2mat;
							double avg2 = total2/3;
							System.out.println(sName2 + "���� ����� " + avg2 + "�Դϴ�.");
							} else {
								System.out.println("���� �߻�. ���� ������ �ʿ��մϴ�.");
							}
					} else {
						System.out.println("��ϵ� ������ �����ϴ�.");
					}
					break;
					// ���� ��� ��� ����
					
					
					} // ���� ���� switch ��
					break;
				
				case 'Z' :
				case 'z' :
					System.out.println("���α׷��� �����մϴ�.");
					break;
				
				default :
					System.out.println("�޴��� ���� ���ڸ� �ۼ��ϼ̽��ϴ�.");
					System.out.println("���α׷��� �ٽ� �������ּ���.");
					break;
					
				} // ����ġ�� ����
				
				
				
				
				
				

			}

		}

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
		
		
		// 선생님 정보 기입
		String tName1 = "김수아";
		int tAge1 = 22;
		String tGender1 = "여성";
		
		String tName2 = "김기원";
		int tAge2 = 20;
		String tGender2 = "남성";
		
		// 학생 정보 기입
		String sName1 = "김홍미";
		int sAge1 = 17;
		String sGender1 = "여성";
		
		String sName2 = "김도연";
		int sAge2 = 16;
		String sGender2 = "남성";
		
		
		// 학생 성적 기입
		int s1kor = 97;
		int s1eng = 89;
		int s1mat = 78;
			
		int s2kor = 67;
		int s2eng = 49;
		int s2mat = 96;
		
		
				
				// 프로그램 시작
				
				Scanner input = new Scanner(System.in);
				System.out.println("===============================");
				System.out.println("==========엠비씨 아카데미==========");
				System.out.println("==========성적처리프로그램==========");
				System.out.println("===============================");
				System.out.println("a. 교직원 관리");
				System.out.println("b. 학생 관리");
				System.out.println("c. 성적 관리");
				System.out.println("z. 프로그램 종료");
				System.out.print("(a~z)>>> ");
				
				char select = input.next().charAt(0);
				// System.out.println("������ ���� : " + select );
				
				switch(select) { // switch문 시작
				
				// 교직원 관리 case 시작
				case 'A' :
				case 'a' :
					System.out.println("교직원 관리 메뉴에 진입하셨습니다.");
					System.out.println("1. 교직원 등록");
					System.out.println("2. 교직원 보기");
					System.out.println("3. 교직원 수정");
					System.out.println("4. 교직원 삭제");
					System.out.print("(1~4)>>> ");
					int subSelect = input.nextInt();
					switch(subSelect){ // 교직원 관리 메뉴 switch 시작 
					
					case 1 : 
						// 교직원 관리 메뉴 case 시작
						
						
						//교직원 등록 case 시작
						System.out.println("교직원 등록 메뉴에 진입하셨습니다.");
						System.out.println("등록할 교직원의 이름을 작성해주세요.");
						System.out.print(">>> ");
						String tName3 = input.next();
						
						System.out.println("등록할 교직원의 나이를 작성해주세요.");
						System.out.print(">>> ");
						int tAge3 = input.nextInt();
						
						System.out.println("등록할 교직원의 성별을 작성해주세요.");
						System.out.print(">>> ");
						String tGender3 = input.next();
						
						System.out.println(tAge3 + "세 " + tGender3 + ", " + tName3 + " 님의 등록이 완료되었습니다.");
						break; // 교직원 등록 case 종료
						
					case 2 :
						System.out.println("교직원 보기 메뉴에 진입하셨습니다.");
						System.out.println("찾아볼 교직원의 이름을 작성해주세요.");
						System.out.print(">>> ");
						String teacherName = input.next();
						if (teacherName.equals(tName1)) { // 교직원 보기 if문 시작
							System.out.println(tName1 + " 님은 " + tAge1 + " 세 " + tGender1 + " 입니다.");
						} else if (teacherName.equals(tName2)){ // ��ϵǾ��ִ� ������ ���� ���
							System.out.println(tName2 + " 님은 " + tAge2 + " 세 " + tGender2 + " 입니다.");
						} else {
							System.out.println("등록되지 않은 이름입니다.");
						}
						break; // 교직원 보기 case 종료
						
					case 3 :
						System.out.println("교직원 수정 메뉴에 진입하셨습니다.");
						System.out.println("수정할 교직원의 이름을 작성해주세요.");
						System.out.print(">>> ");
						String uTName = input.next();
						if (uTName.equals(tName1)) { // 교직원 수정 if문 시작
							System.out.println("현재 등록된 " + tName1 + " 님의 정보입니다." );
							System.out.println("이름 : " + tName1);
							System.out.println("나이 : " + tAge1);
							System.out.println("성별 : " + tGender1);
							
							System.out.println("수정할 정보를 입력해주세요.");
							System.out.print("이름 : ");
							String newTName1 = input.next();
							System.out.print("나이 : ");
							int newTAge1 = input.nextInt();
							System.out.print("성별 : ");
							String newTGender1 = input.next();
							
							System.out.println("정보가 정상적으로 수정되었습니다.");
							tName1 = newTName1;
							tAge1 = newTAge1;
							tGender1 = newTGender1;		
						} else if (uTName.equals(tName2)) { // 
							System.out.println("현재 등록된" + tName2 + " 님의 정보입니다." );
							System.out.println("아룸 : " + tName2);
							System.out.println("나이 : " + tAge2);
							System.out.println("성별 : " + tGender2);
							
							System.out.println("수정할 정보를 입력해주세요.");
							System.out.print("이름 : ");
							String newTName2 = input.next();
							System.out.print("나이 : ");
							int newTAge2 = input.nextInt();
							System.out.print("성별 : ");
							String newTGender2 = input.next();
							
							System.out.println("정보가 정상적으로 수정되었습니다.");
							tName2 = newTName2;
							tAge2 = newTAge2;
							tGender2 = newTGender2;		
						} else {
							System.out.println("해당되는 교직원 정보가 없습니다.");
						} 
						
						break; // 교직원 수정 case 종료
						
					case 4 : 
						System.out.println("교직원 삭제 메뉴로 진입하였습니다.");
						System.out.println("삭제할 .");
						System.out.print(">>> ");
						String dTName = input.next();
						if (dTName.equals(tName1)) { // 교직원 삭제 if문 시작
							System.out.println(tName1 + " 님의 정보 삭제를 원하시면 yes를 입력해주세요.");
							System.out.print(">>> ");
							String yes = input.next();
							if (yes.equalsIgnoreCase("yes")) {
								// 삭제 확인
								tName1 = "요청에 의해 삭제되었습니다.";
								tAge1 = 00;
								tGender1 = "요청에 의해 삭제되었습니다.";
								System.out.println("교직원 정보가 정상적으로 삭제되었습니다.");
							} else System.out.println("교직원 정보 삭제가 취소되었습니다.");
						} // ���� if�� ����
						else if (dTName.equals(tName2)){
							System.out.println(tName2 + " 님의 정보 삭제를 원하시면 yes를 입력해주세요.");
							System.out.print(">>> ");
							String yes = input.next();
							// ���� ���� if�� 2 ����
							if (yes.equalsIgnoreCase("yes")) {
								// ��ϵǾ��ִ� ���� �ʱ�ȭ
								tName2 = "요청에 의해 삭제되었습니다.";
								tAge2 = 00;
								tGender2 = "요청에 의해 삭제되었습니다.";
								System.out.println("교직원 정보가 정상적으로 삭제되었습니다.");
							} else System.out.println("교직원 정보 삭제가 취소되었습니다."); 
							// ���� ���� if�� 2 ����
						} else System.out.println("해당되는 교직원 정보가 없습니다.");
						} // ������ ���� ���� if�� ����
						break; // ������ ���� ���� ����
						
					default :
						System.out.println("1~4 사이의 메뉴를 다시 선택해주세요.");
						break;				
				
				// 학생 관리 case 시작
				case 'B' :
				case 'b' :
					System.out.println("학생 관리 메뉴로 진입했습니다.");
					System.out.println("1. 학생 등록");
					System.out.println("2. 학생 보기");
					System.out.println("3. 학생 수정");
					System.out.println("4. 학생 삭제");
					System.out.print("(1~4)>>> ");
					int subSelect2 = input.nextInt();
					switch(subSelect2){ // 학생 관리 switch 문 시작
					
					// 학생 등록 메뉴 case 시작
					case 1 : 
						System.out.println("학생 등록 메뉴로 진입했습니다.");
						System.out.println("등록할 학생의 이름을 작성해주세요.");
						System.out.print(">>> ");
						String sName3 = input.next();
						
						System.out.println("등록할 학생의 나이를 작성해주세요.");
						System.out.print(">>> ");
						int sAge3 = input.nextInt();
						
						System.out.println("등록할 학생의 성별을 작성해주세요.");
						System.out.print(">>> ");
						String sGender3 = input.next();
						
						System.out.println(sAge3 + "세 " + sGender3 + ", " + sName3 + " 님이 등록되었습니다.");	
					break;
					// 학생 등록 메뉴 case 종료
					
					// 학생 보기 메뉴 case 시작
					case 2 : 
						System.out.println("학생 보기 메뉴로 진입했습니다.");
						System.out.println("확인할 학생의 이름을 작성해주세요.");
						System.out.print(">>> ");
						String studentName = input.next();
						if (studentName.equals(sName1)) { 
							System.out.println(sName1 + " 님은 " + sAge1 + " 세 " + sGender1 + " 입니다.");
						} else if (studentName.equals(sName2)){ // ��ϵǾ��ִ� ������ ���� ���
							System.out.println(sName2 + " 님은 " + sAge2 + " 세 " + sGender2 + " 입니다.");
						} else {
							System.out.println("해당되는 학생 정보가 없습니다.");
						}
					break;
					// 학생 보기 메뉴 case 종료
					
					// 학생 수정 메뉴 case 시작
					case 3 : 
						System.out.println("학생 수정 메뉴로 진입했습니다.");
						System.out.println("수정할 학생의 이름을 작성해주세요.");
						System.out.print(">>> ");
						String uSName = input.next();
						if (uSName.equals(sName1)) { // �л� ���� ���� if�� ����
							System.out.println("현재 등록된 " + sName1 + " 님의 정보입니다." );
							System.out.println("이름 : " + sName1);
							System.out.println("나이 : " + sAge1);
							System.out.println("성별 : " + sGender1);
							
							System.out.println("수정할 정보를 입력해주세요.");
							System.out.print("이름 : ");
							String newSName1 = input.next();
							System.out.print("나이 : ");
							int newSAge1 = input.nextInt();
							System.out.print("성별 : ");
							String newSGender1 = input.next();
							
							System.out.println("정보가 정상적으로 수정되었습니다.");
							sName1 = newSName1;
							sAge1 = newSAge1;
							sGender1 = newSGender1;		
						} else if (uSName.equals(sName2)) { 
							System.out.println("현재 등록된 " + sName2 + "님의 정보입니다." );
							System.out.println("이름 : " + sName2);
							System.out.println("나이 : " + sAge2);
							System.out.println("성별 : " + sGender2);
							
							System.out.println("수정할 정보를 입력해주세요.");
							System.out.print("이름 : ");
							String newSName2 = input.next();
							System.out.print("나이 : ");
							int newSAge2 = input.nextInt();
							System.out.print("성별 : ");
							String newSGender2 = input.next();
							
							System.out.println("정보가 정상적으로 수정되었습니다.");
							sName2 = newSName2;
							sAge2 = newSAge2;
							sGender2 = newSGender2;		
						} else {
							System.out.println("등록된 정보가 없습니다.");
						} // if문 종료
					break;
					// 학생 수정 메뉴 종료
					
					// 학생 삭제 case 시작
					case 4 : 
						System.out.println("학생 삭제 메뉴로 진입했습니다.");
						System.out.println("삭제할 학생의 이름을 작성해주세요.");
						System.out.print(">>> ");
						String dSName = input.next();
						if (dSName.equals(sName1)) { // if문 시작
							System.out.println(sName1 + "정말로 정보를 삭제하시겠습니까? 삭제를 원하면 yes를 입력해주세요.");
							System.out.print(">>> ");
							String yes = input.next();
							if (yes.equalsIgnoreCase("yes")) {
								sName1 = "삭제된 정보입니다.";
								sAge1 = 00;
								sGender1 = "삭제된 정보입니다.";
								System.out.println("정보가 정상적으로 삭제되었습니다.");
							} else System.out.println("정보 삭제를 취소합니다.");
							// if문 종료
						} // ���� if�� ����
						else if (dSName.equals(sName2)){
							System.out.println(sName2 + " 정말로 정보를 삭제하시겠습니까? 삭제를 원하면 yes를 입력해주세요.");
							System.out.print(">>> ");
							String yes = input.next();
							// ���� ���� if�� 2 ����
							if (yes.equalsIgnoreCase("yes")) {
								// ��ϵǾ��ִ� ���� �ʱ�ȭ
								sName2 = "삭제된 정보입니다.";
								sAge2 = 00;
								sGender2 = "삭제된 정보입니다.";
								System.out.println("정보가 정상적으로 삭제되었습니다.");
							} else System.out.println("정보 삭제를 취소합니다."); 
							// ���� ���� if�� 2 ����
						} else {
							System.out.println("등록된 정보가 없습니다.");
						} // �л� ���� ���� if�� ����
					break;
					// �л� ���� �޴� ����
					
					default :
						System.out.println("1~4의 값을 입력해주세요.");
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
			
					
				} // ����ġ�� ����

}

}

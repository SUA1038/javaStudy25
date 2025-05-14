package ch02;

import java.util.Scanner;

public class SwitchIfExam {

	public static void main(String[] args) {
		// Switch는 조건 제어문이다. 
				// 조건이 맞으면 case: 에 있는 실행문이 실행된다.
				// if문은 true나 false의 조건이 2개 있지만, Switch문은 여러개의 조건 결과를 받는다.
				
				// 성적 처리 프로그램을 만들어 보자.
				// keypoint : C(생성) R(읽기) U(수정) D(삭제)
				// 교직원		: 
				// 학생		:
				// 성적		:
				// 프로그램 종료
		
		
		// 교직원 등록 정보
		String tName1 = "김수아";
		String tAge1 = "22";
		String tGender1 = "여성";
		
		String tName2 = "김기원";
		String tAge2 = "20";
		String tGender2 = "남성";
		
		// 학생 등록 정보
		String sName1 = "김홍미";
		String sAge1 = "17";
		String sGender1 = "여성";
		// 김홍미 학생의 성적
		int s1kor = 97;
		int s1eng = 89;
		int s1mat = 78;
		
		String sName2 = "김도연";
		String sAge2 = "16";
		String sGender2 = "남성";
		// 김도연 학생의 성적
		int s2kor = 67;
		int s2eng = 49;
		int s2mat = 96;
		
		
				
				// 메뉴 구현(알파벳을 눌러서 메뉴로 진입)
				
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
				// System.out.println("선택한 문자 : " + select );
				
				switch(select) { // switch문 시작
				
				//교직원 관리 메뉴 시작
				case 'A' :
				case 'a' :
					System.out.println("교직원 관리 메뉴로 진입하셨습니다.");
					System.out.println("1. 교직원 등록");
					System.out.println("2. 교직원 보기");
					System.out.println("3. 교직원 수정");
					System.out.println("4. 교직원 삭제");
					System.out.print("(1~4)>>> ");
					int subSelect = input.nextInt();
					switch(subSelect){
					
					case 1 : 
						// 등록된 교직원
						
						
						//교직원 등록
						System.out.println("교직원 등록 메뉴로 이동합니다.");
						System.out.println("등록할 교직원의 이름을 작성하세요.");
						System.out.print(">>> ");
						String tName3 = input.next();
						
						System.out.println("등록할 교직원의 나이를 작성하세요.");
						System.out.print(">>> ");
						String tAge3 = input.next();
						
						System.out.println("등록할 교직원의 성별 작성하세요.");
						System.out.print(">>> ");
						String tGender3 = input.next();
						
						System.out.println(tAge3 + "세 " + tGender3 + ", " + tName3 + " 님이 등록되었습니다.");
						break; // 교직원 정보 등록 종료
						
					case 2 :
						System.out.println("교직원 보기 메뉴로 이동합니다.");
						System.out.println("찾으시는 교직원의 이름을 작성하세요.");
						System.out.print(">>> ");
						String teacherName = input.next();
						if (teacherName.equals(tName1)) { // 등록되어있는 선생님 정보 출력
							System.out.println(tName1 + " 님은 " + tAge1 + " 세 " + tGender1 + "입니다.");
						} else if (teacherName.equals(tName2)){ // 등록되어있는 선생님 정보 출력
							System.out.println(tName2 + " 님은 " + tAge2 + " 세 " + tGender2 + "입니다.");
						} else {
							System.out.println("등록된 정보가 없습니다.");
						}
						break; // 교직원 정보 찾기 종료
						
					case 3 :
						System.out.println("교직원 수정 메뉴로 이동합니다.");
						System.out.println("수정하려는 교직원의 이름을 작성하세요.");
						System.out.print(">>> ");
						String uTName = input.next();
						if (uTName.equals(tName1)) { // 교직원 정보 수정 if문 시작
							System.out.println("현재 등록된 " + tName1 + " 님의 정보입니다." );
							System.out.println("이름 : " + tName1);
							System.out.println("나이 : " + tAge1);
							System.out.println("성별 : " + tGender1);
							
							System.out.println("새로 등록할 정보를 입력해주세요.");
							System.out.print("이름 : ");
							String newTName1 = input.next();
							System.out.print("나이 : ");
							String newTAge1 = input.next();
							System.out.print("성별 : ");
							String newTGender1 = input.next();
							
							System.out.println("정보를 업데이트 합니다.");
							tName1 = newTName1;
							tAge1 = newTAge1;
							tGender1 = newTGender1;		
						} else if (uTName.equals(tName2)) { // 교직원 정보 수정 if문 시작
							System.out.println("현재 등록된 " + tName2 + " 님의 정보입니다." );
							System.out.println("이름 : " + tName2);
							System.out.println("나이 : " + tAge2);
							System.out.println("성별 : " + tGender2);
							
							System.out.println("새로 등록할 정보를 입력해주세요.");
							System.out.print("이름 : ");
							String newTName2 = input.next();
							System.out.print("나이 : ");
							String newTAge2 = input.next();
							System.out.print("성별 : ");
							String newTGender2 = input.next();
							
							System.out.println("정보를 업데이트 합니다.");
							tName2 = newTName2;
							tAge2 = newTAge2;
							tGender2 = newTGender2;		
						} else {
							System.out.println("정보를 찾을 수 없습니다. 신규 등록을 해주세요.");
						} // 교직원 정보 수정 if문 종료 
						
						break; // 교직원 정보 수정 종료
						
					case 4 : 
						System.out.println("교직원 삭제 메뉴로 이동합니다.");
						System.out.println("삭제하려는 교직원의 이름을 작성하세요.");
						System.out.print(">>> ");
						String dTName = input.next();
						if (dTName.equals(tName1)) { // 교직원 정보 삭제 if문 시작
							System.out.println(tName1 + " 님의 정보 삭제를 동의하시면 yes를 작성해주세요.");
							System.out.print(">>> ");
							String yes = input.next();
							// 삭제 동의 if문 1 시작
							if (yes.equalsIgnoreCase("yes")) {
								// 등록되어있는 정보 초기화
								tName1 = "미등록";
								tAge1 = "미등록";
								tGender1 = "미등록";
								System.out.println("해당 교직원의 정보가 삭제되었습니다.");
							} else System.out.println("교직원 정보 삭제를 취소합니다.");
							// 삭제 동의 if문 1 종료
						} // 삭제 if문 종료
						else if (dTName.equals(tName2)){
							System.out.println(tName2 + " 님의 정보 삭제를 동의하시면 yes를 작성해주세요.");
							System.out.print(">>> ");
							String yes = input.next();
							// 삭제 동의 if문 2 시작
							if (yes.equalsIgnoreCase("yes")) {
								// 등록되어있는 정보 초기화
								tName2 = "미등록";
								tAge2 = "미등록";
								tGender2 = "미등록";
								System.out.println("해당 교직원의 정보가 삭제되었습니다.");
							} else System.out.println("교직원 정보 삭제를 취소합니다."); 
							// 삭제 동의 if문 2 종료
						} else {
							System.out.println("오류 추정, 해당 인물을 확인할 수 없습니다.");
						} // 교직원 정보 삭제 if문 종료
						break; // 교직원 정보 삭제 종료
						
					default :
						System.out.println("1~4값만 입력하세요.");
						System.out.println("프로그램을 다시 실행하세요.");
						break;
						
					} // 교직원 스위치문 종료
					break; // 교직원 관리 메뉴 종료
				
				// 학생 관리 메뉴 시작
				case 'B' :
				case 'b' :
					System.out.println("학생 관리 메뉴로 진입하셨습니다.");
					System.out.println("1. 학생 등록");
					System.out.println("2. 학생 보기");
					System.out.println("3. 학생 수정");
					System.out.println("4. 학생 삭제");
					System.out.print("(1~4)>>> ");
					int subSelect2 = input.nextInt();
					switch(subSelect2){ // 학생 관리 switch 시작
					
					// 학생 등록 메뉴 시작
					case 1 : 
						System.out.println("학생 등록 메뉴로 이동합니다.");
						System.out.println("등록할 학생의 이름을 작성하세요.");
						System.out.print(">>> ");
						String sName3 = input.next();
						
						System.out.println("등록할 학생의 나이를 작성하세요.");
						System.out.print(">>> ");
						String sAge3 = input.next();
						
						System.out.println("등록할 학생의 성별 작성하세요.");
						System.out.print(">>> ");
						String sGender3 = input.next();
						
						System.out.println(sAge3 + "세 " + sGender3 + ", " + sName3 + " 님이 등록되었습니다.");	
					break;
					// 학생 등록 메뉴 종료
					
					// 학생 보기 메뉴 시작
					case 2 : 
						System.out.println("학생 보기 메뉴로 이동합니다.");
						System.out.println("찾으시는 학생의 이름을 작성하세요.");
						System.out.print(">>> ");
						String studentName = input.next();
						if (studentName.equals(sName1)) { // 등록되어있는 학생 정보 출력
							System.out.println(sName1 + " 님은 " + sAge1 + " 세 " + sGender1 + "입니다.");
						} else if (studentName.equals(sName2)){ // 등록되어있는 선생님 정보 출력
							System.out.println(sName2 + " 님은 " + sAge2 + " 세 " + sGender2 + "입니다.");
						} else {
							System.out.println("등록된 정보가 없습니다.");
						}
					break;
					// 학생 보기 메뉴 종료
					
					// 학생 수정 메뉴 시작
					case 3 : 
						System.out.println("학생 수정 메뉴로 이동합니다.");
						System.out.println("수정하려는 학생의 이름을 작성하세요.");
						System.out.print(">>> ");
						String uSName = input.next();
						if (uSName.equals(sName1)) { // 학생 정보 수정 if문 시작
							System.out.println("현재 등록된 " + sName1 + " 님의 정보입니다." );
							System.out.println("이름 : " + sName1);
							System.out.println("나이 : " + sAge1);
							System.out.println("성별 : " + sGender1);
							
							System.out.println("새로 등록할 정보를 입력해주세요.");
							System.out.print("이름 : ");
							String newSName1 = input.next();
							System.out.print("나이 : ");
							String newSAge1 = input.next();
							System.out.print("성별 : ");
							String newSGender1 = input.next();
							
							System.out.println("정보를 업데이트 합니다.");
							sName1 = newSName1;
							sAge1 = newSAge1;
							sGender1 = newSGender1;		
						} else if (uSName.equals(sName2)) { // 교직원 정보 수정 if문 시작
							System.out.println("현재 등록된 " + sName2 + " 님의 정보입니다." );
							System.out.println("이름 : " + sName2);
							System.out.println("나이 : " + sAge2);
							System.out.println("성별 : " + sGender2);
							
							System.out.println("새로 등록할 정보를 입력해주세요.");
							System.out.print("이름 : ");
							String newSName2 = input.next();
							System.out.print("나이 : ");
							String newSAge2 = input.next();
							System.out.print("성별 : ");
							String newSGender2 = input.next();
							
							System.out.println("정보를 업데이트 합니다.");
							sName2 = newSName2;
							sAge2 = newSAge2;
							sGender2 = newSGender2;		
						} else {
							System.out.println("정보를 찾을 수 없습니다. 신규 등록을 해주세요.");
						} // 학생 정보 수정 if문 종료 
					break;
					// 학생 수정 메뉴 종료
					
					// 학생 삭제 메뉴 시작
					case 4 : 
						System.out.println("교직원 학생 메뉴로 이동합니다.");
						System.out.println("삭제하려는 학생의 이름을 작성하세요.");
						System.out.print(">>> ");
						String dSName = input.next();
						if (dSName.equals(sName1)) { // 학생 정보 삭제 if문 시작
							System.out.println(sName1 + " 님의 정보 삭제를 동의하시면 yes를 작성해주세요.");
							System.out.print(">>> ");
							String yes = input.next();
							// 삭제 동의 if문 1 시작
							if (yes.equalsIgnoreCase("yes")) {
								// 등록되어있는 정보 초기화
								sName1 = "미등록";
								sAge1 = "미등록";
								sGender1 = "미등록";
								System.out.println("해당 학생의 정보가 삭제되었습니다.");
							} else System.out.println("학생 정보 삭제를 취소합니다.");
							// 삭제 동의 if문 1 종료
						} // 삭제 if문 종료
						else if (dSName.equals(sName2)){
							System.out.println(sName2 + " 님의 정보 삭제를 동의하시면 yes를 작성해주세요.");
							System.out.print(">>> ");
							String yes = input.next();
							// 삭제 동의 if문 2 시작
							if (yes.equalsIgnoreCase("yes")) {
								// 등록되어있는 정보 초기화
								sName2 = "미등록";
								sAge2 = "미등록";
								sGender2 = "미등록";
								System.out.println("해당 학생의 정보가 삭제되었습니다.");
							} else System.out.println("학생 정보 삭제를 취소합니다."); 
							// 삭제 동의 if문 2 종료
						} else {
							System.out.println("오류 추정, 해당 인물을 확인할 수 없습니다.");
						} // 학생 정보 삭제 if문 종료
					break;
					// 학생 삭제 메뉴 종료
					
					default :
						System.out.println("1~4값만 입력하세요.");
						System.out.println("프로그램을 다시 실행하세요.");
						break;
					} // 학생 관리 switch 종료
					break;
					
				case 'C' :
				case 'c' :
					System.out.println("성적 관리 메뉴로 진입하셨습니다.");
					System.out.println("1. 성적 등록");
					System.out.println("2. 성적 보기");
					System.out.println("3. 성적 평균 계산");
					System.out.print("(1~3)>>> ");
					int subSelect3 = input.nextInt();
					switch(subSelect3){ // 성적 관리 switch 시작
					
					// 성적 등록 메뉴 시작
					case 1 :
						System.out.println("귀하의 국어 점수를 입력하세요.");
						System.out.print(">>> ");
						int kor = input.nextInt();
						// 국어 점수 작성

						if (kor > 0 && kor <= 100) { // 점수 검증
							if (kor >= 90) {
								System.out.println("입력하신 점수가 90점 이상입니다.");
								System.out.println("점수 : " + kor + " , 국어 등급 (A)");
							} else if (kor >= 80) {
								System.out.println("입력하신 점수가 89~80점 이상입니다.");
								System.out.println("점수 : " + kor + " , 국어 등급 (B)");
							} else if (kor >= 70) {
								System.out.println("입력하신 점수가 79~70점 이상입니다.");
								System.out.println("점수 : " + kor + " , 국어 등급 (C)");
							} else if (kor >= 60) {
								System.out.println("입력하신 점수가 69~60점 이상입니다.");
								System.out.println("점수 : " + kor + " , 국어 등급 (D)");
							} else {
								System.out.println("입력하신 점수가 낮아 등급이 F로 결정되었습니다.");
								System.out.println("점수 : " + kor + " , 국어 등급 (F)");
							} // 국어 점수 결과 정상 출력
						} else {
							System.out.println("오류 발생. 입력값을 확인해 주세요.");
							System.out.println("현재 입력값은 " + kor + " 입니다.");
						} // 오류값이 입력되었을 때의 출력문
						
						System.out.println("귀하의 영어 점수를 입력하세요.");
						System.out.print(">>> ");
						int eng = input.nextInt();
						// 영어 점수 작성

						if (eng > 0 && eng <= 100) { // 점수 검증
							if (eng >= 90) {
								System.out.println("입력하신 점수가 90점 이상입니다.");
								System.out.println("점수 : " + eng + " , 영어 등급 (A)");
							} else if (eng >= 80) {
								System.out.println("입력하신 점수가 89~80점 이상입니다.");
								System.out.println("점수 : " + eng + " , 영어 등급 (B)");
							} else if (eng >= 70) {
								System.out.println("입력하신 점수가 79~70점 이상입니다.");
								System.out.println("점수 : " + eng + " , 영어 등급 (C)");
							} else if (eng >= 60) {
								System.out.println("입력하신 점수가 69~60점 이상입니다.");
								System.out.println("점수 : " + eng + " , 영어 등급 (D)");
							} else {
								System.out.println("입력하신 점수가 낮아 등급이 F로 결정되었습니다.");
								System.out.println("점수 : " + eng + " , 영어 등급 (F)");
							} // 국어 점수 결과 정상 출력
						} else {
							System.out.println("오류 발생. 입력값을 확인해 주세요.");
							System.out.println("현재 입력값은 " + eng + " 입니다.");
						} // 오류값이 입력되었을 때의 출력문
						
						System.out.println("귀하의 수학 점수를 입력하세요.");
						System.out.print(">>> ");
						int mat = input.nextInt();
						// 수학 점수 작성

						if (mat > 0 && mat <= 100) { // 점수 검증
							if (mat >= 90) {
								System.out.println("입력하신 점수가 90점 이상입니다.");
								System.out.println("점수 : " + mat + " , 수학 등급 (A)");
							} else if (mat >= 80) {
								System.out.println("입력하신 점수가 89~80점 이상입니다.");
								System.out.println("점수 : " + mat + " , 수학 등급 (B)");
							} else if (mat >= 70) {
								System.out.println("입력하신 점수가 79~70점 이상입니다.");
								System.out.println("점수 : " + mat + " , 수학 등급 (C)");
							} else if (mat >= 60) {
								System.out.println("입력하신 점수가 69~60점 이상입니다.");
								System.out.println("점수 : " + mat + " , 수학 등급 (D)");
							} else {
								System.out.println("입력하신 점수가 낮아 등급이 F로 결정되었습니다.");
								System.out.println("점수 : " + mat + " , 수학 등급 (F)");
							} // 수학 점수 결과 정상 출력
						} else {
							System.out.println("오류 발생. 입력값을 확인해 주세요.");
							System.out.println("현재 입력값은 " + mat + " 입니다.");
						} // 오류값이 입력되었을 때의 출력문		

					break;
					// 성적 등록 메뉴 종료
					
					// 성적 보기 메뉴 시작
					case 2 :
						System.out.println("성적 보기 메뉴로 이동합니다.");
						System.out.println("성적 조회할 학생의 이름을 작성하세요.");
						System.out.print(">>> ");
						String studentName1 = input.next();
						if (studentName1.equals(sName1)) { // 등록되어있는 학생 정보 출력
							System.out.println(sName1 + " 님의 성적을 조회합니다.");
							if (s1eng > 0 && s1eng <= 100) {
								System.out.println("국어 : " + s1kor);
								System.out.println("영어 : " + s1eng);
								System.out.println("수학 : " + s1mat);
							} else {
								System.out.println("오류 발생. 성적을 정정해야 합니다.");
							}
						} else if (studentName1.equals(sName2)){ // 등록되어있는 학생 정보 출력
							System.out.println(sName2 + " 님의 성적을 조회합니다.");
							if (s2eng > 0 && s2eng <= 100) {
								System.out.println("국어 : " + s2kor);
								System.out.println("영어 : " + s2eng);
								System.out.println("수학 : " + s2mat);
							} else {
								System.out.println("오류 발생. 성적을 정정해야 합니다.");
							}
						} else {
							System.out.println("등록된 정보가 없습니다.");
						}
					break;
					// 성적 보기 메뉴 종료
					
					// 성적 평균 계산 시작
					case 3 :
						System.out.println("성적 평균 계산 메뉴로 이동합니다.");
						System.out.println("성적 평균을 계산할 학생의 이름을 작성하세요.");
						System.out.print(">>> ");
						String studentName2 = input.next();
							
					if (studentName2.equals(sName1)) {
							System.out.println(sName1 + " 님의 성적을 조회합니다.");
							if (s1eng > 0 && s1eng <= 100) {
								System.out.println("국어 : " + s1kor);
								System.out.println("영어 : " + s1eng);
								System.out.println("수학 : " + s1mat);
							
							int total1 = s1kor + s1eng + s1mat;
							double avg1 = total1/3;
							System.out.println(sName1 + "님의 평균은 " + avg1 + "입니다.");
							} else {
								System.out.println("오류 발생. 점수 정정이 필요합니다.");
							}
					} else if (studentName2.equals(sName2)) {
						System.out.println(sName2 + " 님의 성적을 조회합니다.");
						if (s2eng > 0 && s2eng <= 100) {
							System.out.println("국어 : " + s2kor);
							System.out.println("영어 : " + s2eng);
							System.out.println("수학 : " + s2mat);
							
							int total2 = s2kor + s2eng + s2mat;
							double avg2 = total2/3;
							System.out.println(sName2 + "님의 평균은 " + avg2 + "입니다.");
							} else {
								System.out.println("오류 발생. 점수 정정이 필요합니다.");
							}
					} else {
						System.out.println("등록된 정보가 없습니다.");
					}
					break;
					// 성적 평균 계산 종료
					
					
					} // 성적 관리 switch 종
					break;
				
				case 'Z' :
				case 'z' :
					System.out.println("프로그램을 종료합니다.");
					break;
				
				default :
					System.out.println("메뉴에 없는 문자를 작성하셨습니다.");
					System.out.println("프로그램을 다시 실행해주세요.");
					break;
					
				} // 스위치문 종료
				
				
				
				
				
				

			}

		}

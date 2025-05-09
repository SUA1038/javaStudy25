package ch01;

import java.util.Scanner;

public class StringEqualsExam {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("아래 정보는 고객님의 분석을 위해 작성하는 정보입니다. 정확한 입력 부탁드립니다.");
		System.out.print("이름을 입력하세요 : ");
		String name = in.nextLine();
		System.out.print("생년월일 6자리를 입력하세요 : ");
		String age = in.nextLine();	
		System.out.print("이메일을 입력하세요 : ");
		String email = in.nextLine();
	
		System.out.println(name + "님 해킹 당하신 것을 축하드립니다. ㅋㅋㅋ");
		System.out.println("당신의 주민등록번호 앞자리는 " + age + "이군요." );
		System.out.println(email + " 주소 잘 사용하겠습니다. 감사합니다.");
	

	}

}

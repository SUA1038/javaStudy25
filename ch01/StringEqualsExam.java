package ch01;

import java.util.Scanner;

public class StringEqualsExam {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("회원가입을 진행합니다. 정보를 작성해주세요.");
		System.out.print("이름을 입력해주세요: ");
		String name = in.nextLine();
		System.out.print("나이를 입력해주세요: ");
		String age = in.nextLine();	
		System.out.print("이메일을 작성해주세요.");
		String email = in.nextLine();
	
		System.out.println(name + "님, 해킹 당하셨습니다.");
		System.out.println("당신의 나이는 " + age + "세." );
		System.out.println(email + " 이라는 이메일은 잘 쓰겠습니다 감사합니다.");
	

	}

}

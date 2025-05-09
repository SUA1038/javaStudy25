package ch01;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner(System.in) ;
		// 콘솔에 키보드로 값 입력하도록
		
		
		System.out.println("회원가입을 진행합니다.");
		System.out.println("=======================");
		
		
		System.out.println("ID를 생성해주세요.");
		System.out.print("ID : ");
		String ID = input.nextLine();
		System.out.println("ID가 확인되었습니다.");
		// id 가입
		
		System.out.println("PW를 생성해주세요.");
		System.out.print("PW : ");
		String PW = input.nextLine();
		System.out.println("PW가 확인되었습니다.");
		// pw 가입
		
		System.out.println("=======================");
		System.out.println("회원가입이 완료되었습니다. ");
		System.out.println("=======================");
		// 회원가입 완료
		
		System.out.println("로그인을 실행합니다.");
		System.out.print("ID : ");
		String userID = input.nextLine();
		// id 입력
		
		System.out.print("PW : ");
		String userPW = input.nextLine();
		// pw 입력
		
		if((userID.equals(ID)) & (userPW.equals(PW))) {	
			System.out.println("ID와 PW가 일치합니다.");
			System.out.println("=======================");
			System.out.println("정상적으로 로그인 되었습니다.");
			System.out.println("=======================");
			// 로그인 성공
			
		} else {
			System.out.println("ID 혹은 PW가 일치하지 않습니다.");
			System.out.println("=======================");
			System.out.println("로그인에 실패하였습니다.");
			System.out.println("=======================");
			// 로그인 실패
		}
		

	}

}

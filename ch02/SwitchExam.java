package ch02;

public class SwitchExam {

	public static void main(String[] args) {
		// switch로 주사위 프로그램 만들기
		
	int num = (int)(Math.random()*6)+1;
	System.out.println("주사위 결과 발표");
	
	switch(num) {
	case 1 :
		System.out.println("1번이 나왔습니다.");
		break;
		
	case 2 :
		System.out.println("2번이 나왔습니다.");
		break;
		
	case 3 :
		System.out.println("3번이 나왔습니다.");
		break;
		
	case 4 :
		System.out.println("4번이 나왔습니다.");
		break;
		
	case 5 :
		System.out.println("5번이 나왔습니다.");
		break;
		
	case 6 :
		System.out.println("6번이 나왔습니다.");
		break;
		
	default :
		System.out.println("주사위 오류 발생. 결과값 없음.");
		break;
		
		
	} // switch문 종료

	}

}

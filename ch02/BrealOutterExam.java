package ch02;

public class BrealOutterExam {

	public static void main(String[] args) {
		// break문에 라벨을 붙이면 반복코드 종료시점을 정할 수 있다.
		Outter : for(char upper='A'; upper <='Z'; upper++) { // A~Z까지의 반복용 코드
			for(char lower='a'; lower <= 'z'; lower++) { // a~z까지 반복코드
				System.out.println(upper + "-" + lower);
				if(lower=='c') { // c가 나오면 break문 실행
					break Outter;  // Outter는 라벨문으로 break의 범위를 결정
				}
			} // 소문자 반복문 종료
		} // 대문자 반복문 종료

	} // main 메서드 종료

}

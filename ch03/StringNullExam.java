package ch03;

public class StringNullExam {

	public static void main(String[] args) {
		// null 입력 연습
		
		/*
		 * String name = null; String hobby = "볼링";
		 * 
		 * System.out.println("name 총 문자수 : " + name.length());
		 * System.out.println("hobby 총 문자수 : " + hobby.length());
		 * 
		 * 오류가 발생하여 값이 나오지 않는다.
		 * 
		 */
		
		String StrVar1 = "김기원";
		String StrVar2 = "김기원";
		
		if (StrVar1.equals(StrVar2)) {
			System.out.println("StrVar1과 StrVar2는 참조가 같습니다");
		} else {
			System.out.println("StrVar1과 StrVar2는 참조가 다릅니다");
		} // if end
		if (StrVar1.equals(StrVar2)) {
			System.out.println("StrVar1과 StrVar2는 문자열이 같습니다.");
		} else {
			System.out.println("StrVar1과 StrVar2는 문자열이 다릅니다.");
		}
		
	} // main method end

} // class end

package ch05.extended.people;

public class StudentExam {

	public static void main(String[] args) {
		Student st = new Student("김기원", "1234", 1);
		
		System.out.println("name : " + st.name);	// 부모 클래스 상속
		System.out.println("ssn : " + st.ssn);		// 부모 클래스 상속
		System.out.println("학번 : " + st.studentNo);	// 자식 클래스

	}

}

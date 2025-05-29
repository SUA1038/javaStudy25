package ch05.extended.school;

public class StudentExam {

	public static void main(String[] args) {
		Student stu1 = new Student("김기원", 180, 75, 50, "12345", 3, 4);
		Student stu2 = new Student("김기투", 182, 77, 52, "12345", 2, 5);

		stu1.show();
		stu2.show();
		
	}

}

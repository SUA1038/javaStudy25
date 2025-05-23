package ch04;

public class RegExam {

	public static void main(String[] args) {
		Reg reg1 = new Reg();
		System.out.print("회원정보 : " + reg1.name);
		System.out.print(reg1.gender + reg1.age + reg1.id + reg1.pw + reg1.num);
		System.out.println();
		
		Reg reg2 = new Reg("멋진아이디", "멋진비밀번호");
		System.out.print("회원정보 : " + reg2.name);
		System.out.print(reg1.gender + reg1.age +  reg1.id + reg1.pw + reg1.num);
		System.out.println();
		
		Reg reg3 = new Reg("김수아", "여성");
		System.out.print("회원정보 : " + reg3.name);
		System.out.print(reg3.gender +reg3.age + reg3.id + reg3.pw + reg3.num);
		System.out.println();
		
		Reg reg4 = new Reg("김수아", "여성", 22);
		System.out.print("회원정보 : " + reg4.name);
		System.out.print(reg4.gender + reg4.age + reg4.id + reg4.pw + reg4.num);
		System.out.println();
	}

}

package ch04.singleton;

public class SingletonExam {

	public static void main(String[] args) {
		// Singleton obj1 = new Singleton();
		// Singleton obj2 = new Singleton();
		// pricate 객체를 생성했기 때문에 new로 생성할 수 없다.
		
		Singleton obj3 = Singleton.getInstance();
		Singleton obj4 = Singleton.getInstance();
		
		if(obj3 == obj4) {
			System.out.println("같은 깅글톤 객체입니다.");
		} else {
			System.out.println("다른 싱글톤 객체입니다.");
		}

	}

}

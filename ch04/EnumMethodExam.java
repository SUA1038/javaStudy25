package ch04;

public class EnumMethodExam {

	public static void main(String[] args) {
		
		Week today = Week.MONDAY;
		String name = today.name();
		System.out.println("객체의 이름은 : " + name);
		
		int ordinal = today.ordinal();
		System.out.println("열거 순서는 : " + ordinal);

		
		// compareTo 메소드
		// 매개 값으로 주어진 열거 객체를 기준으로 전후 몇 번째에 위치하는지를 비교한다.
		// 앞에 있으면 음수 / 뒤에 있으면 양수를 리턴한다.
		
		Week day1 = Week.MONDAY;
		Week day2 = Week.WENDESADY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		Week weekday = Week.valueOf("MONDAY");
		if(weekday == Week.SATURDAY || weekday == Week.SUNDAY) {
			System.out.println("주말입니다. 푹 쉬고 평일에 힘냅시다.");
		} else {
			System.out.println("평일입니다. 학습을 위해 8시간 이상 숙면하세요.");
		}
		
		Week[] days = Week.values(); // Week에 열거상수를 days 배열로 생성
		for(Week a : days) {
		System.out.print(a + " ");
		}
		
	}

}

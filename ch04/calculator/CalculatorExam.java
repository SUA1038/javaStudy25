package ch04.calculator;

public class CalculatorExam {

	public static void main(String[] args) {

		// Calculator myCalc = new Calculator() ;
		double result1 = 10 * 10 * Calculator.pi ;
		int result2 = Calculator.plus(15, 20);
		int result3 = Calculator.minus(50, 20);
		int result4 = Calculator.multiply(4, 8);
		int result5 = Calculator.result(10, 15, 2);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		System.out.println("result5 : " + result5);

	}

}

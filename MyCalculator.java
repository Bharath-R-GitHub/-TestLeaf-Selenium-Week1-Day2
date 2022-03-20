package week1.day2.assignments;

public class MyCalculator {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println("Addition: " + calc.add(5, 10, 15));
		System.out.println("Subtraction: " + calc.sub(35, 10));
		System.out.println("Multiplication: " + calc.mul(25.5, 3.1));
		System.out.println("Division: " + calc.divide(45.5f, 5.0f));
	}
}

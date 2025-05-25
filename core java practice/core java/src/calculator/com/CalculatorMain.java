package calculator.com;

public class CalculatorMain {
	public static void main(String[] args) {
		System.out.println("addition of two numbers:"+Calculator.add(10, 20));
		System.out.println("substraction of two numbers:"+Calculator.sub(10, 20));
		System.out.println("multiplication of two numbers:"+Calculator.mul(10, 20));
		System.out.println("division of two numbers:"+Calculator.div(10, 20));
		System.out.println("modulus of two numbers:"+Calculator.mod(10, 20));
	}

}

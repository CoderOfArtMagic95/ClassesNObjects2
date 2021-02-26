
public class Calculator {
	int number1;
	int number2;
	
	public void Add(int num, int num2) {
		int sum = 0;
		sum = num + num2;
		System.out.println("Sum result: " + sum);
	}
	public void Subtract(int num, int num2) {
		int subtract = 0;
		subtract = num - num2;
		System.out.println("Subtraction result: " + subtract);
	}
	public void Multiplication(int num, int num2) {
		int multiply = 0;
		multiply = num * num2;
		System.out.println("Multiplication result: " + multiply);
	}
	public void Division(int num, int num2) {
		int divide = 0;
		divide = (num / num2);
		if(num2 == 0) {
			System.out.println("You can't divide by 0!");
		}else if(num2 > num) {
			divide = num2 / num;
			if(num == 0) {
				System.out.println("You can't divide by 0!");
			}
		}
		System.out.println("Division result: " + divide);
	}
	public void SquareRoot(int num) {
		int result = 0;
		result = (int) Math.sqrt(num);
		System.out.println("SquareRoot result: " + result);
	}
}

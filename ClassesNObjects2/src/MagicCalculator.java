import java.util.Scanner;

public class MagicCalculator extends Calculator{
   
	int number = 0;
	int number2 = 0;
	
	public void FindSine(int num, int num2) {
		num2 = (int) Math.toRadians(num);
		System.out.println("Sine Angle: " +  Math.sin(num2));
	}
	
	public void FindCosine(int num, int num2) {
		num2 = (int) Math.toRadians(num);
		System.out.println("Cosine Angle: " + Math.cos(num2));
	}
	
	public void FindTangent(int num, int num2) {
		num2 = (int) Math.toRadians(num);
		System.out.println("Tangent Angle: " + Math.tan(num2));
	}
	public int FindFactorial(int num) {
		if(num == 0) {
			return 1;
		}
		System.out.println("Factorial: " + num * FindFactorial(num - 1));
		//recursive call
		return num * FindFactorial(num - 1);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MagicCalculator magic = new MagicCalculator();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Pick a number");
		int number = Integer.parseInt(input.nextLine());
		System.out.println("Pick another number");
		int number2 = Integer.parseInt(input.nextLine());
		input.close();
		
		//Uses classes inherited from parent class Calculator
		magic.Add(number, number2);
		magic.Subtract(number, number2);
		magic.Multiplication(number, number2);
		magic.Division(number, number2);
		
		magic.SquareRoot(number);
		magic.SquareRoot(number2);
		
		//Uses its own classes
		magic.FindSine(number, number2);
		magic.FindCosine(number, number2);
		magic.FindTangent(number, number2);
		
		magic.FindFactorial(number);
		//magic.FindFactorial(number2);
		
		
	}

}

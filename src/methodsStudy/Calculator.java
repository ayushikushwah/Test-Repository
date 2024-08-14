package methodsStudy;

public class Calculator {
	
	int a = 10;// variable declaration+initialization
	int b = 90;// variable declaration+initialization

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		calculator.addition();
		calculator.substraction();
		calculator.multiplication();
		calculator.division();
		
	}
	
	public void addition() {
		int sum = a + b;
		System.out.println("Addition is "+sum);
				
	}
	
	public void substraction() {
		int sub = a - b;
		System.out.println("Substraction is "+sub);
				
	}
	
	public void multiplication() {
		int mul = a * b;
		System.out.println("multiplication is "+mul);
				
	}
	
	public void division() {
		float div = a / b;
		float rem = a % b;
		System.out.println("division is "+div);
		System.out.println("remainder is "+rem);
				
	}


}

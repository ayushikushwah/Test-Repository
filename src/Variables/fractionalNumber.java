package Variables;

public class fractionalNumber {

	public static void main(String[] args) {

		// I want to store speed(should consider decimal values)
		// decimal --> 2 options --> float , double

		float speed;// variable declaration
		speed = 100.9f;// variable initialization
		
		System.out.println(speed);  
		System.out.println("My speed is "+speed);  
		
		//this is 100.9 KM/H
		System.out.println("this is "+speed+ "KM/H"); 
		
		//I want to gold weight (should consider decimal values)
		
		double weight;//variable declaration
		weight = 9.12345678989765d;
		System.out.println(weight);
		System.out.println("My weight is "+weight+"Kg");
	}
}

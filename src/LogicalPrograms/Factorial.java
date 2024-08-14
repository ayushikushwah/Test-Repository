package LogicalPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int a = sc.nextInt();
		
		int factorial = 1;
		
		for(int i =a;i>=1;i--)
		{
			factorial = factorial*i;
		}
		
		System.out.println(factorial);
	}

}

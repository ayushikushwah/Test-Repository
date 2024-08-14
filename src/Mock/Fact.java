package Mock;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("enter number");
		int a= sc.nextInt();
		int factorial = 1;
		
		for(int i=1;i<=a;i++)
		{
			factorial = factorial*i;
			
		}
		
		System.out.println(factorial);

	}

}

package LogicalPrograms;

import java.util.Scanner;

public class FibinancySeries {

	public static void main(String[] args) {
	
//		int num =10;
//		int num1 = 0;
//		int num2 =1;
		// 6
		// 0
		// 1
		// 1=0+1
		// 2=1+1
		// 3=2+1
		// 5=3+2
		//0
		//1
		//0+1=1;
		//1+1=2;
		//2+1=3;
		//
		int num = 10;
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		for (int i = 1; i <= num; i++) {
		System.out.println(num1 + " ");
		sum = num1 + num2; 
		num1 = num2;
		num2 = sum;
		}
		
		

	}

}

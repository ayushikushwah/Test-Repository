package PracticeLogical;

public class FibonacciSeries {

	public static void main(String[] args) {
		// 0 1 2 3 5 8 13

		int num = 10;
		int num1 = 0;
		int num2 = 1;
		
		for(int i =1;i<=num;i++)
		{
			System.out.println(num1);//0,1,1,2,3,5,8,13
			int sum = num1+num2;//21
			num1 = num2;//13
			num2 =sum;//21
		}

	}

}

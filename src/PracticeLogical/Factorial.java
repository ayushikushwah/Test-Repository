package PracticeLogical;

public class Factorial {

	public static void main(String[] args) {
		int num = 5;//5-4-3-2-1
		int Factorial =1;
		
		for(int i=num;i>=1;i-- )
		{
			Factorial = Factorial*i;
		
		}
		System.out.println(Factorial);

	}

}

package Mock;

public class EvenOddNumber {

	public static void main(String[] args) {
		
		//by using simple if-else
		int num = 5;
		
		if (num %2 == 0)
		{
			System.out.println("Number is even : "+num);
		}
		else {
			System.out.println("Number is odd : "+num);
		}
		
		
		//by using for loop
		
		int i ;
		
		for(i = 0; i<= 10;i ++ )
		{
			if(i %2 == 0)
			{
				System.out.println(i);
			}
		}

	}

}

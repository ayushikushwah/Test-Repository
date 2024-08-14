package Mock;

public class prime {

	public static void main(String[] args) {
		 
		int num = 2;
		int count =0;
		
		for(int i =2;i<num;i++)//in prime start iteration with 2 and just use less than sign dont use <=
			//in fibonnacci dont use 0 
			//in shiftimg zero first assign index of old to new then do index ++
			
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		
		if(count == 0)
		{
			System.out.println("Prime");
		}
		else {
			System.out.println("not prime");
		}

	}

}

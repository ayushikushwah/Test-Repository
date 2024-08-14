package PatternPrograms;

public class Ex13 {

	public static void main(String[] args) {
		//*         *
		//**       **
		//***     ***
		//****   ****
		//***** *****
		//****   ****
		//***     ***
		//**       **
		//*         *
		
		int row =9;
		int space1=5;
		int space2=4;
		int star1=1;
		int star2=1;
		
		for(int i=1;i<=row;i++)
		{
			for(int l=1;l<=star1;l++)
			{
				System.out.print("*");
			}
			for(int j=1;j<=space1;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=space2;k++)
			{
				System.out.print(" ");
			}
			
			for(int m=1;m<=star2;m++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<5)
			{
				star1++;
				star2++;
				space1--;
				space2--;	
				
			}
			else {
				
				star1--;
				star2--;
				space1++;
				space2++;
			}
			
		}

	}

}

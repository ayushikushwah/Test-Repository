package PatternPrograms;

public class Ex11 {

	public static void main(String[] args) {
		// * * * *
		//  * * *
		//   * *
		//    *
		
		int row=4;
		int space=0;
		int star=4;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("* ");
				
			}
			System.out.println();
			space++;
			star--;
		}

	}

}

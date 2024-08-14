package PatternPrograms;

public class Ex10 {

	public static void main(String[] args) {
		//    *
		//   * *
		//  * * *
		// * * * *
		
		int row=4;
		int space1=3;
		int star=1;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=space1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
			star++;
			space1--;
			

		}

	}

}

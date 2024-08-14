package PatternPrograms;

public class Ex8 {

	public static void main(String[] args) {
		// *******
		//  *****
		//   ***
		//    *
		
		//row = 5;space1 = 0 ;space2=0;star =7;
		
		int row=4;
		int space1 = 0;
		int star = 7;
		
		for(int i =1;i<=row;i++)
		{
			for(int j=1;j<=space1;j++)
			{
				System.out.print(" ");
			}
			for(int k =1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			star = star-2;
			space1++;
		}

	}

}

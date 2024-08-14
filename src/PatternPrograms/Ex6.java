package PatternPrograms;

public class Ex6 {

	public static void main(String[] args) {
		//*****
		// ****
		//  ***
		//   **
		//    *
		
		//row = 5;col =5;first row star = 5;space= 0;
		
		int row = 5;
		int star = 5;
		int space = 0;
		
		//row
		for(int i = 1;i<=row;i++)
		{
			//star
			for(int j = 1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k =1;k <= star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			star--;
			space++;
		}
		
		

	}

}

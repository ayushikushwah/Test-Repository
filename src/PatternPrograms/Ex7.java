package PatternPrograms;

public class Ex7 {

	public static void main(String[] args) {
		//     *
		//    **
		//   ***
		//   ****
		//  *****
		
		//row = 5 ; space = 4;star=1;
		
		int row= 5;
		int space = 4;
		int star = 1;
		
		for(int i =1 ;i<=row;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			
			for(int k =1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			star++;
			space--;
		}
	}

}

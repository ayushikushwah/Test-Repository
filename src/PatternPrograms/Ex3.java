package PatternPrograms;

public class Ex3 {

	public static void main(String[] args) {
		// *****
		// *****
		// *****
		
		//think about rows first
		//row = 3 
		//col = 5
		
		int row = 3;
		int col=5;
		
		//outer loop for rows
		for(int i = 1;i<=row;i++)//1,2,3
		{
			//immer loop for columns
			for(int j = 0;j<=col;j++)//1,2,3,4,5
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

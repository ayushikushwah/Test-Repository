package ArrayStudy;

public class Test4 {
	public static void main(String[] args) {

		int ar[][] = new int[3][3];
		ar[0][0] = 10;
		ar[0][1] = 20;
		ar[1][0] = 30;
		ar[1][1] = 40;
// System.out.println(ar[0][0]);
//System.out.println(ar[1][1]);
//System.out.println(ar[0][2]);
//outer for loop--> rows
//inner for loop--> columns
		for (int i = 0; i <= 1; i++)// outer for loop --> for rows
		{
			for (int j = 0; j <= 1; j++)// inner for loop--> columns
			{
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}

	}
}

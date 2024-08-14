package ArrayStudy;

public class study {

	
	public static void main(String[] args) {
	
		int arr[][]=new int[2][3];
		
		arr[0][0]= 20;
		arr[0][1]= 30;
		arr[0][2]= 40;
		arr[1][0]= 50;
		arr[1][1]= 60;
		arr[1][2]= 70;
		
		//forward traversing
		for(int i=0;i<=1;i++) 
		{
			for(int j =0;j<=2;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("==================Reverse Traversing=============================");
		for(int i = 1;i>=0;i--) 
		{
			for(int j =2;j>=0;j--)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("==================Dynamic Traversing=============================");

		
	}

}

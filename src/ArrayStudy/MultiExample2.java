package ArrayStudy;

public class MultiExample2 {

	public static void main(String[] args) {
		
		int ar[][]= {{510,20,30},{40,50,60},{70,80,90}};

		
		System.out.println(ar[1][1]);
		System.out.println(ar.length);
		
		for(int i=0;i<=2;i++)
		{
		 for (int j=0;j<=2;j++)
		 {
			 System.out.print(ar[i][j]+" ");
		 }
		 System.out.println();
		}
		
		
	}

}





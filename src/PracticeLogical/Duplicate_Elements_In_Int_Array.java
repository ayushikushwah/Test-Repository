package PracticeLogical;

public class Duplicate_Elements_In_Int_Array {

	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 4, 3, 5, 7, 5, 8, 9, 1, 7 };
		int count = 0;
		
		for(int i =0 ;i<=ar.length-1;i++)
		{
			for(int j=i+1;j<=ar.length-1;j++)
			{
				
				if(ar[i]==ar[j])
				{
					System.out.println(ar[i]);
					count++;
					
					
				}
			}
		}
		System.out.println();
		System.out.println("Number is duplicate : "+count);

	}

}

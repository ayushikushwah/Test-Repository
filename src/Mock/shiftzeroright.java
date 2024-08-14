package Mock;

public class shiftzeroright {

	public static void main(String[] args) {
		int a[] = {1,2,0,3,0,4,5,0,6,7,0};//{1,2,3,4,5,6,7,0,0,0,0}};
		int index = 0;
		int b[] =new int[a.length];
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]!=0)//0
			{
				b[index] = a[i];
				index++;
			}
		}
		
		for(int j=0;j<=b.length-1;j++)
		{
			System.out.print(b[j]+" ");
		}
	}

}

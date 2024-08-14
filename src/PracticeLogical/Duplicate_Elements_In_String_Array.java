package PracticeLogical;

public class Duplicate_Elements_In_String_Array {

	public static void main(String[] args) {
		String ar[]= {"java", "testing","java","python","sql","sql","testing","api"};
		System.out.println("Duplicate elements are: ");
		int count=0;
		
		for(int i =0;i<=ar.length-1;i++)
		{
			for(int j=i+1;j<=ar.length-1;j++)
			{
				if(ar[i].equalsIgnoreCase(ar[j]))
				{
					count++;
					System.out.println(ar[i]);
				}
			}
		}
		
		System.out.println("Dupliacte Strings :"+count);

	}

}

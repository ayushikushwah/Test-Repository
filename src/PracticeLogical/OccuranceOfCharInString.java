package PracticeLogical;

public class OccuranceOfCharInString {

	public static void main(String[] args) {
		//count char A
		String s="RADAR";
		int count=0;
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char a = s.charAt(i);
			if(a == 'A')
			{
				count++;
			}
		}

		System.out.println("Ocuurance of char A : "+count);
	}

}

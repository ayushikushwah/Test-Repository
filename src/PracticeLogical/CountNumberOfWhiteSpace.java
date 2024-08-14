package PracticeLogical;

public class CountNumberOfWhiteSpace {

	public static void main(String[] args) {
		String s = "V e loc it y";
		int count = 0;
		
		for(int i =0;i<=s.length()-1;i++)
		{
			char a = s.charAt(i);
			if(a == ' ')
			{
				count++;
			}
		}
		System.out.println("Number od spaces : "+count);

	}

}

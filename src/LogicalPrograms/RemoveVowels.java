package LogicalPrograms;

public class RemoveVowels {

	public static void main(String[] args) {
		
		String s = "Ayushi";
		String z = "";
		int count = 0;
		
		String s1= s.toLowerCase();
		
		for(int i=0;i<s1.length()-1;i++)
		{
			char temp = s1.charAt(i);
			if(temp == 'a'||temp=='e'||temp=='i'||temp=='o'||temp=='u')
			{
				count++;
				continue;
				
			}
			else {
				z = z+temp;
			}
		}
		System.out.println(z);
		System.out.println(count);
		

	}

}

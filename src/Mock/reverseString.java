package Mock;

public class reverseString {

	public static void main(String[] args) {
		
		String a = "Ayushi";
		String rev ="";
		
		for(int i =0;i<=a.length()-1;i++)
		{
			rev = a.charAt(i)+rev;
//			System.out.println(rev);
			 
		}
		System.out.println(rev);

	}

}

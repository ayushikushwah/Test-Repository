package PracticeLogical;

public class PalindromeString {

	public static void main(String[] args) {
		String s = "radar";
		String rev = "";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev+s.charAt(i);
			
		}
		
		System.out.println("Reverse String :"+rev);
		if(rev.equals(s))
		{
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("Stirng is not palindrome");
		}

	}

}

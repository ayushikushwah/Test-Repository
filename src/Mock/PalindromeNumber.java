package Mock;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		String a = "ayushi";
		String reverseString = "";
		
		for(int i = a.length()-1;i>=0;i--)
		{
			reverseString = reverseString + a.charAt(i);
		}
		System.out.println(reverseString);
		
		if(a.equalsIgnoreCase(reverseString))
		{
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	
	

	}

}

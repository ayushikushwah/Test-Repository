package Mock;

public class rev {

	public static void main(String[] args) {
		String a = "Radar";
		String rev = "";

		for (int i=a.length()-1;i>=0; i--)
		{
			rev = rev+a.charAt(i);
		}
		System.out.println(rev);

		if(a.equalsIgnoreCase(rev))
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not p");
		}
	}

}

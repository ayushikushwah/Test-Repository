package PracticeLogical;

public class ReverseString {

	public static void main(String[] args) {
		String a = "Ayushi";
		String rev = " ";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			rev = rev + a.charAt(i);//i
		}
			
		System.out.println("Reverse string is :"+rev);

	}

}

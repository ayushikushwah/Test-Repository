package LogicalPrograms;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		
		String a = "silent";
		String b = "liten";
		
		char a1[] = a.toCharArray();
		char b1[] = b.toCharArray();
		
		System.out.println(a1);
		System.out.println(b1);
		
		Arrays.sort(a1);
		Arrays.sort(b1);
		
		if(Arrays.equals(a1, b1))
		System.out.println("Anagram String");
		else
		System.out.println("Not Anagram");
		
		

	}

}

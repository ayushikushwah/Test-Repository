package PracticeLogical;

import java.util.Arrays;

public class AnagramString {
	
	//anagram = if we sort it in order the words shoulbe same 

	public static void main(String[] args) {
		String a ="listen";
		String b ="silent";
		
		char ar[]= a.toCharArray();
		char br[]= b.toCharArray();
		
		Arrays.sort(ar);
		Arrays.sort(br);
		
		if(Arrays.equals(ar, br))
		{
			System.out.println("Stirng is anagram");
		}
		else {
			System.out.println("String is not anagram");
		}

	}

}

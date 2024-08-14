package PracticeLogical;

import java.util.ArrayList;
import java.util.TreeSet;

public class FindLargestAndSmallestNumber {

	public static void main(String[] args) {
		int ar[] = { 12, 29, 99, 98, 77, 24, 55, 33 };
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		for(int i=0;i<=ar.length-1;i++)
		{
			ts.add(ar[i]);
		}
		
		System.out.println(ts);
		
		ArrayList<Integer> as = new ArrayList<Integer>(ts);
		
		System.out.println(as);
		
		//smallest number
		System.out.println(as.get(0));
		
		//2nd smallest number
		System.out.println(as.get(1));
		
		//largest number
		System.out.println(as.get(as.size()-1));
		
		//2nd largest number
		System.out.println(as.get(as.size()-2));
		
		

	}

}

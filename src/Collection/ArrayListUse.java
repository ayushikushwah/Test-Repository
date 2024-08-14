package Collection;

import java.util.ArrayList;
import java.util.Iterator;

//import com.sun.tools.javac.util.Iterators;

public class ArrayListUse {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add("Velocity");// 0
		al.add("May-21");// 1
		al.add(90);// 2
		al.add('A');// 3
		al.add(99.99f);// 4
		al.add("Velocity");// 5
		al.add(null);// 6
		al.add(null);// 7

		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.indexOf("Velocity"));
		System.out.println(al.lastIndexOf("Velocity"));
		System.out.println(al);
		al.set(3, 'B');// update
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.contains(93));
		System.out.println(al.get(5));
		System.out.println(al);

		al.add(1, "MorningBatch");// right shift--> when you are inserting element in between arraylist

		System.out.println(al);

		al.remove(1);// left shit--> when you try to remove/delete from in between of arraylist

		System.out.println(al);

//	   Iterator it= al.iterator();
//	   
//	   while(it.hasNext())
//	   {
//		   System.out.println(it.next());
//	   }

//	   for(int i =0; i<=al.size()-1;i++)
//		   
//	   {
//		   System.out.println(al.get(i));
//	   }
//		
		for (Object o : al) {
			System.out.println(o);
		}

	}

}

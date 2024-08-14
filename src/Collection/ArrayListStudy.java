package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		//add();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		al.add(10);
		al.add(10);
		System.out.println(al);
		al.add(null);
		al.add(null);
		al.add(null);
		System.out.println(al);
		al.add(50);
		al.add(60);
		al.add(null);
		System.out.println(al);
		al.add(2, 100);
		System.out.println(al);
		
		//2.addFirst();
		al.addFirst(0);
		System.out.println(al);
		
		//3.addLast();
		al.addLast(90);
		System.out.println(al);
		al.clear();
		System.out.println("al:"+al);
		//4.clone();
		Object alnew = al.clone();//return shallow copy of arraylist instance
		System.out.println("Clone()"+alnew);
		
		//5.contains();
		System.out.println(al.contains(20));
		
		//6.get();
		System.out.println(al.get(1));
		
		//7.indexOf();
		System.out.println(al.indexOf(10));
		
		int myIndex = al.indexOf(100);
		System.out.println(myIndex);
		
		//8.isEmpty();
		System.out.println(al.isEmpty());
		
		//9.lastIndexOf();
		System.out.println(al.lastIndexOf(10));
		
		//10.remove();
		System.out.println(al.remove(3));
		System.out.println(al);
		
//		al.ensureCapacity();
		
//		al.remove(100);//indexOutOfBoundException
		
		//11.set();-->remove element at particular index and replace with new specied one
		al.set(2, 500);
		System.out.println(al);
		
		//12.size();
		System.out.println(al.size());
		
		System.out.println("================================= Traversing throgh ArrayList ====================================");
		
		for(int i =0;i<=al.size()-1 ; i++)
		{
			System.out.println(al.get(i));//0,1,2,3..12
		}
		
		System.out.println("===========================forEach Loop============================");
		
		for(Integer a : al)
		{
			System.out.println(a);
		}
		
		System.out.println("=========================== Iterator ============================");
		Iterator <Integer> it = al.iterator();
		
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
				
		System.out.println("=========================== List-Iterator ============================");
		
		ListIterator<Integer> lit = al.listIterator();
		
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
	
		
	
		
	}
}

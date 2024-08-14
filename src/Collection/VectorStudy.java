package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {
	public static void main(String[] args) {
		Vector<Object> v = new Vector<Object>();
		
		v.add("Good");
		v.add('A');
		v.add(true);
		v.add(null);
		v.add(null);
		v.add("Good");
		System.out.println(v.capacity());
		v.add(12);
		v.add(12.12);
		System.out.println(v);
		v.add(1, "Morning");
		System.out.println(v);
		v.addFirst("Pune");
		v.addLast("MH");
		System.out.println(v);
		System.out.println(v.size());
		System.out.println("V capacity :"+v.capacity());
//v.clear();
		Object v1 = v.clone();
		System.out.println(v1);
		System.out.println(v.contains("Pune123"));
		System.out.println(v.elementAt(1));// get()
		v.ensureCapacity(20);
		System.out.println("Capacity:"+v.capacity());
		System.out.println("Equals:"+v.equals(v1));
		System.out.println(v.get(0));
		System.out.println(v.indexOf(12));

		v.insertElementAt("Mumbai", 1);
		System.out.println("InsertElementAt"+v);
// v.clear();
		System.out.println(v.isEmpty());
		System.out.println(v.lastIndexOf("Good"));
		System.out.println(v.remove(0));
		System.out.println(v);
		v.set(0, "INDIA");
		System.out.println("Set :"+v);
//		v.clear();
		System.out.println("Clear : "+v);
//for,
//for each
//iterator
//list iterator
		System.out.println("Vector"+v);
		for (Object a : v) {
			System.out.println(a);
		}
		
		System.out.println("==========for loop============================");
		
		for(int i =0;i<=v.size()-1;i++)
		{
			System.out.println(v.elementAt(i));
		}
		System.out.println("==========iterator============================");
		
		Iterator<Object> it = v.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		System.out.println("========== list iterator============================");
		
		ListIterator<Object> lit = v.listIterator();
		
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		
		System.out.println("===========Enumeration================================");
		
//		Enumeration e = v.elements();
		
		Enumeration <Object> enu = v.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}

	}
}
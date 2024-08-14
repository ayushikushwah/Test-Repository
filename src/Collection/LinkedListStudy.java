package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {
	public static void main(String[] args) {
		LinkedList<Object> ll = new LinkedList<Object>();
		ll.add("Hello");
		ll.add(null);
		ll.add(null);
		ll.add("Hello");
		ll.add(12);
		ll.remove(1);
		ll.add(true);
		ll.add(12.12);
		ll.add('A');
		ll.add(0, 10);
		System.out.println("Add:" + ll);
		System.out.println(ll.get(5));
		System.out.println(ll.element());// returns but doesnot removes first or head element of list
		System.out.println(ll);
		System.out.println(ll.peek());// returns but doesnot removes first or head element of list
		System.out.println(ll.peekFirst());// returns but doesnot removes first or head element of list
		System.out.println(ll.peekLast());// returns but doesnot removes last or head element of list
		
		
		System.out.println(ll);
		System.out.println(ll.poll());// returns and removes first or head element of list
		System.out.println(ll.pollFirst());// returns and removes first or head element of list
		System.out.println(ll.pollLast());// returns and removes first or head element of list
		System.out.println(ll);

		System.out.println(ll.pop());// returns but doesnot removes first or head element of list
		System.out.println(ll);

		ll.push("Velocity");// push element onto stack which represent by list as first or head element of
							// th list
		System.out.println(ll);

		// for
		// for each (enhanced for loop)
		// iterator
		// list iterator

		System.out.println("=========================for loop==========================");
		for (int i = 0; i <= ll.size() - 1; i++) {
			System.out.println(ll.get(i));
		}

		System.out.println("=========================Reverse for loop==========================");

		for(int i = ll.size()-1;i>=0;i--)
		{
			System.out.println(ll.get(i));
		}

		System.out.println("=========================for each loop==========================");
		for (Object obj : ll) {
			System.out.println(obj);
		}
		System.out.println("=========================Iterator ==========================");

		Iterator<Object> it = ll.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("=========================List Iterator==========================");

		ListIterator<Object> lit = ll.listIterator();

		while (lit.hasNext()) {
			System.out.println(lit.next());
		}

		System.out.println("=========================Reverse List Iterator==========================");

		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}

	}

}

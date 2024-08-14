package Collection;

import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) {
		
		TreeSet <Object> ts = new TreeSet<Object>();
		
		//-->Smaller value in tree go for left side and bigger value goes on right side of node
		//-->one parent and two childs known tobe binary tree
		
		//1.add();
//		ts.add(9);
		
		//ts.add("Pune");		
		//--> ClassCastException: because we have alredy taken first element as type of inetger and treeset is used to store similar kind or homogeneous data 
		//Hence , we cannot store data of string type after that
		
		//ts.add(null);
		//-->NullPointerException : as treeset doesnot allow null values..because we cannot compare it with anything
		
		ts.add(13);
//		ts.add('A');-->classcastException:
		ts.add(4);
		ts.add(11);
		ts.add(7);
		ts.add(5);
		System.out.println(ts);
		
//		ts.addFirst(100);//UnsupportedOperationException :
		//ts.addLast(100);
		//UnsupportedOperationException : as insertion always works for tree in ascending order
		
		//ceiling ()--> gives nearest bigger value of the specied value from treeset
		ts.ceiling(11);
		System.out.println("Ceiling :"+ts.ceiling(10));
		
		//floor()--> gives nearest smallest value for specified value from treeset
		//but if treeset contains value which is specified so it returns the same value
		ts.floor(12);
		System.out.println("Floor :"+ts.floor(12));
		
		//first()-->returns the lower elemet of set
		System.out.println("First :"+ts.first());
		
		//higher --> nearest higher value for the specified value from the treeset
		//but even if same element is present it will return only the nearest bigger value
		System.out.println("Higher :"+ts.higher(7));
		
		//lower -->
		System.out.println("Lower :"+ts.lower(7));
		
		//size() --> it gives the number of elements present in tree
		System.out.println("Size :"+ts.size());
	}

}

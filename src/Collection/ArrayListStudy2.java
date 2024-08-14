package Collection;

import java.util.ArrayList;

public class ArrayListStudy2 {
	public static void main(String[] args) {

		ArrayList<Object> al = new ArrayList<Object>();
		al.add(true);
		al.add(12);
		al.add(12.22);
		al.add("Velocity");
		al.add('B');
		al.add(null);
		al.add("Velocity");
		al.add(null);
		al.add(null);
		System.out.println(al);

		System.out.println(al.remove("Velocity"));
		System.out.println(al);

		System.out.println("==========forEach Loop=========================");
		for (Object a : al) {
			System.out.println(a);
		}

	}
}

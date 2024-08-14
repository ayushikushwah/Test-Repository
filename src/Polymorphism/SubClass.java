package Polymorphism;

public class SubClass extends SuperClass {

	public static void main(String[] args) {
//		
		SubClass obj = new SubClass();
//		obj.money();
		
		SuperClass superobj = new SuperClass();
		superobj.money();
	}

	public void money() {
		System.out.println("Money is 1000");
	}

}

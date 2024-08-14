package abstractClass;

public class B extends A{

	public static void main(String[] args) {
		
		B object = new B();
		object.test1();
		object.test2();
		object.test3();
		object.test4();
		object.test5();

	}

	@Override
	public void test3() {
		System.out.println("Class A's method completed in concrete class B");
		
	}

	@Override
	public void test4() {		
		System.out.println("Class A's method completed in concrete class B");

	}
	
	public void test5()
	{
		System.out.println("Simple Method of B class");
	}

}

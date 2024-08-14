package constructor;

public class constructorChaining {

	public constructorChaining() {
		this(12);
		System.out.println("User defined zero parameter constructor");
	}

	public constructorChaining(int a) {
//		this("Ayushi");
		System.out.println("User defined parameterized constructor");
		System.out.println(a);

	}

	public constructorChaining(String name) {
		System.out.println("User defined parameterized constructor");
		System.out.println(name);
	}

	public static void main(String[] args) {

		constructorChaining object = new constructorChaining();
		System.out.println("Print value pf object whicch is created : " + object);
	}

}

package Mock;

public class Practice {

	public static void main(String[] args) {
		display();
		Day1.display1();
		Practice obj = new Practice();
		obj.mock();
	}

	public static void display() {
		System.out.println("This is static method from the same class");
	}
	
	public void mock()
	{
		int a=10;
		int b = 20;
		int c = a+b;
		System.out.println("This is non-static method "+c);
		
	}
	
	public void m1(int a, int b)
	{
//		int a=10;
//		int b = 20;
		int c = a+b;
		System.out.println("This is non-static method "+c);
		
	}

}

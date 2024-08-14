package methodsCall;

public class Test {
	
	int a;
	
	
	
	public static void main(String[] args) {
		
		addition();

	}
	
	public static void addition()//static regular method
	{
		System.out.println("This is addition method");
		
	}
	
	public void substraction()//non-static regular method
	{
		System.out.println("This is substraction method");
		System.out.println(a);
	}

}

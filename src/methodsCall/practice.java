package methodsCall;

public class practice {

	public static void main(String[] args) {
		System.out.println("Main method running");
		testMe();	
		testMe();	
		testMe();	
		System.out.println("Main method finished");
	}
	
	public static void testMe()
	{
		System.out.println("This  is testMe static regular method");
	}

}

package methodsCall;

public class methodCallStudy {

	public static void main(String[] args) {
		System.out.println("Hi , this is main method");
		//calling static method from same class
		//just call using method name in main method --> eg.methodname();
		display ();//we are calling static method from same class
		display1();//we are calling static regular method from same class
		
		//calling static regular method from another class
		//syntax --> className.methodName();
		practice.testMe();//calling static regular method from another class
	}
	
	public static void display()//static complete method
	{
		System.out.println("Hi , this is display static method");
	}
	
	public static void display1()//static complete method
	{
		System.out.println("Hi , this is display1 static method");
	}

}

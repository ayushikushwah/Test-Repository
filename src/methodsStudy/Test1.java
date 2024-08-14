package methodsStudy;

public class Test1 {

	public static void main(String[] args) {
		
		System.out.println("Main method running");
		//call static regular method of same class -->methodName();
		m1();
		
		//call non-static regular method of same class --> create object of same class 
		//syntax --> className objectName = new className();
		//use that object to call non-static regular method of the same class
		//syntax --> objectName.methodName();
		
		Test1 test1Obj = new Test1();
		test1Obj.m2();
		System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = =");
		
		//call static method from another class
		// syntax --> classname.methodName();
		Test2.m3();
		
		//call Non-static method from another class
		// create object of that class and use that object to call method from that class
		Test2 test2Obj = new Test2();
		test2Obj.m4();
		
		System.out.println("Main method stopped");
	
	}
	
	public static void m1() // static regular method
	{
		System.out.println("This is static regular method m1 of Test1 class");
	}
	
	public static void m2() // non-static regular method
	{
		System.out.println("This is Non-static regular method m2 of Test1 class");
	}


}
	
	

package methodsCall;

public class NonStaticRegularMethodCall {

	public static void main(String[] args) {
		//To create object then follow syntax

		//className objectName = new className();
		
		NonStaticRegularMethodCall obj = new NonStaticRegularMethodCall();//created object from NonStaticRegularMethodCall class
		
		//call non-static regular method of the same class 
		obj.test();
		
		//call non-static regular method of another class --> create the object of that class
		
		Pune puneobj = new Pune();
		puneobj.swargate();//calling non-static regular method of the Pune class
	}
	
	public void test()
	{
		System.out.println("Non-Static method is called");
	}

}

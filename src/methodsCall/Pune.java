package methodsCall;

public class Pune {

	public static void main(String[] args) {
		//to create object
		//classname objname = new classname();
		Pune obj = new Pune();
		//how to call non static method
		//objname.methodname();
		
		katraj();//calling static method from same class
		obj.swargate();//calling non static method from same class
	}
	
	public static void katraj()//static method
	{
		System.out.println("Katraj is static method from pune");
	}

	public void swargate()//non static method
	{
		System.out.println("Swargate is non-static method from pune");
	}

}

package constructor;

public class B extends constructorChaining {
	
	public B()
	{
		super(33);//calling constructor of parent class by using super keyword
		System.out.println("Class B constructor");
	}
	
	public B(int b)
	{
		System.out.println(b);
	}

	public static void main(String[] args) {
		
		B obj = new B();
	}

}

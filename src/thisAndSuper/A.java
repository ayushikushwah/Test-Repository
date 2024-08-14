package thisAndSuper;

public class A {
	
	int x = 99;//global variable of A class
	
	public void demo1()
	{
		int x = 12;//local variable of A class 
		
		int sum = 100 - this.x;//using global value of x using this keyword
		
		int sub = 100 - x;//using local value of x
		
		System.out.println(sub);
	}

	public static void main(String[] args) {
		A obj = new A();
		obj.demo1();
	}

}

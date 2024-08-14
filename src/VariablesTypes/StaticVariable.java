package VariablesTypes;

public class StaticVariable {
	
	int x = 8;//non-static global variable
	static int y = 10;//static global variable

	public static void main(String[] args) {
		
		//call varibles
		Sample obj = new Sample();
		System.out.println("call non-static global variable "+ obj.a);
		
		
	}
	
	public void test1()//non-static regular method
	{
		int sum = 10+x;//using global non-static variable in non-static method
		int sub = 90-y;//using global static variable in non-static method
		System.out.println("Sum is "+sum);
		System.out.println("Sub is "+sub);
	}
	
	public static void test2()//static regular method
	{
		int sub = 90 -y;
		int y = 19;
	}

}

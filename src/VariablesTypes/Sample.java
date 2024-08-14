package VariablesTypes;

public class Sample {
	
	int a = 10;//global variable

	public static void main(String[] args) {
		

	}
	
	public void test1() {
		int x = 100;//local variable
	}
	
	public void test2()
	{
		int a = 100;
		int y = 90;//local variable
		int sub = y - a;
		int x = 200;
		int sum = x+ y;
	}

}

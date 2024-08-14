package constructor;

public class CS2 {
	
	int a = 10;
	int b = 20;
	
	public CS2()//variable initialize
	{
		a = 90;
		b = 100;
	}
	
	public CS2(int x , int y)//variable initialize
	{
		a = x;
		b = y;
	}
	
	public static void main(String[] args) {
		CS2 cs2obj = new CS2();
		cs2obj.addition();
		
		CS2 obj = new CS2(11, 11);
		obj.addition();

	}
	
	public void addition()
	{
		int sum = a + b;
		System.out.println("Sum is "+ sum);
	}

}

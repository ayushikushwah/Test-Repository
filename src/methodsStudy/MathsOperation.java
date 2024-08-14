package methodsStudy;

public class MathsOperation {

	public static void main(String[] args) {
		
		MathsOperation mo = new MathsOperation();
		mo.addition();//calling non-static method without parameters
		mo.addition(11, 89);//calling non-static method with parameters
		mo.addition(1, 7);//calling non-static method with parameters
		substraction();//calling static method without parameters
		substraction(50, 23);//calling static method without parameters
		
	}
	
	public void addition()//method without parameters
	{
		int a = 10;
		int b = 20;
		int sum = a+b;
		System.out.println("Addition is "+ sum);
	}
	
	public void addition(int a , int b )//method with parameters
	{
		int sum = a + b;
		System.out.println("Addition is "+ sum);
	}
	
	public static void substraction()//method without parameters
	{
		int x = 99;
		int y = 90;
		int sub = x -y;
		System.out.println("Substraction is "+sub);
	}
	
	public static void substraction(int x , int y)//method with parameters
	{
		int sub = x-y;
		System.out.println("Substraction is "+sub);
	}
	

}

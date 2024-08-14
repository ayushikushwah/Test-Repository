package thisAndSuper;

public class B extends A{
	
	int x = 1;//global variable from class b (sub-class)

	public static void main(String[] args) {
		B b = new B();
		b.demo2();

	}
	 public void demo2() {
		 int x = 2;//local value from B (sub-class)
		 int sum1 = 100+x;
		 System.out.println(sum1);
		  
		 int sum2 = 100+this.x;//using global value of x of B class(sub-class)
		 System.out.println(sum2);
		 
		 int sum3 = 100+super.x;//using global value of A class (super class using super keyword)
		 System.out.println(sum3);
	 }
}

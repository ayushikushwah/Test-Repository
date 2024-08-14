package casting;

public class UpCastingExample {

	public static void main(String[] args) {
		
		Father f = new Father();
		f.bike();
		f.car();
		
		Son s = new Son();
		s.car();
		s.bike();
		s.laptop();
		
		//upcasting bybcreating object of son class and given the refrence of Father class
		Father objF = new Son();
		objF.bike();
		objF.car();
		
		System.out.println("====================================================================");
		
		int a = 9;
		double b = a;//implicit casting
		System.out.println(b);
		
		double c = 3.2d;
		int d = (int)c;//explicit casting
		System.out.println(d);
		
		

	}

}

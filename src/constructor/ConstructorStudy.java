package constructor;

public class ConstructorStudy {

	public ConstructorStudy() {
		System.out.println("Without parameter constructor");
	}

	public ConstructorStudy(int a) {
		System.out.println("With parameter constructor "+a);
	}
	
	public ConstructorStudy(String a) {
		System.out.println("With parameter constructor "+a);
	}

	public static void main(String[] args) {

		int a;//variable declaration
		a =10;//variable initialization of int type
		
		ConstructorStudy con ;//variable declaration;		
		con = new ConstructorStudy();//variable initialization of class type --> object
		
		ConstructorStudy obj = new ConstructorStudy();
		ConstructorStudy obj1 = new ConstructorStudy(10);
		ConstructorStudy obj2 = new ConstructorStudy("Ayushi");

	}

}

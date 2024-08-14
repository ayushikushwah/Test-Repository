package Inheritance;

public class SingleLevelInheritance {

	public static void main(String[] args) {
		
		Mother mother = new Mother();
		Daughter daughter = new Daughter();

		mother.Receipe();
		mother.look();
		
		System.out.println("===========================================================");
		System.out.println("Daughter class is inherting properties from Mother class :");
		System.out.println("===========================================================");
		
		daughter.study();
		daughter.hobbies();
		daughter.Receipe();//Inheriting properties from mother class
		daughter.look();//Inheriting properties from mother class
	}
	
	

}

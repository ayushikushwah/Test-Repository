package Inheritance;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		GrandMother grandMother = new GrandMother();
		grandMother.stories();
		grandMother.singing();
		
		Mother mother = new Mother();
		mother.Receipe();
		mother.look();
		mother.singing();//calling non-static method of grandmother through object
		
		Mother.stories();//calling static method of grandmother directly through className
					
		Daughter daughter = new Daughter();
		daughter.hobbies();
		daughter.study();		
		daughter.Receipe();
		daughter.look();//calling Non-static method of Mother class
		daughter.singing();//calling Non-static method of GrandMother class
		
		Daughter.Nature();//calling static method of Mother class
		Daughter.stories();//calling static method of GrandMother class
				
	}

}

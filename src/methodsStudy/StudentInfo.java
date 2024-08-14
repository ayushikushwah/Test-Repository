package methodsStudy;

public class StudentInfo {
	public static void main(String[] args) {

		StudentInfo info = new StudentInfo();
		info.displayInformation();
		info.displayInformation("Test1", 43,23.3f, 'A', 90.2f, true);
		info.displayInformation("Test2", 45, 30, 'C', 90, true);
	}
	
	public void displayInformation()
	{
		//name , rollNo , age, div, %marks , passing status
		
		String name = "Ayushi";
		int rollNo = 32;
		float age = 19.9f;
		char div = 'A';
		float marks = 90.21f;
		boolean result = true;
		
		System.out.println("==================================================");
		System.out.println("Student's name is "+ name);
		System.out.println("Student's roll number is "+ rollNo);
		System.out.println("Student's age is "+ age);
		System.out.println("Student's division is "+ div);
		System.out.println("Student's marks is "+ marks + "%");
		System.out.println("Student's result is "+ result);
		System.out.println("==================================================");

	}
	
//	String name = "Ayushi";
//	int rollNo = 32;
//	float age = 19.9f;
//	char div = 'A';
//	float marks = 90.21f;
//	boolean result = true;
	
	//methods with parameters / parameterized variable
	public void displayInformation(String name , int rollNo , float age,char div,float marks , boolean result)
	{
		System.out.println("==================================================");
		System.out.println("Student's name is "+ name);
		System.out.println("Student's roll number is "+ rollNo);
		System.out.println("Student's age is "+ age);
		System.out.println("Student's division is "+ div);
		System.out.println("Student's marks is "+ marks + "%");
		System.out.println("Student's result is "+ result);
		System.out.println("==================================================");
		
	}
}

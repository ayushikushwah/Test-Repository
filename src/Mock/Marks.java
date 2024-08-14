package Mock;

public class Marks extends Student{

	int marks1;
	int marks2;
	
	public void setmarks(int m1 ,int m2)
	{
		marks1 = m1;
		marks2 = m2;
	}
	
	public void getmarks()
	{
		System.out.println("Student mark1 :"+marks1);
		System.out.println("Student mark2 :"+marks2);
	}
	
}

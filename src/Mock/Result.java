package Mock;

import methodsStudy.StudentInfo;

public class Result extends Marks {

	int total ;
	
	public void calculate()
	{
		total = marks1 + marks2;
	}
	
	public void getResult()
	{
		System.out.println("Total marks for student :"+total);
	}
	
	public static void main(String[] args) {
		
		Student student = new Student();
		student.setStudentInfo(41 , "Ayushi");
		student.getStudentInfo();
		
		Marks marks = new Marks();
		marks.setmarks(20, 50);
		marks.getmarks();
		
		
		Result resultObj = new Result();
		resultObj.setmarks(20, 50);
		resultObj.calculate();
		resultObj.getResult();
	}

}

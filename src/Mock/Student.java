package Mock;

public class Student {

	String name;
	int rollNo;
	

	public void setStudentInfo(int sroll, String sname) {
		rollNo = sroll;
		name = sname;

	}

	public void getStudentInfo() {
		System.out.println("Student RollNo :" + rollNo);
		System.out.println("Student Name :" + name);
	}

}

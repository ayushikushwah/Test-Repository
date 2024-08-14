package VariablesTypes;

public class HR {

	public static void main(String[] args) {
		
		Employee Rohit = new Employee();
		Rohit.empName = "Rohit Sharma";
		Rohit.empId = 10;
		Rohit.empGender = 'M';
		Rohit.empSalary = 1000f;
		
		Employee Ayushi = new Employee();
		Ayushi.empName = "Ayushi Kushawah";
		Ayushi.empId = 20;
		Ayushi.empGender = 'F';
		Ayushi.empSalary = 3000.91f;
		
		Employee Rupali = new Employee();
		Rupali.empName = "Rupali Wasekar";
		Rupali.empId = 30;
		Rupali.empGender = 'F';
		Rupali.empSalary = 5031.41f;
		
		Rohit.empInfo();
		Ayushi.empInfo();
		Rupali.empInfo();
		
	}

}

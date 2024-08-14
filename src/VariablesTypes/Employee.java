package VariablesTypes;

public class Employee {
	
	String empName;
	int empId;
	char empGender;
	float empSalary;
	static String empCountry = "India";
	
	public void empInfo() {
		System.out.println("Employee name is :"+empName);
		System.out.println("Employee Id is :"+empId);
		System.out.println("Employee Gender is :"+empGender);
		System.out.println("Employee Salary is :"+empSalary);
		System.out.println("Employee Country is :"+empCountry);
		System.out.println("=========================================================");

	}

	public static void main(String[] args) {
		

	}

}

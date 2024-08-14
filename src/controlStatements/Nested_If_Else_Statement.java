package controlStatements;

public class Nested_If_Else_Statement {

	public static void main(String[] args) {
		// Enter you email id
		// if email id is correct , then enter the password
		// if password is correct then login success
		// else password is incorrect
		// else email id is incorrect

		String emailId = "ayushi@gmail.com";
		String password = "ayushi@123";

		if (emailId == "ayushi@gmail.com") {
			System.out.println("Email Id is correct , please enter password");

			if (password == "ayushi@12") {
				System.out.println("Password is correct , login success");
			} else {
				System.out.println("Password is incorrect");
			}
		} else {
			System.out.println("Email Id is incorrect");
		}

	}

}

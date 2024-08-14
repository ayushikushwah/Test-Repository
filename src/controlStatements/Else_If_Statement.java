package controlStatements;

public class Else_If_Statement {

	public static void main(String[] args) {
		//>= 60 --> 1st class
		//>= 50 --> 2nd class
		//>= 40 --> just pass
		//  <40 --> fail
		
		//if marks greater than or equal 60 then you are in first class
		//else if marks greater than or equal 50 then you are in second class
		//else if marks greater than or equal 40 then you are in just pass
		//else if marks less than 40 then you are in fail
		
		int marks = 80;
		
		if(marks >= 60)
		{
			System.out.println(" 1st class");
		}
		else if(marks >= 50)
		{
			System.out.println("2nd class");
		}
		else if (marks >= 40)
		{
			System.out.println("just pass");
		}
		else
		{
			System.out.println("fail");
		}

	}

}

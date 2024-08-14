package controlStatements;

public class If_Else_Statement {

	public static void main(String[] args) {
		//if your marks greather than 40 then you are pass
		//else you are failed
		
		int marks = 35;
		
		if(marks > 40)
		{
			System.out.println("You are pass");
		}
		else {
			System.out.println("You are fail");
		}
		
		//if signal is red then stop
		//else go
		
		String signal = "green";
		
		if (signal == "red")
		{
			System.out.println("Stop");
		}
		else {
			System.out.println("Go");
		}
		
		//if you are male (M) then turn right
		//else turn left
		
		char gender = 'M';
		
		if(gender == 'M')
		{
			System.out.println("Turn right");
		}
		else
		{
			System.out.println("Turn left");
		}

	}

}

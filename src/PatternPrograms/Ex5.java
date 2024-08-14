package PatternPrograms;

public class Ex5 {

	public static void main(String[] args) {
		
		//*****
		//****
		//***
		//**
		//*
		
		//row = 5; col = 5 ; star in first row = 5;
		
		int row = 5;
		int star = 5;
		
		//rows
		for(int i = 1;i<=row;i++)
		{
			//columns
			for(int j = 1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star--;
		}

	}

}

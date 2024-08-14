package PatternPrograms;

public class Ex4 {

	public static void main(String[] args) {
		
		//*
		//**
		//***
		//****
		//*****
		
		//row = 5 , col=5 
		//1st row star = 1
		
		int row= 5;
		//int col = 5;
		int star = 1;
		
		//outer loop for rows
		for(int i = 1;i<=row;i++)
		{
			//inner loop for columns or star becuase it is incresing by 1 in every line
			for(int j =1;j<=star;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			star++;
		}
	}
}

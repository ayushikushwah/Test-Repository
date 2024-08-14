package PatternPrograms;

public class Ex12 {

	public static void main(String[] args) {
		//*
		//**
		//***
		//****
		//***
		//**
		//*
		
		//row=7;star=1;
		int row=7;
		int star=1;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");					
			}
		
			if(i>=4)
			{
				System.out.println();
				star--;
			}
			else {
				System.out.println();
				star++;
			}
			
		}

	}

}

package PracticeLogical;

public class ReverseTheNumber {

	public static void main(String[] args) {
		int num=1234;
		int revNum=0;
		
		System.out.println(num/10);//-->//123
		System.out.println(num%10);//-->//4
		
		//remeber donot use i>=0 here just use i>0
		//donot use this --> for(int i=num;i>=0;i=i/10) it will give you wrong output
		
		for(int i=num;i>0;i=i/10)
		{
			int rem = i%10;
			revNum = revNum*10+rem;
		}
		System.out.print("reverse number : "+revNum);
		

	}

}

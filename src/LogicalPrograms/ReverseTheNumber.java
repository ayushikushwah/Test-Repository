package LogicalPrograms;

public class ReverseTheNumber {

	public static void main(String[] args) {
		int num = 1234;
		int revNum = 0;

		System.out.println(1234 / 10);// -->123
		System.out.println(123 / 10);// -->123
		System.out.println(1234 % 10);// --> 4
		System.out.println(123 % 10);// -->3
		System.out.println(12 % 10);// -->2
		System.out.println(1 % 10);// -->1

		for (int i = num; i >= 0; i = i / 10) {
			int remainder = i % 10;
			revNum = revNum * 10 + remainder;

		}
		
//		System.out.print(revNum);
//		number is not negative
//		number is not zero

	}

}

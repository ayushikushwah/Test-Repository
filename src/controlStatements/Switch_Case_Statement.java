package controlStatements;

public class Switch_Case_Statement {

	public static void main(String[] args) {
		// days --> 1 ,2 ,...7

		int day = 3;

		switch (day) {
		case 1:
			System.out.println("Today is Sunday");
			break;

		case 2:
			System.out.println("Today is Monday");
			break;

		case 3:
			System.out.println("Today is Tuesday");
			break;

		case 4:
			System.out.println("Today is Wednesday");
			break;

		case 5:
			System.out.println("Today is Thursday");
			break;

		case 6:
			System.out.println("Today is Friday");
			break;

		case 7:
			System.out.println("Today is Saturday");
			break;

		default:
			System.out.println("Please enter the value between 1 to 7");
			break;
		}

		// Months --> 1, 2 ,...12
		String month = "January";

		switch (month) {
		case "January":
			System.out.println("Month is January");
			break;
		case "February":
			System.out.println("Month is February");
			break;
		case "March":
			System.out.println("Month is March");
			break;
		case "April":
			System.out.println("Month is April");
			break;
		case "May":
			System.out.println("Month is May");
			break;
		case "June":
			System.out.println("Month is June");
			break;
		case "July":
			System.out.println("Month is July");
			break;
		case "August":
			System.out.println("Month is August");
			break;
		case "September":
			System.out.println("Month is September");
			break;
		case "October":
			System.out.println("Month is October");
			break;
		case "November":
			System.out.println("Month is November");
			break;
		case "December":
			System.out.println("Month is December");
			break;

		default:
			System.out.println("Please enter the correct month");
			break;
		}
		
		
		
		//M -->
		//F -->
		
		char gender = 'A';
		
		switch (gender) {
		
		case 'M':
			System.out.println("You are male");
			break;
			
		case 'F':
			System.out.println("You are female");
			break;
			

		default:
			System.out.println("Please enter the correct gender value between M/F");
			break;
		}
		
		

	}

}

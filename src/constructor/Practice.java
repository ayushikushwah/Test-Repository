package constructor;

public class Practice {

	int a = 80;
	int b = 30;
	float sum;
	
	public Practice()
	{
		sum= b%a;
		System.out.println("Hi"+sum );
	}
	
	public static void main(String[] args) {
		Practice obj = new Practice();
		obj.constprac();
	}
	
	public static void constprac() {
		System.out.println("Sum"+ 0);
	}

}

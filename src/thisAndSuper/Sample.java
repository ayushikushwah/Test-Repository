package thisAndSuper;

public class Sample {
	
	int a = 90;
	int b = 10;

	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.add();
		}
	public void add() {
		int a = 10;
		int sum = a + 100;///using local variable of same class
		System.out.println(sum);
		int sum1 = this.a + 100;//using global variable of same class if variable names of local and global are same
		System.out.println(sum1);
		int sub = 100 - b;
		}

}

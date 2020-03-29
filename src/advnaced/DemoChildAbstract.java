package advnaced;

public class DemoChildAbstract extends DemoAbstraction{


	@Override
	void add(double a, double b) {
		double sum = a+b;
		System.out.println("Total is: "+sum);
		
	}

	@Override
	int sub(int a, int b) {
		int s = a-b;
		return s;
	}
	
	
	public static void main(String[] args) {
		
		DemoChildAbstract dca = new DemoChildAbstract();
		dca.multiple(10, 10);

	}

}

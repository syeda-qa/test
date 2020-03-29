package advnaced;

public class DemoInterfaceClass implements DemoInterface, MyInterface{

	static void multiple() {
		int m = a*b;
		System.out.println("Multiplication: "+m);
	}
	
	@Override
	public void add(int x, int y) {
		System.out.println("Sum is: "+(x+y*pi));
		
	}

	@Override
	public int sub(int x, int y) {	
		return x-y;
	}
	

	public static void main(String[] args) {
		DemoInterfaceClass dif = new DemoInterfaceClass();
		dif.add(25, 17);
		System.out.println("Subtraction is: "+dif.sub(200, 34));
		multiple();
	}

}

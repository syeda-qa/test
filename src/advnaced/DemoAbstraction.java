package advnaced;

public abstract class DemoAbstraction {
	
	 //Abstraction - provide ideas but no implementation
	//"abstract method" - method without a body
	// abstract void add(int a, int b);
	//abstract class or interface	
	//abstract class
	
	//1. abstract class may have abstract methods or non abstract methods
	//2. abstract class must get inherited and child class implements the abstract methods
	//3. abstract class cannot have an object
	
	abstract void add(double a, double b);
	abstract int sub(int a, int b);
	
	static void multiple(int a, int b) {
		int m = a*b;
		System.out.println("Multiple of two number: "+m);
	}

	public static void main(String[] args) {	
		//DemoAbstraction da = new DemoAbstraction();
		multiple(200,15);	

	}

}

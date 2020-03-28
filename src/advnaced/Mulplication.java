package advnaced;

import oop.Addition;

public class Mulplication extends Addition{
	
	//encapsulation - access modifiers/ visibility modifiers
	//public - accessible within the project
	//private - only accessible with the class
	//default - only accessible within the package 
	//protected - accessible with package & outside package if inherited
		
	
	//static makes a variable class variable 
	//a static variable is the only copy of that class
	static String name = "multiplication";
	//final makes a variable constant 
	final static double pi = 3.14;
	
	public void multiple(int x, int y) {
		int m = x*y;
		System.out.println("Multiple of two number: "+m);
	}
	
	static void multiple(int x) {
		double m = x*pi;
		System.out.println("The multiple with pi: "+m);
	}
	
	public static void main(String[] args) {
		System.out.println(Mulplication.name);

		
		Mulplication m1 = new Mulplication();
		m1.multiple(10, 10);
		m1.add(10.5, 23.75);
	
		Mulplication m2 = new Mulplication();
		m2.multiple(100, 100);
		m2.x=1000;
		m2.y=3000;
		m2.add(10, 10, 10);
				
		multiple(10);
		multiple(100);
	}

}

package oop;

public class Addition {

	// three types of variable - 1. instance variable
	// 2. local variable 3. static or class variable

	// static or class variable - only one copy of the class
	static String name = "Addition";

	// instance variable
	int x;
	int y;

	// return type and method name
	void add() {
		// local variable
		int sum = x + y;
		System.out.println("Sum of two number: " + sum);
	}

	// ---method overloading
	// method return
	int add(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println("Sum of three numbers: " + sum);
		return sum;
	}

	public static void main(String[] args) {

		System.out.println("Name: " + name);

		Addition a1 = new Addition();
		a1.x = 10;
		a1.y = 15;
		a1.add();
		a1.add(10, 10, 10);

		Addition a2 = new Addition();
		a2.x = 100;
		a2.y = 200;
		a2.add();
		a2.add(100, 100, 100);

	}// end of main

}// ennd of class

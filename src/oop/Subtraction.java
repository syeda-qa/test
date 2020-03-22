package oop;

public class Subtraction extends Addition{
	
	//OOP
	//1. inheritance - parent child relationship between two class
	//2. polymorphism - a. method overloading b. method overriding
	//3. encapsulation
	//4. abstraction
	
	void sub(int x, int y) {
		int s = x-y;
		System.out.println("Sub of two number: "+s);
	}
	
	void sub(double x, double y) {
		double s=x-y;
		System.out.println("Sub of two decimal number: "+s);
	}
	
	//method overriding
	void add(double a, double b) {
		double sum = a+b*5.5;
		System.out.println("Sum of two decimal number: "+sum);
	}
	
	public static void main(String[] args) {
		Subtraction s1 = new Subtraction();
		s1.sub(100, 25);
		s1.sub(300.75, 125.18);
		s1.add(10, 10, 10);
		s1.x=1200;
		s1.y=2300;
		s1.add();
		s1.add(10.5, 5.5);
	}

}

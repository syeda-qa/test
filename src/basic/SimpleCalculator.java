package basic;

public class SimpleCalculator {

	public static void main(String[] args) {
		
		//variable -- named memory location
		//Data Type - Numbers, characters and logical
		// Numbers - whole & decimal
		//whole - Integer (int) - 12, 133
		//decimal - (double) - 12.5, 133.33333
		//Characters - char 
		//Characters - String 
		//logical - boolean (True = 1 or False = 0)
		
		//10 & 15
		//variable
		int x;
		int y;
		int sum;
		int sub;
		int m;
		int d;
		
		x=10;
		y=15;
		
		sum = x+y;
		sub = y-x;
		m = x*y;
		d = y/x;
		
		System.out.println("Sum is: "+sum);
		System.out.println("Sub is: "+sub);
		System.out.println("Multiplication: "+m);
		System.out.println("Division: "+d);		

	}//end of main

}//end of class

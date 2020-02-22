package com.javaalgorithms;

public class FizzBuzz {

	public static void main(String[] args) {

		int [] x= {15,5,15,18,19,30,45};
		
		for(int i=0; i<=x.length;i++) {
		
		if(x[0]%3==0 && x[0]%5==0)
			System.out.println("FizzBuzz");
		
		else if (x[0]%3==0)
			System.out.println("Fizz");
		else if (x[0]%5==0)
			System.out.println("Buzz");
		else
			System.out.println(x[0]);
	}

}
}
package com.javaalgorithms;

public class ArrayEven {

	public static void main(String[] args) {

		int [] x = {2,3,5,9,10,12,17};
		
		for(int i=0; i<=x.length-1; i++) {
			if (x[i]%2==0)
				System.out.println(x[i]+ " is a Even number ");
			else if (x[i]%2!=0)
				System.out.println(x[i]+" is a Odd number ");
		}
	}

}

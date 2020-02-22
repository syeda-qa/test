package com.javaalgorithms;

public class FindThreeMaxNum {

	public static void main(String[] args) {

		int [] x= {10,13,47,32,5,7,7};
		
		int maxOne=0;
		int maxTwo=0;
		int maxThree=0;
		
		for (int i=0; i<x.length; i++) {
			if (x[i]> maxOne) {
				maxThree = maxTwo;
				maxTwo = maxOne;
				maxOne = x[i];
			}
			else if (x[i]> maxTwo) {
				maxThree = maxTwo;
				maxTwo = x[i];
			}
			else if (x[i]> maxThree) {
				maxThree = x[i];
			}
			  
		}//end of for
		
		System.out.println(maxOne);
		System.out.println(maxTwo);
		System.out.println(maxThree);
	}

	}



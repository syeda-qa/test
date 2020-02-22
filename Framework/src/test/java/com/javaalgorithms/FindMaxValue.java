package com.javaalgorithms;

public class FindMaxValue {

	public static void main(String[] args) {

		int[] x = { 15, 5, 15, 18, 19, 30, 45 };

		int max = -1;

		for (int i=0;i<=x.length-1; i++) {
			
			if (x[i] >max)
				max = x[i];
		}

		System.out.println(max);

	}

}

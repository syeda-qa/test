package com.javaalgorithms;

public class FindMinValue {

	public static void main(String[] args) {

		int[] x = { 15, 5, 15, 18, 19, 30, 45 };
		int min = 100;

		for (int i = 0; i <= x.length-1; i++) {
			if (x[i] < min)
				min = x[i];

			else if (x[i] < min)
				min = x[i];

		}

		System.out.println(min);
	}

}

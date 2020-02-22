package com.javaalgorithms;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int[] x = { 10, 13, 47, 32, 5, 7, 7 };
		int temp;

		for (int i = 0; i < x.length / 2; i++) {
			temp = x[i];

			x[i] = x[x.length - 1 - i];
			x[x.length - 1 - i] = temp;
		}
		System.out.println(Arrays.toString(x));
	}//end of main

}//end of class

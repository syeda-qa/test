package com.javaalgorithms;

public class SumOf20 {

	public static void main(String[] args) {

		int[] x = { 5, 7, 10, 13, 8, 6 };

		for (int i = 0; i < x.length; i++) {
			int v1 = x[i];

			for (int j = i + 1; j < x.length; j++) {
				int v2 = x[j];

				if (v1 + v2 >= 20)
					System.out.println(x[i] + "," + x[j]);
			} // end for j
		} // end for i
	}// end main

}// end class

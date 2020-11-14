package basic;

import java.util.Arrays;

public class ArrayRevers {

	public static void main(String[] args) {
		int[] x = { 1,2,3,4,5,6};
		int temp;

		for (int i = 0; i < x.length / 2; i++) {
			temp = x[i];

			x[i] = x[x.length - 1 - i];
			x[x.length - 1 - i] = temp;
		}
		System.out.println(Arrays.toString(x));

	}

}

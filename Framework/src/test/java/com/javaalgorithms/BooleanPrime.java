package com.javaalgorithms;

public class BooleanPrime {

	public static void main(String[] args) {

		for (int j = 1; j <= 500; j++) {
			boolean Prime = true;
			for (int i = 2; i < j / 2; i++) {
				if (j % i == 0)
					Prime = false;
				break;
			}
			if (Prime == true)
				System.out.println(j + " is a Prime NUmber");
			else
				System.out.println(j + " is NOT a Prime Number");
		}
	}
}

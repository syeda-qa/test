package com.javaalgorithms;

import java.util.Arrays;

public class FindDuplicateWord {

	public static void main(String[] args) {
		String text = "This is my dup texts";

		String[] s = text.split("\\s");
		System.out.println(Arrays.toString(s));

		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].equalsIgnoreCase(s[j])) {
					System.out.println(s[i]);

				} // end if
			} // end for j
		} // end for i

	}// end main

}// end class

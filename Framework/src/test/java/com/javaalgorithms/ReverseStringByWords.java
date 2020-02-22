package com.javaalgorithms;

import java.util.Arrays;

public class ReverseStringByWords {

	public static void main(String[] args) {

		String sentence = "CareerHAck offer Information Technology Training";

		String[] myString = sentence.split("\\s");

		System.out.println(Arrays.toString(myString));

		for (int i = 0; i < myString.length; i++) {

			String reverse = "";

			for (int j = myString[i].length() - 1; j >= 0; j--) {
				reverse = reverse + myString[i].charAt(j);
			}
			System.out.print(reverse +"\t" );
			//System.out.print(reverse +"," );

		}

	}

}

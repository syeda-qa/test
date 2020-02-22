package com.javaalgorithms;

import java.util.regex.Pattern;

public class HowToFindItPhoneSocialOrZip {

	public static void main(String[] args) {

		String num = "631-56-4381";
		
		if (Pattern.matches("\\d{3}-\\d{3}-\\d{4}", num)==true)
			System.out.println("valid phone number");
		
		else if (Pattern.matches("\\d{3}-\\d{2}-\\d{4}", num)==true)
			System.out.println("it's a SSN");
		
		else if (Pattern.matches("\\d{5}", num)==true)
			System.out.println("it's a zip code");
		
		else
			System.out.println("unknown");
		
		//for this we use regular exception
		//pattern is a java util class
		//matches is a static methods
				
	}

}

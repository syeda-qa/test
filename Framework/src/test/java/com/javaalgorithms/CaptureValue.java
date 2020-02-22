package com.javaalgorithms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaptureValue {

	public static void main(String[] args) {

		String myString ="abc123@123456bristym@gmail.com";
		String emailpattern="[a-zA-z]+[a-zA-Z0-9]+@[a-zA-Z]+\\.[a-zA-Z]{2,4}";
		
		//String emailpattern="\\d{7}";
		
		Pattern pattern = Pattern.compile(emailpattern);
		Matcher m = pattern.matcher(myString);
		while(m.find()) {
			System.out.println(m.group().trim());
		}
	}

}

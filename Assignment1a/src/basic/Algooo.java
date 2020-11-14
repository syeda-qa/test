package basic;

import java.util.regex.Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Algooo {

	public static void main(String[] args) {
		
		  // TODO Auto-generated method stub
		  
		  
		  
		  String mystring ="abc123@$12345?asifanowar@gmail.com"; 
		//String mystring1
		  //="api.openweathermap.org/data/2.5/weather?q=astoria&appid=25b26b3d27570d52ba5a9234304541d5";
		  
		 String emailPattern="[a-zA-Z]+[a-zA-Z0-9]+@+[a-zA-Z]+\\.[a-zA-Z]{2,4}";
		  //String queryPattern=
		  //"[?]+[a-zA-Z]+[=]+[a-zA-Z0-9]+[a-zA-Z0-9]+[a-zA-Z0-9]+[&]+[a-zA-Z0-9]+[a-zA-Z0-9]+[a-zA-Z0-9]+[=]+[a-zA-Z0-9]+[a-zA-Z0-9]";
		  
		  Pattern pattern=Pattern.compile(emailPattern); 
		  Matcher m=pattern.matcher(mystring); 
		  //Pattern pattern=Pattern.compile(queryPattern);
		  //Matcher m= pattern.matcher(mystring1); 
		  while(m.find()) {
		  
		  System.out.println(m.group().trim()); }
		  
		  }
		 

		/*
		 * String name = "careerhack"; char find = 'e'; int c = 0;
		 * 
		 * for (int i = 0; i < name.length() - 1; i++) { if (find == name.charAt(i)) c =
		 * c + 1; } System.out.println("the letter e exists: " + c + " times");
		 */
	}

			

	



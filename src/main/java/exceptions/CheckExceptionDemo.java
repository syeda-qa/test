package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckExceptionDemo {
	
	//Errors - we cannot handle java error (low Memory, JVM not responding)
	//Exceptions - We can handle exceptions
	
	//Exceptions - Checked & UnChecked
	//Checked -- compile time exception -- error before running the code
	//we cannot even run our code without handling checked exception
	//Unchecked -- runtime exception -- error after running the code
	//We can run codes without handling Unchecked exception but Java displays error 
	
	//Throwable - Exception - RunTimeException
	
	public static void main(String[] args) {
		
		File file = new File("test.txt");
		FileReader fr=null;
		//Exception handling -- 
		//1. Throw an exception -- throw/ throws
		//2. catch an exception -- try/ catch/ finally block
		try {
			fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			System.out.println("The file doesnt Exit "+file.toString());
		} catch (Exception e) {
			System.out.println("This is the second exception");			
		} finally {
			System.out.println("Finally block always get executed");
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

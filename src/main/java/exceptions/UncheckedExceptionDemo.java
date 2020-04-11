package exceptions;

public class UncheckedExceptionDemo {

	public static void main(String[] args) {
		
		int x = 10;
		int d = 2;
		
		String name = null;
		
		String[] city = {"Queens", "Brooklyn", "Bronx"};
		
		try {
			int div = x/d;
			System.out.println("Division: "+div);			
		} catch(ArithmeticException e) {
			System.out.println("You cannot divide a number by Zero");
		} finally {
			System.out.println("This finally block");
		}
		
		try {
			int l = name.length();
			System.out.println("Length: "+l);
		} catch (NullPointerException e) {
			System.out.println("Null String has no length");
		}
		
		try {
			System.out.println(city[3]);
		} catch( ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index out of bound");
		}

		

		

		

	}

}

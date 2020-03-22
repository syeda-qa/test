package basic;

public class DemoLoop {

	public static void main(String[] args) {
		// 1. for loop
		for (int i = 0; i < 10; i++) {
			System.out.println(i+". Hello World");
		} // end for
		
		
		//2.while
		int c = 1;
		
		while(c<=10) {
			System.out.println(c+". This While loop");
			c++;
		}//end of while
		
		//Add 1 to 20
		//sum = 1+2+3+4+5......+20
		int sum=0;
		for (int i = 1; i <= 20; i++) {
			sum = sum+i;
		}
		System.out.println("Sum is: "+sum);
		
		
		//add 1 to 20 - only the even numbers
		
		int evenSum = 0;
		for(int i=0; i<=20; i+=2) {
			evenSum = evenSum+i;
		}
		
		System.out.println("Sum of Even Numbers: "+evenSum);
		
		int oddSum=0;
		for(int i=1; i<=20; i+=2) {
			oddSum = oddSum+i;
		}
		System.out.println("Odd Number Sum: "+oddSum);

	}// end of main
}// end of class

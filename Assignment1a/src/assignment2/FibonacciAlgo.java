package assignment2;

import java.util.Scanner;

public class FibonacciAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int n1=0;
		int n2=1;
		int n3;
		int range;
		
		Scanner scan= new Scanner(System.in);
		System.out.println("input the range value");
		range= scan.nextInt();
		System.out.println(n1+ "  " + n2);
		
		for (int i =0; i<=range; i++) {
			n3=n1+n2;
			
			System.out.println(""+n3);
			
			n1=n2;
			n2=n3;
			
			
			
			
		}
		
		
	}

}

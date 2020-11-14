package basic;

import java.util.Scanner;

public class Print4 {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the number:");
		int n= sc.nextInt();
		if (n>2) {
			for(int i=2;i<n;i++) {
				sum = sum +i;
				System.out.println("Total:"+ sum);
			}
	
		}
		else {
			System.out.println("Error");
		}

	}

}

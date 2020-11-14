package assignment2;

import java.util.Scanner;

public class ScannerArrayPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x=new int[5];
		 Scanner in=new Scanner(System.in);
		 
		 System.out.println("Enter the number");
		 for(int i=0;i<5;i++)
		x[i]=in.nextInt();
		 
		 
		 for(int j=0;j<=x.length-1;j++) {
		 boolean isPrime=true;
		 
		 for(int k=2;k<=j;k++)
		 {
		 if(x[j]%k==0){
		 isPrime=false;
		 break;
		 }
		 }
		 
		 if(isPrime)
		 System.out.println(x[j]+"is  the number in the prime number"); 
		 }
	}

}

package basic;

import java.util.Arrays;

public class ArrayMissing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		int[] x = {1,2,3,5,6,7};
		
		 // Calculate n value  
	    int n = x.length + 1 ;

	    // Calculate Sum of N Number 
	    // using Math formula n(n+1)/2 
	    int sumOfNNumbers = sumOfAllNNumbers(n);

	    
	    // Calculate Sum of all numbers in input array
	    int sumOfInputArray = sumOfInputArrayNumbers(x);
	    
	    // Calculate missing number
	    // using subtraction
	    int missingNumber = sumOfNNumbers - sumOfInputArray; 

	    // Print the Missing number          

	    System.out.println("Missing number in an array is : " 
	            + missingNumber);
	}
	public static int sumOfAllNNumbers(int n){
	    int sum = (n*(n+1))/2;
	    return sum;
	}

	public static int sumOfInputArrayNumbers(int[] x){
	   /* int sum = 0;
	    for(int i=0; i < x.length ;i++){
	        sum = sum + x[i];
		*/
		int sum = Arrays.stream(x).sum();
		
	   
	    
	                                        
	
	    return sum;	

	}
	

//

	}



package assignment2;

import java.util.Arrays;

public class MaxMini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] x = {1,2,3,4,5};
		
		int max = Arrays.stream(x).max().getAsInt();
		
		System.out.println(max +" "+ " is the maxium number");
		
		
		
		int [] y = {6,7,8,9,3,2,};
		
		int mini = Arrays.stream(y).min().getAsInt();
		
		System.out.println(mini +" "+ "is the minium number");
		
		
		int [] a = {9,10,11,12,13};
		
		int sum = Arrays.stream(a).sum();
		
		System.out.println(sum);
		
		
	}

}

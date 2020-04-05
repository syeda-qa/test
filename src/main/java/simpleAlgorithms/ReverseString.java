package simpleAlgorithms;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		
		String name = "CareerHack";
		//1. reversing a string by using StringBuffer or StringBuilder class
		StringBuffer sb = new StringBuffer(name);
		sb.reverse();
		System.out.println(sb.toString());
		
		//2. reversing a string by using charAt() method
		
		String reverse="";
		for(int i=name.length()-1; i>=0; i--) {
			reverse = reverse+name.charAt(i);
		}
		System.out.println(reverse);
		
		//3. reversing a string by converting to char array
		char[] rev = name.toCharArray();
		//C, a, r, e, e, r, H, a, c, k
		//swap the array values
		char temp;
		for(int i=0; i<rev.length/2; i++) {
			temp = rev[i];
			rev[i] = rev[rev.length-1-i];
			rev[rev.length-1-i] = temp;			
		}
		System.out.println(Arrays.toString(rev));
	}
}

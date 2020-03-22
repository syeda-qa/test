package basic;

public class DemoSwap {

	public static void main(String[] args) {
		//x = 10
		//y = 15
		//-- swap them x = 15, y = 10
		
		int x = 10;
		int y = 15;
		int temp;
		
		temp = x;
		x=y;
		y = temp;
		
		System.out.println("X is: "+x);
		System.out.println("Y is: "+y);
	}//end of main
}//end of class

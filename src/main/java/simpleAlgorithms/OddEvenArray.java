package simpleAlgorithms;

public class OddEvenArray {

	public static void main(String[] args) {
		// 3, 27, 16, 124, 90, 97, 129
		// length 6 --- max index = length-1 (6-1=5)
		int[] num = { 3, 27, 124, 90, 97, 129, 991, 128};

		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0)
				System.out.println(num[i]+" : is an even Number");
			else if (num[i] % 2 != 0)
				System.out.println(num[i]+" : is an odd Number");
			else
				System.out.println("Unknown");
		}//end for
	}//end main
}//end of class

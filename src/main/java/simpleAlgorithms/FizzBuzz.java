package simpleAlgorithms;

public class FizzBuzz {

	public static void main(String[] args) {

		// number divisible by 3 - fizz (9 - fizz)
		// number divisible by 5 - buzz (10 - buzz)
		// number divisible 3 & 5 - fizzbuzz (15 - fizzbuzz)

		int[] num = { 3, 27, 125, 90, 97, 15, 991, 128 };

		for (int i = 0; i < num.length; i++) {
			if (num[i] % 3 == 0 && num[i] % 5 == 0)
				System.out.println("FizzBuzz");
			else if (num[i] % 3 == 0)
				System.out.println("Fizz");
			else if (num[i] % 5 == 0)
				System.out.println("Buzz");
			else
				System.out.println(num[i]);
		} // end for
	}// end main
}// end class

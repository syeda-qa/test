package simpleAlgorithms;

public class SingleOddEven {

	public static void main(String[] args) {
		// odd number - 3, 5, 7 - Not divisible by 2
		// even number - 2, 4, 10, 100 - divisible by 2

		int num = 123;
		if (num > 1) {
			if (num % 2 == 0)
				System.out.println("Even Number");
			else if (num % 2 != 0)
				System.out.println("Odd Number");
			else
				System.out.println("Unknown");
		}
		else
			System.out.println("Number must be greater than 1");
	}
}

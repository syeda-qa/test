package basic;

public class PrimeArray {

	public static void main(String[] args) {
		int[] p = { 3, 9, 5, 7, 19, 10, 6 };

		for (int i = 0; i <= p.length-1; i++) {

			boolean isPrime = true;
			for (int j = 2; j <= i ; j++) {
				if (p[i] % j == 0) {
					
					
					
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				System.out.println(p[i] + "");

			}
		}
	}
}



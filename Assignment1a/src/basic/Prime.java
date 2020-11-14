package basic;

public class Prime {

	public static void main(String[] args) {
		int p;
		p = 19;

		for (int i = 2; i < p / 2; i++) {
			if (p % i == 0)
				;
			break;
		}
		System.out.println("not a prime number");

		int n;
		n = 21;
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0)
				;
			break;
		}

		System.out.println("n is not a prime number");

		int k = 19;
		boolean Prime = true;

		for (int i = 2; i < k / 2; i++) {
			if (k % i == 0)
				Prime = false;
			break;
		}
		if (Prime == true)
			System.out.println(p + "is a Prime Number");
		else
			System.out.println(p + "is not a Prime Number");

		for (int j = 1; j <= 500; j++) {
			for (int i = 2; i < j / 2; i++) {
				if (j % i == 0)
					Prime = false;
				break;

			}
		}
	}



	}



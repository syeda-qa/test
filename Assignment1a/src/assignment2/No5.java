package assignment2;

public class No5 {

	int sum(int a, int b) {
		int add = a + b;
		return add;
	}

	int sum(int a, int b, int c) {
		int add = a + b + c;
		return add;

	}

	public static void main(String[] args) {
		No5 D1 = new No5();
		int A1 = D1.sum(20, 20);

		int A2 = D1.sum(20, 20, 20);
		System.out.println(A1 + "," + A2);

	}

}

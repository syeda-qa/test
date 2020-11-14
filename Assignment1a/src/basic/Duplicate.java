package basic;

public class Duplicate {

	public static void main(String[] args) {
		//public static void main(String[] args) {

			int[] x = { 5, 7, 5, 10, 13, 8, 9 };
			//int[] y;
			
				int[] my_array = { 1, 7, 2, 5, 5, 6, 6, 7, 2 };

				for (int i = 0; i < my_array.length - 1; i++) {
					for (int j = i + 1; j < my_array.length; j++) {
						if ((my_array[i] == my_array[j]) && (i != j)) {
							System.out.println("Duplicate Element : " + my_array[j]);
						}
					}
				}
			
			
		

			for (int i = 0; i < x.length; i++) {

				int value1 = x[i];

				for (int j = i + 1; j < x.length; j++) {
					if (x[i]==(x[j])) {
						int value2 = x[j];
						{
							if (value1 + value2 >= 20)
								System.out.println(x[i] + "," + x[j]);
						}
					}
				
				}
			}
			
	}
			
}	



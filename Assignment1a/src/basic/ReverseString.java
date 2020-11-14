package basic;

public class ReverseString {

	public static void main(String[] args) {

		
		  // Using StringBuffer class
		StringBuffer a = new
		  StringBuffer(" love bangladesh"); // use reverse() method to reverse string
		  a.reverse(); System.out.println(a);
		 
		String name = "MOM";
		String reverse = "  ";

		for (int i = name.length()-1; i >= 0; i--) {
			reverse  = reverse + name.charAt(i);
			if (name.equalsIgnoreCase(reverse));
			System.out.println(name + "is a palan");
			System.out.println(reverse);
			
		}
		
		

		
	}

}

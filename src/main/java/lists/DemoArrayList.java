package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {

		// Array - is a fixed length data structure
		// Array List - is a dynamic length data structure

		ArrayList<Integer> age = new ArrayList<Integer>();

		age.add(7);
		age.add(12);
		age.add(25);
		age.add(9);

		System.out.println(age.get(2));

		age.remove(2); // remove a value

		age.add(100);

		System.out.println(age.get(2));

		age.add(1, 346); // replace a value from array list

		System.out.println(age.get(1));

		System.out.println("Length of the ArrayList is: " + age.size());
		
		List<Integer> score = new ArrayList<Integer>();
		
		score.add(99);
		score.add(100);
		
		System.out.println(score);
	}

}

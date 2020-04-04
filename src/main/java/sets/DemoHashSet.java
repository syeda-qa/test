package sets;

import java.util.HashSet;
import java.util.Set;

public class DemoHashSet {

	public static void main(String[] args) {
		
		//set interface is sorted list and 
		//doesn't accept duplicate values
		
		HashSet<String> names = new HashSet<String>();
		
		names.add("Biplob");
		names.add("Jessifer");
		names.add("Asif");
		names.add("Jessifer");
		
		System.out.println(names);
		
		names.clear();
		
		System.out.println(names);
		
		Set <Integer> score = new HashSet<Integer>();
		
		score.add(100);
		score.add(99);
		
		System.out.println(score);

	}

}

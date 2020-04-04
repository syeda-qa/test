package lists;

import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {

	public static void main(String[] args) {
		
		//is part of List Interface		
		LinkedList<String> names = new LinkedList<String>();
		
		names.add("Biplob");
		names.add("Jessifer");
		names.add("Asif");
		names.add("Jessifer");
		
		System.out.println(names.get(1));
		
		
		System.out.println(names);
		
		List<Integer> score = new LinkedList<Integer>();
		
		score.add(100);
		score.add(98);
		score.add(99);
		
		System.out.println(score);
			

	}

}

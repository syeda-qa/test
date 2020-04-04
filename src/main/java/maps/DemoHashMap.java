package maps;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {

	public static void main(String[] args) {
		
		Map<String, Integer> score = new HashMap<>();
		
		score.put("Nazrul", 100);
		score.put("Bristy", 100);
		score.put("Nazrul", 98);
		
		System.out.println(score);
		
		System.out.println(score.get("Bristy"));
		
		score.remove("Nazrul");
		
		System.out.println(score);
		
		HashMap<String, Integer> grades = new HashMap<>();
		grades.put("Mahbub", 12);
		
		System.out.println(grades);
		

	}

}

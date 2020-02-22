package com.javacollections;

import java.util.HashMap;
import java.util.Map;

public class JavaMap {

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<>();
		m.put(1, "January");
		m.put(2, "February");
		m.put(3, "March");

		for(Map.Entry<Integer,String>entry:m.entrySet()){
		
	System.out.println(entry.getKey()+""+entry.getValue());
			
	}

}
}
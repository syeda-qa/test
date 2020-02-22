package com.javaalgorithms;

import java.util.HashMap;
import java.util.Map;

public class EachWordCountInSentence {

	public static void main(String[] args) {
		String s = "I love Java Java language";
		String[] word = s.split("\\s");

		// System.out.println(word); to split the word

		Map<String, Integer> m = new HashMap<>();

		for (String ss : word) { 
			String a = ss.toUpperCase();

			if (m.containsKey(a)) {
				int count = m.get(a);
				m.put(a, count + 1);
			}

			else {
				m.put(a, 1);
			}

			for (Map.Entry<String, Integer> entry : m.entrySet()) {

				System.out.println(entry.getKey() + "" + entry.getValue());

			}

		}
	}
}
package com.javacollections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class JavaHashSet {

	public static void main(String[] args) {

		Set<String>s = new HashSet<>();
		s.add("Apple");
		s.add("Ball");
		s.add("Cat");
		s.add("Dog");
		s.add("Apple");
		
		System.out.println(s);
	}

}

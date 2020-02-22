package com.javacollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class JavaLinkedHashSet {

	public static void main(String[] args) {
		Set<String>s = new LinkedHashSet<>();
		s.add("Apple");
		s.add("Ball");
		s.add("Cat");
		s.add("Dog");
		s.add("Apple");
		
		System.out.println(s);
	}

}

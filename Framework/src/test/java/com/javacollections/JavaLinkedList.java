package com.javacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class JavaLinkedList {

	public static void main(String[] args) {
		List<String>l = new LinkedList <> ();
		l.add("Bristy");
		l.add("Ankur");
		l.add("TonkuPonyo");
		l.add("Bristy");
		
		Collections.sort(l);
		System.out.println(l);
		
	}

	}



package com.benat32.compilations;

import java.util.Set;
import java.util.TreeSet;

public class BenAt32_007_01Jan2018 {
	public static void main(String[] args){
		Set<String> s = new TreeSet<String>();
		s.add("Steven");
		s.add("Steven");
		s.add("Ben");
		s.add("Mira");
		s.add("Ben");
		s.add("Ben");
		s.add("Mira");
		printSet(s);
	}
	
	private static void printSet(Set<String> sets){
		for (String set: sets){
			System.out.println(set);
		}
	}
}

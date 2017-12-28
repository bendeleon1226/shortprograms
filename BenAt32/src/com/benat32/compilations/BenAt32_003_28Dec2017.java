package com.benat32.compilations;

import java.util.ArrayList;
import java.util.List;

public class BenAt32_003_28Dec2017 {
	public static void main(String[] args){
		List names = new ArrayList<String>();
		
		names.add("Ben");
		names.add("Mira");
		names.add("Steven");
		
		new BenAt32_003_28Dec2017().displayList(names);
		
	}
	
	private void displayList(List<String> lst){
		for (String name: lst){
			System.out.println(name);
		}
	}
}

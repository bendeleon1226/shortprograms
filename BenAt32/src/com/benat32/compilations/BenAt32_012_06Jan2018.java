package com.benat32.compilations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BenAt32_012_06Jan2018 {
	public static void main(String[] args){
		String text = "John writes about this, and John writes about that," +
				" and John writes about everything.";
		String patternString = "(John) (.+?) ";
		
		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher = pattern.matcher(text);
		
		while(matcher.find()){
			System.out.println("found at group 0:" + matcher.group(0));
			System.out.println("found at group 1:" + matcher.group(1));
			System.out.println("found at group 2:" + matcher.group(2));
		}
	}
}

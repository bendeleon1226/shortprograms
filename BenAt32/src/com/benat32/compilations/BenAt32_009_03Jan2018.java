package com.benat32.compilations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BenAt32_009_03Jan2018 {

	public static void main(String[] args) {
		String text = "This is the text to be searched " +
				"for occurrences of http:// pattern.";
		
		String patternString = "This is the text";
		
		Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(text);
		
		System.out.println("lookingAt = " + matcher.lookingAt());
		System.out.println("matches = " + matcher.matches());

	}

}

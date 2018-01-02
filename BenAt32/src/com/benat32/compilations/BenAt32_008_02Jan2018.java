package com.benat32.compilations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BenAt32_008_02Jan2018 {

	public static void main(String[] args) {
		String text = "ben's website is http:// bendeleon.com ";
		
		String patternString = ".*http://.*";
		
		Pattern pattern = Pattern.compile(patternString);
		
		Matcher matcher = pattern.matcher(text);
		
		boolean matches = matcher.matches();

		System.out.println("Matches: " + matches);

	}

}

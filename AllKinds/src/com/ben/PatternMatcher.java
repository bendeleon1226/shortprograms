package com.ben;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

	public static void main(String[] args) {
	    String inputString1 = "dfogh";// but not dFgH
	    String regex = "[a-z]+";
	    boolean result;

	    Pattern pattern1 = Pattern.compile(regex);
	    Matcher matcher1 = pattern1.matcher(inputString1);
	    result = matcher1.matches();
	    System.out.println(result);

	}

}

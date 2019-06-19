package com.ca;

public class AsciiBasics {

	public static void main(String[] args) {
		AsciiBasics ab = new AsciiBasics();
		
		//String input = "92";
		//String input = "zen10";
		String input = "Steven";
		System.out.println("Output: " + ab.solution(input));

	}
	
	public String solution(String s) {
		char A = s.charAt(0);
		if(A >= 'a' && A <= 'z') {
			return "lowercase";
		} else if(A>='A' && A<= 'Z') {
			return "uppercase";
		} else if (A >= '0' && A<= '9') {
			return "digits";
		} else {
			return "others";
		}
	}

}

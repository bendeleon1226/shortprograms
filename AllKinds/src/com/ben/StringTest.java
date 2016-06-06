package com.ben;

public class StringTest {

	public static void main(String[] args) {
		String ben10 = "ben 12tester";
		String[] benAr = ben10.split("\\s");
		
		System.out.println("Array Length: " + benAr.length);
		for(int i=0; i<benAr.length; i++){
		   System.out.println("ben["+i+"] = " + benAr[i]);
		   System.out.println("ben["+i+"] length = " + benAr[i].length());
		}
		

	}

}

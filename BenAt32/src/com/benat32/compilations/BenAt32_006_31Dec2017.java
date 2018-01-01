package com.benat32.compilations;

public class BenAt32_006_31Dec2017 {
	
	public static void main(String[] args){
		String str = "ben";//1 string object so far: ben
		str.concat("10"); //3 string objects so far: ben, 10, ben10
		//10 has no reference
		//ben10 has no reference
		
		System.out.println(str);
		
		String str1 = "ben"; //3 string objects so far: ben, 10, ben10
		String str2 = "ben"; //3 string objects so far: ben, 10, ben10
		str1 = str1.concat("10");//3 string objects so far: ben, 10, ben10
		String str3 = str.concat("10");
		String str5 = "ben10";
		String str6 = "ben10";
		
		System.out.println(str1);
		
		if(str == str2){
			System.out.println("str2 and str are pointing to the same string object");
			if(str.equals(str2)){
				System.out.println("object referred by str and object referred by str2 have the same value");
			} else {
				System.out.println("object referred by str and object referred by str2 don't have the same value");
			}
		} else {
			System.out.println("str2 and str are not pointing to the same string object");
		}
		
		if(str1 == str3){
			System.out.println("str1 and str3 are pointing to the same string object");
		} else {
			System.out.println("str1 and str3 are not pointing to the same string object");
			if(str1.equals(str3)){
				System.out.println("object referred by str1 and object referred by str3 have the same value");
			} else {
				System.out.println("object referred by str1 and object referred by str3 don't have the same value");
			}
		}
		
		if(str1 == str5){
			System.out.println("str1 and str5 are pointing to the same object");
		}
		
		if(str1.equals(str5)){
			System.out.println("str1 and str5 have the same value");
		}
		
		if(str6 == str5){
			System.out.println("str6 and str5 are pointing to the same object");
		}
	}

}

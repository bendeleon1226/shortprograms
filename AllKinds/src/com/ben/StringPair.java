package com.ben;

import java.util.Set;
import java.util.regex.Pattern;
import java.util.HashSet;
import java.util.Scanner;

public class StringPair {

	public static void main(String[] args) {
		int counter = 0;
		Set pairs = new HashSet();
		Scanner scan = new Scanner(System.in);
		int T = 0;
		
		//make sure that the first entry is numeric
		try{
			T = Integer.parseInt(scan.nextLine());
		} catch (NumberFormatException x){
			System.out.println("Invalid Number of Pairs!");
			System.exit(1);
		}
		//apply constraints to T. T should be between 1 and 100,000		
		if(T < 1 || T > 100000){
			System.out.println("Number of pairs should be between 1 and 100000");
			System.exit(1);
		}
		
		for(int x=0; x < T; x++){
			String pair = scan.nextLine();
			//Make sure that a single line contains only two strings separated by space
			String[] pairArray = pair.split("\\s");
			if(pairArray.length != 2){
				System.out.println("There should be exactly two strings separated by a space for every line.");
				System.exit(1);
			}
			
			//Apply constraints: each string is at most 10 characters
			if(pairArray[0].length()>10 || pairArray[1].length()>10){
				System.out.println("Each string should be at most 10 characters only.");
				System.exit(1);
			}
			
			//Apply constraints: lower case letters only
			if(!(Pattern.compile("[a-z]+").matcher(pairArray[0]).matches() && 
					Pattern.compile("[a-z]+").matcher(pairArray[1]).matches())){
				System.out.println("Each string should be lower-case letters only.");
				System.exit(1);
			}
				
			if(pairs.add(pair)){
				counter++;
			}
			System.out.println(counter);
		}
	}

}

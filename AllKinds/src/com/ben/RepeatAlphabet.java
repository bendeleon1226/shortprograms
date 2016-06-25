package com.ben;

import java.util.Scanner;

public class RepeatAlphabet {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String ben10 = scan.nextLine();
		char[] benAr = ben10.trim().toCharArray();
		
		System.out.print(ben10.trim() + " -> ");
		for(int i=0; i<benAr.length; i++){
		   if(i==benAr.length-1){
			   System.out.print(benAr[i]); 
		   } else {
			   System.out.print(benAr[i] + " " 
					   			+ benAr[i]
					   			+ ""
					   			+ benAr[i+1]
					   			+ " ");
		   }
		}
	}

}

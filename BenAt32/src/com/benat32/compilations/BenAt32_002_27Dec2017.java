package com.benat32.compilations;

import java.util.Scanner;

import com.benat32.util.BenAt32Utility;

public class BenAt32_002_27Dec2017 {

	public static void main(String[] args) {
		System.out.print("Enter number: ");
		Scanner scan = new Scanner(System.in);
		BenAt32_002_27Dec2017 x = new BenAt32_002_27Dec2017();
		x.printNumbers(scan.nextInt());
	}
	
	private void printNumbers(int x){
		for(int a=1; a<=x; a++)
			System.out.println(a);
	}

}

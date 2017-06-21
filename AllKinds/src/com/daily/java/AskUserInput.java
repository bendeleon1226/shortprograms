package com.daily.java;

import java.util.Scanner;

public class AskUserInput {

	public static void main(String[] args) {
		AskUserInput aui = new AskUserInput();
		aui.promptUser();
	}
	
	public void promptUser(){
		System.out.print("Enter any number: ");
	    Scanner scan = new Scanner(System.in);
		int userInput = scan.nextInt();
		displayNumbers(userInput);
	}
	
	public void displayNumbers(int x){
		for (int y = 1; y <= x; y++)
			System.out.println("Number " + y);
	}

}

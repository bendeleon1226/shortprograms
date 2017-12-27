package com.benat32.util;

public class BenAt32Utility {
	public int getSum(int[] x){
		int sum = 0;
		for(int y: x){
			sum = sum + y;
		}
		return sum;
	}
	
	public void printNumbers(int x){
		for(int a=1; a<=x; a++)
			System.out.println(a);
	}
}

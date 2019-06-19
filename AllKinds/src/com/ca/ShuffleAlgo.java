package com.ca;

public class ShuffleAlgo {

	public static void main(String[] args) {
		ShuffleAlgo sa = new ShuffleAlgo();
		
		//int input = 123456;
		int input = 1234567;
		//int input = 103;
		//int input = 12345678;
		//int input = 8;
		//int input = 23;
		System.out.println("Output: " + sa.solution(input));
	}

	public int solution(int A) {
		char[] arrInt = new Integer(A).toString().toCharArray();
		
		if(arrInt.length <= 2) {
			return Integer.parseInt(new String(arrInt));
		}
		
		char[] shuffled = new char[arrInt.length];
		
		int index = 0;
		int i = 0;
		int j = arrInt.length - 1;
		
		while(i<j) {
			shuffled[index] = arrInt[i];
			shuffled[index+1] = arrInt[j];
			index = index + 2;
			i = i + 1;
			j = j - 1;
		}
		
		if(i==j)
			shuffled[index] = arrInt[i];
		
		return Integer.parseInt(new String(shuffled));
	}

}

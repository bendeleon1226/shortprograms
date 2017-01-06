package com.ca;

//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution {
 public int solution(int[] A) {
     // write your code in Java SE 8
	 int arrayLength = A.length;
	 int ctrEvenPair = 0;

	 for(int i=0; i<arrayLength-1; i++){
		 for(int j=i+1; j<arrayLength; j++){
			 if(((A[i]+A[j])%2) == 0)//test if even
				 ctrEvenPair++;
		 }
	 }
	 if(ctrEvenPair > 1000000000){
		 ctrEvenPair = -1;
	 }
	 return ctrEvenPair;
 }

 public static void main(String[] args){
	 Solution s = new Solution();
	 int[] n = {2,1,5,-6,9};
	 System.out.println(s.solution(n));
 }
}

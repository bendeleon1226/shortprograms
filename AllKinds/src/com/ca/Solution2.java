package com.ca;

//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution2 {
 public int solution(int[] A) {
     // write your code in Java SE 8
	 int arrayLength = A.length;
	 int distance = 0;
	 int smallest = 0;

	 if(arrayLength >= 2){

		 for(int i=0; i<arrayLength-1; i++){
			 for(int j=i+1; j<arrayLength; j++){
				 if(i == 0 && j == 1){//first occurence - assume smallest
					 if((A[i] - A[j]) >= 0){
						 smallest = A[i] - A[j];
					 } else {
						 smallest = A[j] - A[i];
					 }					 
				 } else {
					 if((A[i] - A[j]) >= 0){
						 distance = A[i] - A[j];
					 } else {
						 distance = A[j] - A[i];
					 }					 
					 if(distance < smallest)
						 smallest = distance;
				 }
			 }
		 }
	 }
	 return smallest;
	 
 }

 public static void main(String[] args){
	 Solution2 s = new Solution2();
	 //int[] A = {8,24,3,20,1,17};
	 int[] A = {7,21,3,42,3,7};
	 System.out.println(s.solution(A));
 }
}

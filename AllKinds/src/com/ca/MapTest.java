package com.ca;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	
	public String solution(String s){
		Map<String,String> rules = new HashMap<String,String>();
		rules.put("AB", "AA");
		rules.put("BA", "AA");
		rules.put("CB", "CC");
		rules.put("BC", "CC");
		rules.put("AA", "A");
		rules.put("CC", "C");
		
		StringBuilder sb = new StringBuilder(s);
		boolean isRuleApply = true;
		while(isRuleApply){
			//System.out.println(sb);
			int sbLength = sb.length();
			boolean isRuleFound = false;
			if(sbLength >=2){
				for(int i=0; i<sbLength-1; i++){
					if(rules.containsKey(sb.substring(i, i+2))){
						String insertReplacement = rules.get(sb.substring(i, i+2));
						sb.delete(i,i+2);
						sb.insert(i, insertReplacement);
						isRuleFound = true;
						break;
					}
				}
				if(isRuleFound)
					isRuleApply = true;
				else 
					isRuleApply = false;
			} else {
				isRuleApply = false;
			}
		}
		return sb.toString();		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapTest mt = new MapTest();
		String s = "ABBCC";
		//String s = "ACAA";
		System.out.println(mt.solution(s));		
	}
	
	

}

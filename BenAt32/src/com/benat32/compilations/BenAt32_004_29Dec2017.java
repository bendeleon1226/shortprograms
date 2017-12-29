package com.benat32.compilations;

public class BenAt32_004_29Dec2017 {

	enum Size {
		SMALL,
		MEDIUM,
		LARGE
	}
	
	private enum Flavor {
		CHOCOLATE(100),
		VANILLA(120),
		STRAWBERRY(80);
		
		private int fCalories;
		
		void setCalaries(int aCalories){
			fCalories = aCalories;
		}
		
		private Flavor(int aCalories){
			fCalories = aCalories;
		}
		
		int getCalories (){
			return fCalories;
		}
	}
	
	public static void main(String[] args){
		System.out.println("My size: " + Size.MEDIUM);
		System.out.println("Chocolate calories: " + Flavor.CHOCOLATE.getCalories());
		Flavor.CHOCOLATE.setCalaries(150);
		System.out.println("Chocolate calories: " + Flavor.CHOCOLATE.getCalories());
		
		for(Size size: Size.values()){
			log("Size: " + size);
		}
	}
	
	private static void log(Object aMessage){
		System.out.println(String.valueOf(aMessage));
	}	
}

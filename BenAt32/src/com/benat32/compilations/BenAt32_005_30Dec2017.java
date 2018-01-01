package com.benat32.compilations;

public class BenAt32_005_30Dec2017 {

	enum Direction {
		NORTH,
		SOUTH,
		EAST,
		WEST;
		
		public String toString(){
			return "Direction: " + name();
		}
		
		public boolean isCold(){
			return this == NORTH;
		}
	}
	public static void main(String[] args){
		log("hi ben!");
		log("toString: " + Direction.WEST);
		
		if(Direction.NORTH.isCold()){
			log("North is cold");
		} else {
			log("North	 is not cold");
		}
	}
	
	private static void log(Object text){
		System.out.println(String.valueOf(text));
	}
}

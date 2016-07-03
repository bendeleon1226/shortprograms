package com.ben;

public class StringParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "\"totalVolume\":\"29,400\",\"indicator\":\"D\",\"percChangeClose\":\"-0.41\",\"lastTradedPrice\":\"7.27\"";
		String y = "\"a\"";
		System.out.println(x);
		int ctr = 0;
		
		String[] xAr =x.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);
		for (String xl : xAr){
			String xlvalue = xl.replace(",", "");
			System.out.println(xlvalue);
			String[] xlvalue2 = xlvalue.split(":");
			for(String fx: xlvalue2){
				System.out.println(fx.substring(1,fx.length()-1));
			}
			
		}
	}

}

package com.benat32.util;

import java.beans.XMLEncoder;
import java.io.ByteArrayOutputStream;

public class BenAt32Utility {
	public int getSum(int[] x){
		int sum = 0;
		for(int y: x){
			sum = sum + y;
		}
		return sum;
	}
	
	public String toXML(Object obj){
		String xml = null;
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		XMLEncoder encoder = new XMLEncoder(out);
		encoder.writeObject(obj);
		encoder.close();
		xml = out.toString();
		return xml;
	}
}

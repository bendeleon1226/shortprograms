package com.ben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.stocks.model.SimpleSelect;


public class DownloadPage {

    public static void main(String[] args) throws IOException {

        // Make a URL to the web page
        URL url = new URL("http://pse.com.ph/stockMarket/home.html?method=getSecuritiesAndIndicesForPublic&ajax=true");

        // Get the input stream through URL Connection
        URLConnection con = url.openConnection();
        InputStream is =con.getInputStream();

        // Once you have the Input Stream, it's just plain old Java IO stuff.

        // For this case, since you are interested in getting plain-text web page
        // I'll use a reader and output the text content to System.out.

        // For binary content, it's better to directly read the bytes from stream and write
        // to the target file.


        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line = null;
        
        List<Map<String,String>> stocksList = new ArrayList<Map<String,String>>();

        // read each line and write to System.out
        int ctr = 0;
        while ((line = br.readLine()) != null) {
        	String[] lineAr = line.split("\\{");
        	for(String ln : lineAr){
        		ctr = ctr +1;
        		if (ctr == 1) 
        			continue;
        		if(ln.contains("PSEi"))
        			break;
        		
        		String ln1 = ln.substring(0, ln.length()-2);
        		String[] xAr =ln1.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);
        		
        		Map<String,String> stockdetails = new HashMap<String,String>();
        		for (String xl : xAr){
        			String xlvalue = xl.replace(",", "");
        			String[] xlvalue2 = xlvalue.split(":");
        			stockdetails.put(xlvalue2[0].substring(1, xlvalue2[0].length()-1), xlvalue2[1].substring(1, xlvalue2[1].length()-1));
        		}
        		stocksList.add(stockdetails);
        	}
        	if(lineAr.length == 252){
        		System.out.println("Data is good!");
        	} else {
        		System.out.println("Data looks wrong. Check the source!");
        	}
        }
        for(Map<String,String> sds : stocksList){
        	if(sds.get("lastTradedPrice").equals("DATE")){
        		System.out.println("Date: " + sds.get("securityAlias").substring(0, 10));
        	} else {
        		System.out.println("Stock: " + sds.get("securitySymbol")
        		+ " | Last Traded Price: " + sds.get("lastTradedPrice")
        		+ " | Volume: " + sds.get("totalVolume")
        		);
        	}
        }
        SimpleSelect service = new SimpleSelect();
        service.importData(stocksList);
    }
}
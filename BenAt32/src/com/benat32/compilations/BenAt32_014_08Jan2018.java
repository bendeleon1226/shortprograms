package com.benat32.compilations;

import com.benat32.beans.Book;
import com.benat32.util.BenAt32Utility;

public class BenAt32_014_08Jan2018 {

	public static void main(String[] args) {
		Book[] books = new Book[3];
		
		books[0] = new Book();
		books[1] = new Book();
		books[2] = new Book();
		
		books[0].setAuthor("Ben");
		books[0].setTitle("Understanding AML KYC");
		books[0].setType("Banking");

		books[1].setAuthor("Martin");
		books[1].setTitle("Java Web Services");
		books[1].setType("Java");

		books[2].setAuthor("Napoleon");
		books[2].setTitle("Think and grow rich");
		books[2].setType("self-help");

		BenAt32Utility util = new BenAt32Utility();
		
		System.out.println(util.toXML(books));
		

	}

}

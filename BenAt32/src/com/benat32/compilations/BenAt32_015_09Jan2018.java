package com.benat32.compilations;

import java.util.ArrayList;
import java.util.List;
import com.benat32.beans.Book;

public class BenAt32_015_09Jan2018 {
	public static void main(String[] args){
		List<Book> books = new ArrayList<Book>();
		Book book1 = new Book();
		book1.setTitle("Hadoop");
		book1.setAuthor("Ben10");
		book1.setType("BigData");
		books.add(book1);
		
		Book book2 = new Book();
		book2.setTitle("MongoDB");
		book2.setAuthor("Ben11");
		book2.setType("NoSQL");
		books.add(book2);
		
		int ctr = 0;
		for (Book book: books){
			ctr++;
			System.out.println("Book#" + ctr);
			System.out.println("Title: " + book.getTitle());
			System.out.println("Author: " + book.getAuthor());
			System.out.println("Book Type: " + book.getType());
			System.out.println();
		}
	}

}

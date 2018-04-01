package com.benat32.compilations;

import java.util.ArrayList;
import java.util.List;

import com.benat32.beans.Book;

public class BenAt32_016_10Jan2018 {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<Book>();
		Book book1 = new Book("Hadoop","Ben10","BigData");
		books.add(book1);

		Book book2 = new Book("MongoDB","Ben11","NoSQL");
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

package com.ylli.library.main;

import com.ylli.library.model.Book;
import com.ylli.library.model.Library;
import com.ylli.library.model.Loan;
import com.ylli.library.model.User;
import com.ylli.library.service.LibraryService;
public class LibraryApplication {

	   public static void main(String[] args) {

	        LibraryService service = new LibraryService();

	        User ylli = new User("Ylli");

	        Book javaBook = new Book("Java Fundamentals");

	        Book seleniumBook = new Book("Selenium Automation");

	        service.borrowBook(ylli, javaBook);

	        service.borrowBook(ylli, seleniumBook);

	        service.returnBook(ylli, javaBook);

	        Loan loan = new Loan(
	                ylli,
	                javaBook,
	                "13/10/2026"
	        );

	        System.out.println(loan);

	        Library library = new Library();

	        library.addBook(javaBook);
	        library.addBook(seleniumBook);

	        System.out.println(
	                "Books in library: "
	                + library.getBooks().size());

	        System.out.println("------ LIBRARY BOOKS ------");

	        for (Book book : library.getBooks()) {
	            System.out.println(book.getTitle());
	        }
	    }
	}
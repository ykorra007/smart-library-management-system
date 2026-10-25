package com.ylli.library.service;

import com.ylli.library.model.Book;
import com.ylli.library.model.User;
public class LibraryService {

	public void borrowBook(User user, Book book) {

        if (!book.isAvailable()) {
            System.out.println("Book not available.");
            return;
        }

        if (user.getBorrowedBooks().size() >= 3) {
            System.out.println("Maximum limit reached.");
            return;
        }

        user.getBorrowedBooks().add(book);
        book.setAvailable(false);

        System.out.println(user.getName() +
                " borrowed " +
                book.getTitle());
    }

    public void returnBook(User user, Book book) {

        user.getBorrowedBooks().remove(book);
        book.setAvailable(true);

        System.out.println(book.getTitle()
                + " returned successfully.");
    }
}

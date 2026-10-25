package com.ylli.library.model;

public class Loan {

    private User user;
    private Book book;
    private String borrowDate;

    public Loan(User user, Book book, String borrowDate) {

        this.user = user;
        this.book = book;
        this.borrowDate = borrowDate;
    }

    public User getUser() {
        return user;
    }

    public Book getBook() {
        return book;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    @Override
    public String toString() {

        return "User: " + user.getName()
                + " | Book: " + book.getTitle()
                + " | Borrow Date: " + borrowDate;
    }
}
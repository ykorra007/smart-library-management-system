package com.ylli.library.exception;

public class BorrowLimitExceededException extends Exception {

    public BorrowLimitExceededException(String message) {
        super(message);
    }
}
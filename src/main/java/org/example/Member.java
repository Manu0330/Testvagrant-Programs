package org.example;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private String id;
    private List<Book> borrowedBooks;

    public Member(String name, String id) {
        this.name = name;
        this.id = id;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getDetails() {
        return "Member Name: " + name + ", Member ID: " + id;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.borrowBook();
            System.out.println(name + " has borrowed the book: " + book.getDetails());
        } else {
            System.out.println("The book is currently unavailable.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.returnBook();
            System.out.println(name + " has returned the book: " + book.getDetails());
        } else {
            System.out.println("This book was not borrowed by " + name);
        }
    }

    public void listBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println(name + " has no borrowed books.");
        } else {
            System.out.println(name + "'s borrowed books:");
            for (Book book : borrowedBooks) {
                System.out.println(book.getDetails());
            }
        }
    }
}

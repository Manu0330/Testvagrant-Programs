package org.example;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Book> books;
    private Map<String, Member> members;

    public Library() {
        this.books = new HashMap<>();
        this.members = new HashMap<>();
    }

    public void addBookToInventory(Book book) {
        books.put(book.getISBN(), book);
    }

    public void removeBookFromInventory(Book book) {
        books.remove(book.getISBN());
    }

    public void registerMember(Member member) {
        members.put(member.id, member);
    }

    public void issueBook(String memberId, String bookISBN) {
        Member member = members.get(memberId);
        Book book = books.get(bookISBN);

        if (member != null && book != null) {
            member.borrowBook(book);
        } else {
            System.out.println("Member or Book not found.");
        }
    }

    public void receiveBook(String memberId, String bookISBN) {
        Member member = members.get(memberId);
        Book book = books.get(bookISBN);

        if (member != null && book != null) {
            member.returnBook(book);
        } else {
            System.out.println("Member or Book not found.");
        }
    }

    public void listAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book book : books.values()) {
                System.out.println(book.getDetails());
            }
        }
    }

    public Book searchBooksByTitle(String title) {
        for (Book book : books.values()) {
            if (book.getDetails().toLowerCase().contains(title.toLowerCase())) {
                return book;
            }
        }
        return null;
    }
}

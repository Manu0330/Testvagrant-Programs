package org.example;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int copies;

    public Book(String title, String author, String ISBN, int copies) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.copies = copies;
    }

    public String getDetails() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Copies Available: " + copies;
    }

    public boolean isAvailable() {
        return copies > 0;
    }

    public void borrowBook() {
        if (isAvailable()) {
            copies--;
        } else {
            System.out.println("No copies available.");
        }
    }

    public void returnBook() {
        copies++;
    }

    public String getISBN() {
        return ISBN;
    }
}

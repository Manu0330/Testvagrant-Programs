package org.example;

public class Librarian {
    private String name;
    private String id;

    public Librarian(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getDetails() {
        return "Librarian Name: " + name + ", Employee ID: " + id;
    }

    public void addBook(Library library, Book book) {
        library.addBookToInventory(book);
        System.out.println("Book added to library: " + book.getDetails());
    }

    public void removeBook(Library library, Book book) {
        library.removeBookFromInventory(book);
        System.out.println("Book removed from library: " + book.getDetails());
    }

    public void viewInventory(Library library) {
        library.listAllBooks();
    }
}

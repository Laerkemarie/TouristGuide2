package miniOpgaver.NummerTo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Libary libary = new Libary("Hovedgade 123");

        libary.addBook(new Book("Hans og Grete", "Brøderne Grim"));
        libary.addBook(new Book("Prinsessen på ærten", "HC Andersen"));
        libary.addBook(new Book("The fault in our stars", "John Green"));
        libary.addBook(new Book("Papertowers", "John Green"));

        String author = "John Green";
        List<Book> booksByAuthor = libary.getBooksByAuthor(author);

        System.out.println("Bøger skrevet af " + author + ":");
        for (Book book : booksByAuthor) {
            System.out.println("- " + book.getTitle());
        }
    }
}

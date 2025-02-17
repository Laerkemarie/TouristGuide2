package miniOpgaver.NummerTo;
import java.util.ArrayList;
import java.util.List;

public class Libary {
    private List<Book> books;
    private String address;

    public Libary(String address) {
        this.books = new ArrayList<>();
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooksByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }
}

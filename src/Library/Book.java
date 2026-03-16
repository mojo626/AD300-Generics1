package Library;

public class Book extends LibraryItem {
    String author;

    public Book(int id, String name, String author) {
        super(id, name);

        this.author = author;
    }
}

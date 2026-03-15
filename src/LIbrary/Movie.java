package LIbrary;

public class Movie extends LibraryItem {
    int year;

    public Movie(int id, String name, int year) {
        super(id, name);

        this.year = year;
    }
}
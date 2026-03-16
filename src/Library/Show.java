package Library;

public class Show extends LibraryItem {
    String director;

    public Show(int id, String name, String director) {
        super(id, name);

        this.director = director;
    }
}

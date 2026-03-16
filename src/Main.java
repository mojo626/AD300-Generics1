import Library.Book;
import Library.Library;
import Library.Movie;

class Main {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<Integer>(2);
        Box<String> strBox = new Box<String>("Hello, World!");
        Box<Boolean> boolBox = new Box<Boolean>(true);

        intBox.setObj(10);
        strBox.setObj("Testing");
        boolBox.setObj(false);

        System.out.println(intBox.getObj());

        intBox.printBox();
        strBox.printBox();
        boolBox.printBox();

        NumberBox<Integer> newIntBox = new NumberBox<Integer>(10);
        NumberBox<Double> doubleBox = new NumberBox<Double>(10.0);
        //NumberBox<String> errBox = new NumberBox<String>("Testing");


        StringProcessor processor = new StringProcessor();
        System.out.println(processor.process("Hello, World!"));

        Box.printBox(newIntBox);
        Box.printBox(doubleBox);


        System.out.println();
        System.out.println("Library: ");
        Library<Book> bookLibrary = new Library<>();

        bookLibrary.addItem(new Book(1, "A Tale of Two Cities", "Charles Dickens"));
        bookLibrary.addItem(new Book(2, "The Little Prince", "Antoine de Saint-Exupery"));
        bookLibrary.addItem(new Book(3, "The Alchemist", "Paulo Coelho"));

        System.out.println("Find Item: ");
        System.out.println(bookLibrary.findFirstItemWithName("The Little Prince"));
       
        Library<Movie> movieLibrary = new Library<>();

        movieLibrary.addItem(new Movie(1, "Avatar", 2009));
        movieLibrary.addItem(new Movie(2, "Avengers: Endgame", 2019));
        movieLibrary.addItem(new Movie(3, "Titanic", 1997));

    }
}

package NullObject;
import java.util.List;
import java.util.ArrayList;

public class BookShelf {
    private final List<Book> aBooks = new ArrayList<Book>();

    public BookShelf(){
        aBooks.add(Book.NULL);
    }
}

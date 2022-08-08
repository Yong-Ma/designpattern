package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @ClassName BookShelf
 * @description: 书架，存放书，即书的集合
 * @author: mzy
 * @create: 2022-07-28 23:24
 * @Version 1.0
 **/
public class BookShelf implements Aggregate<Book>{

    private ArrayList<Book> books;

    public BookShelf() {
        books = new ArrayList<>();
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public Book getBookOfIndex(int index) {
        return books.get(index);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}

package Iterator;

import java.util.Iterator;

/**
 * @ClassName BookShelfIterator
 * @description: 遍历书架的迭代器
 * @author: mzy
 * @create: 2022-07-28 23:31
 * @Version 1.0
 **/
public class BookShelfIterator implements Iterator<Book> {

    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Book next() {
        Book book = bookShelf.getBookOfIndex(index);
        index++;
        return book;
    }
}

package Iterator;

import java.util.Iterator;

/**
 * @ClassName Test
 * @description: 测试迭代器模式
 * 迭代器模式把遍历集合的实现隐藏起来，调用者永远可以用hasNext、next来进行遍历
 * 此外，迭代器可以有多种实现
 * @author: mzy
 * @create: 2022-07-28 23:50
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}

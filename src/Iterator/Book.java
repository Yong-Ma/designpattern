package Iterator;

/**
 * @ClassName Book
 * @description: 书
 * @author: mzy
 * @create: 2022-07-28 23:22
 * @Version 1.0
 **/
public class Book {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Book(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}

package Iterator;

import java.util.Iterator;

/**
 * @ClassName Aggregate
 * @description: 集合接口，实现该接口的类看作是一个集合，集合可生成迭代器来遍历集合，类似于Iterable接口
 * @author: mzy
 * @create: 2022-07-28 23:18
 * @Version 1.0
 **/
public interface Aggregate<T> {
    Iterator<T> iterator();
}

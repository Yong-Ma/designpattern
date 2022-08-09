package Singleton;

/**
 * @ClassName LazyStaticSingleton
 * @description: 懒汉式的静态内部类实现
 * @author: mzy
 * @create: 2022-08-09 22:35
 * @Version 1.0
 **/
public class LazyStaticSingleton {

    private LazyStaticSingleton() {
        System.out.println("懒汉式的静态内部类实现");
    }

    public static LazyStaticSingleton getInstance() {
        return innerClass.single;
    }

    private static class innerClass {
        public static final LazyStaticSingleton single = new LazyStaticSingleton();
    }
}

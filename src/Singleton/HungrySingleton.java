package Singleton;

/**
 * @ClassName LazySingleton
 * @description: 饿汉式单例
 * @author: mzy
 * @create: 2022-08-09 00:20
 * @Version 1.0
 **/
public class HungrySingleton {
    private static HungrySingleton singleton = new HungrySingleton();
    private HungrySingleton() {
        System.out.println("饿汉式单例实例");
    }
    public static HungrySingleton getInstance() {
        return singleton;
    }
}

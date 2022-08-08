package Singleton;

/**
 * @ClassName LazySingleton
 * @description: 懒汉式
 * @author: mzy
 * @create: 2022-08-09 00:24
 * @Version 1.0
 **/
public class LazySingleton {

    private static volatile LazySingleton singleton = null;

    private LazySingleton() {
        System.out.println("懒汉式单例实例化");
    }

    public static LazySingleton getInstance() {
        // 双重检测锁 --》 https://www.jianshu.com/p/3f5eb3e0b050
        if (singleton == null) {
            synchronized (LazySingleton.class) {
                if (singleton == null) {
                    singleton = new LazySingleton();
                }
            }
        }
        return singleton;
    }
}

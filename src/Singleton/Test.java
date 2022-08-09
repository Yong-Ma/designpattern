package Singleton;

/**
 * @ClassName Test
 * @description: 测试获取的实例是否是同一个
 * @author: mzy
 * @create: 2022-08-09 22:49
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
        HungrySingleton hungrySingleton2 = HungrySingleton.getInstance();
        System.out.println(hungrySingleton1 == hungrySingleton2);
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        System.out.println(lazySingleton1 == lazySingleton2);
        LazyStaticSingleton lazyStaticSingleton1 = LazyStaticSingleton.getInstance();
        LazyStaticSingleton lazyStaticSingleton2 = LazyStaticSingleton.getInstance();
        System.out.println(lazyStaticSingleton1 == lazyStaticSingleton2);
        EnumSingleton enumSingleton1 = EnumSingleton.getInstance();
        EnumSingleton enumSingleton2 = EnumSingleton.getInstance();
        System.out.println(enumSingleton1 == enumSingleton2);
    }
}

package Singleton;

/**
 * @ClassName EnumSingleton
 * @description: 枚举单例
 * @author: mzy
 * @create: 2022-08-09 22:45
 * @Version 1.0
 **/
public class EnumSingleton {

    private EnumSingleton() {
        System.out.println("枚举单例子");
    }

    public static EnumSingleton getInstance() {
        return innerEnum.instance.singleton;
    }


    private enum innerEnum {
        instance;
        private final EnumSingleton singleton;
        innerEnum() {
            singleton = new EnumSingleton();
        }
    }
}

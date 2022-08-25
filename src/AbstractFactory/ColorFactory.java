package AbstractFactory;

/**
 * @ClassName ColorFactory
 * @description: 颜色工厂
 * @author: mzy
 * @create: 2022-08-25 22:51
 * @Version 1.0
 **/
public class ColorFactory extends AbstarctFactory{

    private static ColorFactory singleton = new ColorFactory();
    private ColorFactory() {
        System.out.println("颜色工厂构造完成");
    }
    public static ColorFactory getInstance() {
        return singleton;
    }


    @Override
    public Color getColor(String name) {
        if (name == null || "".equalsIgnoreCase(name)) {
            return null;
        } else if ("red".equalsIgnoreCase(name)) {
            return new Red();
        } else if ("yellow".equalsIgnoreCase(name)) {
            return new Yellow();
        } else if ("green".equalsIgnoreCase(name)) {
            return new Green();
        } else {
            return null;
        }
    }
}

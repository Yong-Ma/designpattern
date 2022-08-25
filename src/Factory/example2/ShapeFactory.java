package Factory.example2;

/**
 * @ClassName ShapeFactory
 * @description: 生产形状类的工厂，工厂为单例
 * @author: mzy
 * @create: 2022-08-25 22:12
 * @Version 1.0
 **/
public class ShapeFactory {
    private static ShapeFactory singleton = new ShapeFactory();
    private ShapeFactory() {
        System.out.println("形状工厂构造完成");
    }
    public static ShapeFactory getInstance() {
        return singleton;
    }

    public Shape getShapeWithName(String name) {
        if (name == null || "".equals(name)) {
            return null;
        } else if ("circle".equalsIgnoreCase(name)) {
            return new Circle();
        } else if ("rectangle".equalsIgnoreCase(name)) {
            return new Rectangle();
        } else if ("square".equalsIgnoreCase(name)) {
            return new Square();
        } else {
            return null;
        }
    }
}

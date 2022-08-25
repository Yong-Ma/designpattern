package AbstractFactory;

import Factory.example2.ShapeFactory;

/**
 * @ClassName FactoryProducer
 * @description: 工厂提供者
 * @author: mzy
 * @create: 2022-08-25 22:57
 * @Version 1.0
 **/
public class FactoryProducer {

    public static AbstarctFactory getFactory(String factoryName) {
        if (factoryName == null || "".equalsIgnoreCase(factoryName)) {
            return null;
        } else if ("shape".equalsIgnoreCase(factoryName)) {
            return ShapeFactory.getInstance();
        } else if ("color".equalsIgnoreCase(factoryName)) {
            return ColorFactory.getInstance();
        } else {
            return null;
        }
    }
}

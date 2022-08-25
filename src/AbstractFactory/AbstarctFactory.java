package AbstractFactory;

import Factory.example2.Shape;

/**
 * @ClassName AbstarctFactory
 * @description: 抽象工厂
 * @author: mzy
 * @create: 2022-08-25 22:48
 * @Version 1.0
 **/
public class AbstarctFactory {

    public Color getColor(String name) {
        throw new RuntimeException();
    }

    public Shape getShape(String name) {
        throw new RuntimeException();
    }
}

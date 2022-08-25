package AbstractFactory;

import Factory.example2.Shape;

/**
 * @ClassName test
 * @description:
 * @author: mzy
 * @create: 2022-08-25 22:56
 * @Version 1.0
 **/
public class test {
    public static void main(String[] args) {
        AbstarctFactory shapeFactory = FactoryProducer.getFactory("shape");
        AbstarctFactory colorFactory = FactoryProducer.getFactory("color");
        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();
        Color red = colorFactory.getColor("red");
        red.fill();
        Color yellow = colorFactory.getColor("yellow");
        yellow.fill();
    }
}

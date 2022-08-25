package Factory.example2;

/**
 * @ClassName Test
 * @description: 测试类
 * @author: mzy
 * @create: 2022-08-25 22:20
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = ShapeFactory.getInstance();
        Shape circle = shapeFactory.getShapeWithName("circle");
        Shape square = shapeFactory.getShapeWithName("square");
        Shape rectangle = shapeFactory.getShapeWithName("rectangle");
        circle.draw();
        square.draw();
        rectangle.draw();
    }
}

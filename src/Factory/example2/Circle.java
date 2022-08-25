package Factory.example2;

/**
 * @ClassName Circle
 * @description: 圆形
 * @author: mzy
 * @create: 2022-08-25 22:10
 * @Version 1.0
 **/
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("圆形");
    }
}

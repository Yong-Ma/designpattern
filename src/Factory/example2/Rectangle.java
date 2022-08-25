package Factory.example2;

/**
 * @ClassName Rectangle
 * @description: 矩形
 * @author: mzy
 * @create: 2022-08-25 22:11
 * @Version 1.0
 **/
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("矩形");
    }
}

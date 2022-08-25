package Factory.example2;

/**
 * @ClassName Square
 * @description: 正方形
 * @author: mzy
 * @create: 2022-08-25 22:09
 * @Version 1.0
 **/
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("正方形");
    }
}

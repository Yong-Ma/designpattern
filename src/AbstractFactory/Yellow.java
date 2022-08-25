package AbstractFactory;

/**
 * @ClassName Yellow
 * @description: 黄色
 * @author: mzy
 * @create: 2022-08-25 22:47
 * @Version 1.0
 **/
public class Yellow implements Color{
    @Override
    public void fill() {
        System.out.println("填充黄色");
    }
}

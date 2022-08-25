package AbstractFactory;

/**
 * @ClassName Red
 * @description: 红色
 * @author: mzy
 * @create: 2022-08-25 22:41
 * @Version 1.0
 **/
public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("填充红色");
    }
}

package AbstractFactory;

/**
 * @ClassName Green
 * @description: 绿色
 * @author: mzy
 * @create: 2022-08-25 22:46
 * @Version 1.0
 **/
public class Green implements Color{
    @Override
    public void fill() {
        System.out.println("填充绿色");
    }
}

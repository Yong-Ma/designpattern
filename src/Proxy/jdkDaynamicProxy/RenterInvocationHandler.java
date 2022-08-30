package Proxy.jdkDaynamicProxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName RenterInvocationHandler
 * @description:
 * @author: mzy
 * @create: 2022-08-30 22:51
 * @Version 1.0
 **/
public class RenterInvocationHandler<T> implements InvocationHandler {

    //被代理类的对象
    private T target;

    public RenterInvocationHandler(T target) {
        this.target = target;
    }

    /**
     * proxy:代表动态代理对象
     * method：代表正在执行的方法
     * args：代表调用目标方法时传入的实参
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行代理方法前");
        Object res = method.invoke(target, args);
        System.out.println("执行代理方法后");
        return res;
    }
}

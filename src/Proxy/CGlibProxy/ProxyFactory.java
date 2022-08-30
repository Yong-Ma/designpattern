package Proxy.CGlibProxy;

import net.sf.cglib.proxy.Enhancer;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


/**
 * @Description:
 * 接口MethodInterceptor为aopalliance-1.0.jar中的类
 * @Author: mzy
 * @Date: 2022/8/30 23:24
 **/
public class ProxyFactory<T> implements MethodInterceptor {

	private T target;

	public ProxyFactory(T target) {
		this.target = target;
	}

	// 创建代理对象
	public Object getProxyInstance() {

		// 1.cglib工具类
		Enhancer en = new Enhancer();
		// 2.设置父类
		en.setSuperclass(this.target.getClass());

		return en.create();
	}

    //拦截方法
//	@Override
//	public Object intercept(Object obj, Method method, Object[] args,
//							MethodProxy methodProxy) throws Throwable {
//		System.out.println("开始事务...");
//
//		// 执行目标对象的方法
//		Object result = method.invoke(target, args);
//
//		System.out.println("提交事务...");
//		return result;
//	}


	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		System.out.println("开始事务...");
		Object res = methodInvocation.proceed();
		System.out.println("提交事务...");
		return res;
	}
}

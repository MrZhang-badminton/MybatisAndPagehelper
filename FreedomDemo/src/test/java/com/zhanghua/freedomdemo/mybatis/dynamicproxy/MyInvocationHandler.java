package com.zhanghua.freedomdemo.mybatis.dynamicproxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {


	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before method " + method.getName());
//		Object result = method.invoke(target, args);
		System.out.println("after method" + method.getName());
		return null;
	}
}

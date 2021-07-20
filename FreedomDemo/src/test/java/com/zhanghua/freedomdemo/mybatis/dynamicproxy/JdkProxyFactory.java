package com.zhanghua.freedomdemo.mybatis.dynamicproxy;

import java.lang.reflect.Proxy;

public class JdkProxyFactory {
	public static Object getProxy(Object target) {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(),
				new MyInvocationHandler(target));
	}
}

package com.zhanghua.freedomdemo.mybatis.dynamicproxy;

import java.lang.reflect.Proxy;

public class JdkProxyFactory {
	public static <T> Object getProxy(Class<T> say) {
		return Proxy.newProxyInstance(say.getClassLoader(),
				new Class[] { say },
				new MyInvocationHandler());
	}
}

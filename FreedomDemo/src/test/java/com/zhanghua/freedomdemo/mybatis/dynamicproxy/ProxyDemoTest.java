package com.zhanghua.freedomdemo.mybatis.dynamicproxy;

import org.junit.Test;

public class ProxyDemoTest {

	@Test
	public void jdkProxy(){
		Say say = (Say) JdkProxyFactory.getProxy(Say.class);
		say.say();
	}
}

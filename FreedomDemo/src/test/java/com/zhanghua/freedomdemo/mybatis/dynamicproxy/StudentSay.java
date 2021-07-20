package com.zhanghua.freedomdemo.mybatis.dynamicproxy;

public class StudentSay implements Say{
	@Override
	public void say() {
		System.out.println("I am a student");
	}
}

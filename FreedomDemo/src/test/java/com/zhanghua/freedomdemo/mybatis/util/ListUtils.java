package com.zhanghua.freedomdemo.mybatis.util;

import java.util.List;

public class ListUtils {

	public static <T> void printList(List<T> userList){
		userList.forEach(System.out::println);
	}
}

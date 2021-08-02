package com.zhanghua.freedomdemo.mybatis.mybatistest;

import com.zhanghua.freedomdemo.mapper.UserMapper;
import com.zhanghua.freedomdemo.model.User;
import com.zhanghua.freedomdemo.mybatis.helper.MybatisHelper;
import com.zhanghua.freedomdemo.mybatis.util.ListUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Classname: SelectTest
 * @Date: 2021/7/25 3:43 下午
 * @Author: zhanghua
 */
public class SelectTest {
	private static UserMapper userMapper;

	static {
		SqlSession sqlSession = MybatisHelper.getSqlSession();
		userMapper = sqlSession.getMapper(UserMapper.class);

	}

	@Test
	public void selectUserList() {

		List<User> userList = userMapper.selectUsers();
		List<User> userList2 = userMapper.selectUsers();
		ListUtils.printList(userList);
	}
}

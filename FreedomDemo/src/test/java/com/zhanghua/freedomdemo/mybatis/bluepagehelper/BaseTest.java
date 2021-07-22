package com.zhanghua.freedomdemo.mybatis.bluepagehelper;

import com.github.pagehelper.PageHelper;
import com.zhanghua.BluePageHelper;
import com.zhanghua.freedomdemo.mapper.UserMapper;
import com.zhanghua.freedomdemo.model.User;
import com.zhanghua.freedomdemo.mybatis.helper.MybatisHelper;
import com.zhanghua.freedomdemo.mybatis.util.ListUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class BaseTest {
	private static UserMapper userMapper;

	static {
		SqlSession sqlSession = MybatisHelper.getSqlSession();
		userMapper = sqlSession.getMapper(UserMapper.class);

	}


	@Test
	public void selectUserListByParams() {
		BluePageHelper.startPage(1,2);
		List<User> userList = userMapper.selectUsersBySex("m");
		ListUtils.printList(userList);
	}
}

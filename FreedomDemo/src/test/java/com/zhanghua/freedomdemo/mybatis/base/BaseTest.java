package com.zhanghua.freedomdemo.mybatis.base;

import com.github.pagehelper.PageHelper;
import com.zhanghua.freedomdemo.mapper.UserMapper;
import com.zhanghua.freedomdemo.model.User;
import com.zhanghua.freedomdemo.mybatis.helper.MybatisHelper;
import com.zhanghua.freedomdemo.mybatis.util.ListUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class BaseTest {

	@Test
	public void selectUserList(){
		SqlSession sqlSession = MybatisHelper.getSqlSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//		PageHelper.startPage(1,1);
		List<User> userList = userMapper.selectUsers();
		ListUtils.printList(userList);
	}

}

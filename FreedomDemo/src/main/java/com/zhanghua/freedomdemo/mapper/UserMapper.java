package com.zhanghua.freedomdemo.mapper;

import com.zhanghua.freedomdemo.model.User;

import java.util.List;

public interface UserMapper {

	public List<User> selectUsers();

	public List<User> selectUsersBySex(String sex);
}

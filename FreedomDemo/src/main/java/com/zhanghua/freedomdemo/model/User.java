package com.zhanghua.freedomdemo.model;

public class User {

	private String id;

	private String loginName;

	private String sex;

	private String name;

	private String password;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User{" +
				"id='" + id + '\'' +
				", loginName='" + loginName + '\'' +
				", sex='" + sex + '\'' +
				", name='" + name + '\'' +
				", password='" + password + '\'' +
				'}';
	}
}

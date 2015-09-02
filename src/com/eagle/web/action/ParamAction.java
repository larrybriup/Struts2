package com.eagle.web.action;

import com.eagle.bean.User;
import com.opensymphony.xwork2.ActionSupport;

public class ParamAction extends ActionSupport {

	private long id;
	private String name;
	private int age;
	private User user;

	@Override
	public String execute() throws Exception {
		System.out.println("in ParamAction.execute");
		if (user != null) {
			System.out.println("id=" + user.getId());
			System.out.println("name=" + user.getName());
			System.out.println("age=" + user.getAge());
		}
		return SUCCESS;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User u) {
		this.user = u;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}

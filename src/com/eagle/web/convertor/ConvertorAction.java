package com.eagle.web.convertor;

import com.eagle.bean.User;
import com.opensymphony.xwork2.ActionSupport;

public class ConvertorAction extends ActionSupport {
	private User user;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("in ConvertorAction");
		if(user!=null){
			System.out.println("id="+user.getId());
			System.out.println("name="+user.getName());
			System.out.println("age="+user.getAge());
		}
		return SUCCESS;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}




}

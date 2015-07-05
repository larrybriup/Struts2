package com.eagle.web.validation;

import com.opensymphony.xwork2.ActionSupport;

public class ValidationAction extends ActionSupport {
	private String username;
	private String password;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub

		return SUCCESS;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

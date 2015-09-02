package com.eagle.web.action;

import com.opensymphony.xwork2.ActionSupport;

public class RedirectAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		System.out.println("in RedirectAction execute()");
		return SUCCESS;
	}
}

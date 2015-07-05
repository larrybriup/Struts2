package com.eagle.web.action;

import com.opensymphony.xwork2.ActionSupport;

public class MethodActionTest extends ActionSupport{

	@Override
	public String execute() throws Exception {
		System.out.println("in MethodActionTest execute()");
		return SUCCESS;
	}
	public String go(){
		System.out.println("in MethodActionTest go()");
		return SUCCESS;
	}
	public String login(){
		System.out.println("in MethodActionTest login()");
		return SUCCESS;
	}
	public String register(){
		System.out.println("in MethodActionTest register()");
		return SUCCESS;
	}

}

package com.eagle.web.action;

import com.opensymphony.xwork2.ActionSupport;

public class ChainAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		System.out.println("in ChainAction execute()");
		return SUCCESS;
	}

}

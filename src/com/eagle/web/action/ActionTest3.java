package com.eagle.web.action;

import com.opensymphony.xwork2.ActionSupport;

public class ActionTest3 extends ActionSupport{

	public ActionTest3() {
		System.out.println("三跑");
	}

	@Override
	public String execute() throws Exception {
		int a=(int)(Math.random()*10);
		return a>5?ERROR:SUCCESS;
	}

}

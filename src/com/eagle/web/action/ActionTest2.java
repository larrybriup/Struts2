package com.eagle.web.action;

import com.opensymphony.xwork2.Action;

public class ActionTest2 implements Action{

	public String execute() throws Exception {
		int a=(int)(Math.random()*10);
		return a>5?ERROR:SUCCESS;
	}

}

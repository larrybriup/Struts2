package com.eagle.web.action;

import com.opensymphony.xwork2.ActionSupport;

public class ActionTest3 extends ActionSupport {

	public ActionTest3() {
		System.out.println("in ActionTest3 三跑");
	}

	@Override
	public String execute() throws Exception {
		System.out.println("in ActionTest3");
		int a = (int) (Math.random() * 10);
		return a > 5 ? ERROR : SUCCESS;
	}

}

package com.eagle.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class valueStackAndActionContext extends ActionSupport {

	private String name;

	@Override
	public String execute() throws Exception {
		System.out.println("in valueStackAndActionContext.execute");
		this.name = "lisi";
		// 获得ActionContext对象
		ActionContext ac = ActionContext.getContext();
		ac.put("戴鑫", "三炮");
		// 获得ValueStack对象
		ValueStack vs = ac.getValueStack();
		String myName = "chinago";
		vs.push(myName);

		return SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

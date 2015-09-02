package com.eagle.web.action;

public class ActionTest1 {

	// to make the struts2 work, we must name the name of the action's method execute
	public String execute() {
		System.out.println("in ActionTest1");
		int a = (int) (Math.random() * 10);
		// if(a>5){
		// return "myError";
		// }
		// return "myFirstAction";
		return a > 5 ? "error" : "success";
	}
}

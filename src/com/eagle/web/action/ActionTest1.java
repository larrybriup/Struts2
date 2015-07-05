package com.eagle.web.action;

public class ActionTest1 {
	public String execute(){
		System.out.println("in ActionTest1");
		int a=(int)(Math.random()*10);
//		if(a>5){
//			return "myError";
//		}
//		return "myFirstAction";
		return a>5?"error":"success";
	}
}

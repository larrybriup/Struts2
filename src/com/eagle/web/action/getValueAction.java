package com.eagle.web.action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.eagle.bean.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class getValueAction extends ActionSupport implements RequestAware,SessionAware,ApplicationAware{
private String name;
private User user;
private Map<String, Object> request;
private Map<String, Object> session;
private Map<String, Object> application;
	@Override
	public String execute() throws Exception {
		name="tom";
		user=new User();
		user.setId(1);
		user.setName("mimi");
		user.setAge(23);
		
		User user2= new User();
		user2.setId(2);
		user2.setName("kitty");
		user2.setAge(20);
		ActionContext ac = ActionContext.getContext();
		ValueStack vs = ac.getValueStack();
		vs.push(user2);
		
		ac.put("user", user2);
		ac.put("msg", "Hello Word!");
		
		request.put("myName", "tom2");
		session.put("myName", "tom3");
		application.put("myName", "tom4");
		
		return SUCCESS;
	}
	public String Ognl() throws Exception {
		name="tom";
		user=new User();
		user.setId(1);
		user.setName("mimi");
		user.setAge(23);
		
		User user2= new User();
		user2.setId(2);
		user2.setName("kitty");
		user2.setAge(20);
		ActionContext ac = ActionContext.getContext();
		ValueStack vs = ac.getValueStack();
		vs.push(user2);
		
		ac.put("user", user2);
		ac.put("msg", "Hello Word!");
		
		request.put("myName", "tom2");
		session.put("myName", "tom3");
		application.put("myName", "tom4");
		
		return SUCCESS;
	}
	public static String myStatic(){
		return "static() method";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setSession(Map<String, Object> session) {
		this.session=session;
		
	}
	public void setRequest(Map<String, Object> request) {
		this.request=request;
		
	}
	public void setApplication(Map<String, Object> application) {
		this.application=application;
		
	}

}

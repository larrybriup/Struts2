package com.eagle.web.action;

import java.util.Arrays;

import com.opensymphony.xwork2.ActionSupport;

public class TagFormAction extends ActionSupport {
	private String username;
	private String password;
	private String gender;
	private String autoLogin;
	private String[] hoppy;
	private String[] city;
	private String dis;
	@Override
	public String execute() throws Exception {
		System.out.println("in execute()");
		System.out.println(username+password+gender);
		System.out.println("autoLogin="+autoLogin);
		System.out.println("hoppy="+Arrays.toString(hoppy));
		System.out.println("city="+Arrays.toString(city));
		System.out.println("dis="+dis);
		return SUCCESS;
	}
	public String register() throws Exception {
		System.out.println("in register()");
		
		
		return SUCCESS;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAutoLogin() {
		return autoLogin;
	}
	public void setAutoLogin(String autoLogin) {
		this.autoLogin = autoLogin;
	}
	public String[] getHoppy() {
		return hoppy;
	}
	public void setHoppy(String[] hoppy) {
		this.hoppy = hoppy;
	}
	public String getDis() {
		return dis;
	}
	public void setDis(String dis) {
		this.dis = dis;
	}
	public String[] getCity() {
		return city;
	}
	public void setCity(String[] city) {
		this.city = city;
	}
	
}

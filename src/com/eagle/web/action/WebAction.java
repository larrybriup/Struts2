package com.eagle.web.action;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.CookiesAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class WebAction extends ActionSupport implements RequestAware,
		SessionAware, ApplicationAware, CookiesAware ,ServletRequestAware{
	private Map<String, Object> request;
	private Map<String, Object> session;
	private Map<String, Object> application;
	private Map<String, Object> cookie;

	@Override
	public String execute() throws Exception {
		// ActionContext ac = ActionContext.getContext();
		// Map<String,Object> request = (Map<String, Object>) ac.get("request");
		//
		// Map<String, Object> session = ac.getSession();
		// Map<String, Object> application = ac.getApplication();
		request.put("yourName", "tom");
		HttpServletRequest request2 = ServletActionContext.getRequest();
		Cookie[] cookies = request2.getCookies();
		HttpServletResponse response = ServletActionContext.getResponse();
		HttpSession session2 = request2.getSession();
		ServletContext application2 = session2.getServletContext();
		ServletContext application3 = ServletActionContext.getServletContext();

		return SUCCESS;
	}

	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;

	}

	public void setApplication(Map<String, Object> application) {
		this.application = application;

	}

	public void setCookiesMap(Map cookie) {
		this.cookie = cookie;

	}

	public void setServletRequest(HttpServletRequest req) {
		
	}

}

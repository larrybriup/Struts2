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
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class WebAction extends ActionSupport implements RequestAware, SessionAware, ApplicationAware,
				CookiesAware, ServletRequestAware, ServletResponseAware,ServletContextAware {

	private Map<String, Object> request;
	private Map<String, Object> session;
	private Map<String, Object> application;
	private Map<String, String> cookiesMap;
	private HttpServletRequest servletRequest;
	private HttpServletResponse servletResponse;
	private ServletContext servletContext;

	@Override
	public String execute() throws Exception {

		ActionContext ac = ActionContext.getContext();

		application = ac.getApplication();
		request = (Map<String, Object>) ac.get("request");
		session = ac.getSession();

		request.put("user.name", "tom");

		servletRequest = ServletActionContext.getRequest();
		HttpSession session2 = servletRequest.getSession();
		servletContext = session2.getServletContext();
		ServletContext servletContext2 = ServletActionContext.getServletContext();
		Cookie[] cookies = servletRequest.getCookies();
		servletResponse = ServletActionContext.getResponse();
		
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

	public void setCookiesMap(Map<String, String> cookiesMap) {
		this.cookiesMap = cookiesMap;
	}

	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;
	}

	public void setServletResponse(HttpServletResponse servletResponse) {
		this.servletResponse = servletResponse;
	}

	
	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}
	
	

}

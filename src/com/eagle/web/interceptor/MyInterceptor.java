package com.eagle.web.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor implements Interceptor {

	public void destroy() {
		System.out.println("in destroy()");
	}

	public void init() {
		System.out.println("in init()");
		
	}

	public String intercept(ActionInvocation ai) throws Exception {
		System.out.println("in interceptor()");
		System.out.println("before");
		//ai.invoke(),调用action里面中将要执行的方法.
		//ai.invoke()的返回值就是action中执行完之后返回的字符串
		String s = ai.invoke();
		
		System.out.println("after");
		
		return s;
	}

}

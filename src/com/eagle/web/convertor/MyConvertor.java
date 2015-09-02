package com.eagle.web.convertor;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.eagle.bean.User;

public class MyConvertor extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map map, String[] str, Class c) {
		// 1:tom:10
		System.out.println("in MyConvertor convertFromString() str.length=" + str.length);
		String s = str[0];
		String[] str2 = s.split(":");
		long id = Long.parseLong(str2[0]);
		String name = str2[1];
		int age = Integer.parseInt(str2[2]);

		User user = new User(id, name, age);

		return user;
	}

	@Override
	public String convertToString(Map map, Object o) {
		return o.toString();
	}

}

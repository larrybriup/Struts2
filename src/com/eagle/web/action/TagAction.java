package com.eagle.web.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.eagle.bean.User;
import com.opensymphony.xwork2.ActionSupport;

public class TagAction extends ActionSupport {

	private List<User> list;
	private Map<Long, User> map;

	@Override
	public String execute() throws Exception {
		list = new ArrayList<User>();
		list.add(new User(1, "tom1", 23));
		list.add(new User(2, "tom2", 24));
		list.add(new User(3, "tom3", 25));

		map = new HashMap<Long, User>();
		map.put(1L, new User(1, "tom1", 23));
		map.put(2L, new User(2, "tom2", 24));
		map.put(3L, new User(3, "tom3", 25));

		return SUCCESS;
	}

	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}

	public Map<Long, User> getMap() {
		return map;
	}

	public void setMap(Map<Long, User> map) {
		this.map = map;
	}

}

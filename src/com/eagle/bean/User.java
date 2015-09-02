package com.eagle.bean;

public class User {

	private long id;
	private String name;
	private int age;

	public User() {
	}

	public User(long id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String say() {
		return "user say hello!";
	}

	public static String myStatic() {
		return "static() method";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

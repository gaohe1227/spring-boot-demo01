package com.model;

public class Studemt {
	private Integer age;// 主键.

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Studemt(Integer age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public Studemt() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;// 测试名称.
}

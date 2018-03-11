package com.yindeyue.entity;

public class Teacher {
	private String name="teacher";
	private Integer age=12;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + "]";
	}

}

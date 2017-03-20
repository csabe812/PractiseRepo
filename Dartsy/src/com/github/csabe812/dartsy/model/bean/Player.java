package com.github.csabe812.dartsy.model.bean;

import java.io.Serializable;

public class Player implements Serializable {

	private static final long serialVersionUID = 6136534622248041601L;

	private int id;
	private String name;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}

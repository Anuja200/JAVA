package com.sample;

public class Student {
	private String name;
	private int id;
	private String section;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public void display() {
		System.out.println("Hello, I am " + name + " My Role Number is "+ id + " My section is "+section);
	}

}

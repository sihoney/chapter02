package com.javaex.ex04;

public class Student extends Person {
	
	private String school;
	
	public Student(String school) {
		this.school = school;
	}
	
	public Student(String name, int age, String school) {
		super(name, age);
		//super.setName(name);
		//super.setAge(age);
		this.school = school;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	public void showInfo() {
		System.out.println("name: "+this.getName()+" age: "+this.getName()+" school: "+school);
	}
}

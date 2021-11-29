package com.javaex.ex04;

public class PersonApp {
	public static void main(String[] agrs) {
		
		Person p1 = new Person("아이유", 30);
		p1.showInfo();
		
		Student s1 = new Student("이효리", 25, "서울대");
		System.out.println(s1.getName());		
		s1.showInfo();
		
		Student s2 = new Student("연세대");
		System.out.println(s2.getSchool());
	}
}

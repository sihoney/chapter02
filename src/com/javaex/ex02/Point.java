package com.javaex.ex02;

public class Point {
	private int x;
	private int y;
	
	public Point() {}
	
	void setX(int x) {
		this.x = x;
	}
	
	void setY(int y) {
		this.y = y;
	}
	
	int getX() {
		return this.x;
	}
	
	int getY() {
		return this.y;
	}
	
	void draw(int a, int b) {
		System.out.println("점[x="+a+", y="+b+"]를 그렸습니다.");
	}
}

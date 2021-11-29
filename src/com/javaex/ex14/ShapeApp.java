package com.javaex.ex14;

public class ShapeApp {
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(10, 20, "pink", "blue");
		r1.draw();
		
		Triangle t1 = new Triangle(20, 30, "black", "orange");
		t1.draw();
	}
}

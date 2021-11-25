package com.javaex.ex02;

public class PointApp {
	public static void main(String[] args) {

		Point p1 = new Point(5, 5);
		Point p2 = new Point(10, 23);

//		p1.setX(5);
//		p1.setY(5);
//		
//		p2.setX(10);
//		p2.setY(23);

		int a = p1.getX();
		int b = p1.getY();

		int c = p2.getX();
		int d = p2.getY();

		p1.draw(a, b);
		p2.draw(c, d);
	}
}

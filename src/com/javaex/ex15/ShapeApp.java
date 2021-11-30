package com.javaex.ex15;

public class ShapeApp {
	public static void main(String[] args) {
		
		Shape r01 = new Rectangle(10, 20, "pink", "blue");
		//r01.draw();
		
		Shape t01 = new Triangle(20, 30, "black", "orange");
		//t01.draw();
		
		Shape c01 = new Circle(10, "pink", "blue");
		//c01.draw();
		
		Shape[] sArray = new Shape[3];
		
		sArray[0] = r01;
		sArray[1] = t01;
		sArray[2] = c01;
		
		for(int i = 0; i < sArray.length; i++) {
			sArray[i].draw();
		}
		
		// down casting
		System.out.println( ((Circle)c01).getR() );
	}
}

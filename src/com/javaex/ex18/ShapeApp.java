package com.javaex.ex18;

public class ShapeApp {
	public static void main(String[] args) {
		
		// UP-CASTING
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
		
		// DOWN-CASTING
		System.out.println( ((Circle)c01).getR() );
		
		System.out.println( ((Rectangle)r01).area() );
		
		// ABSTRACT CLASS & ABSTRACT METHOD 
		for(Shape obj : sArray) {
			System.out.println(obj.area());
		}
		
		// INTERFACE 
		Point p01 = new Point(5, 7);
		p01.draw();
		System.out.println(p01.getX());
		
		Drawable p02 = new Point(114, 117); // down-casting
		p02.draw();
		
		
		Drawable[] dArray = new Drawable[4];
		
		Drawable p1 = new Point(1,1);
		Drawable r1 = new Rectangle(5, 7, "red", "red");
		Drawable c1 = new Circle(12, "blue", "blue");
		Drawable t1 = new Triangle(22, 55, "yellow", "yellow");
		
		dArray[0] = r1;
		dArray[1] = c1;
		dArray[2] = t1;
		dArray[3] = p1;
		
		// 그리기
		for(Drawable d : dArray) {
			d.draw();
		}
		
		// 면적 출력
		for(Drawable d : dArray) {
			if(d instanceof Shape) {
				System.out.println(((Shape)d).area());
			}
		}
	}
}

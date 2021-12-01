package com.javaex.ex18;

public class Triangle extends Shape implements Drawable {
	
	private final int angle = 3;
	
	public Triangle() {
		
	}
	
	public Triangle(int width, int height, String fillColor, String lineColor) {
		super(width, height, fillColor, lineColor);

	}
	
	@Override
	public void draw() {
		System.out.println("[ width: "+this.getWidth()+" height: "+this.getHeight()+" fillColor: "+this.getFillColor()+" lineColor: "+this.getLineColor()+" angle: "+angle+" ] "+this.getClass().getSimpleName()+" 도형을 그렸습니다.");
	}
	
	public double area() {
		double result = getWidth()*getHeight()*0.5;
		return result;
	}
}

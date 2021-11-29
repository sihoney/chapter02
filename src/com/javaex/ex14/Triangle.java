package com.javaex.ex14;

public class Triangle extends Shape {
	
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
}

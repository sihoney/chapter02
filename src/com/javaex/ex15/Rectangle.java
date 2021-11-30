package com.javaex.ex15;

public class Rectangle extends Shape {
	
	private final int angle = 4;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(int width, int height, String fillColor, String lineColor) {
		super(width, height, fillColor, lineColor);
	}
	
	@Override
	public void draw() {
		System.out.println("[ width: "+this.getWidth()+" height: "+this.getHeight()+" fillColor: "+this.getFillColor()+" lineColor: "+this.getLineColor()+" angle: "+angle+" ] "+this.getClass().getSimpleName()+" 도형을 그렸습니다.");
	}
}

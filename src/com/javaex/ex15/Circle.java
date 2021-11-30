package com.javaex.ex15;

public class Circle extends Shape {
	private int r;
	
	public Circle(int r, String lineColor, String fillColor) {
		super(lineColor, fillColor);
		this.r = r;
	}
	
	@Override
	public void draw() {
		System.out.println("[ width: "+this.getWidth()+" height: "+this.getHeight()+" fillColor: "+this.getFillColor()+" lineColor: "+this.getLineColor()+" 반지름: "+r+" ] "+this.getClass().getSimpleName()+" 도형을 그렸습니다.");
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
}

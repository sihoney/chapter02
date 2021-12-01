package com.javaex.ex17;

public abstract class Shape {
	
	private int width; 
	private int height;
	private String fillColor;
	private String lineColor;
	
	public Shape() {
		
	}
	
	public Shape(String lineColor, String fillColor) {
		this.lineColor = lineColor;
		this.fillColor = fillColor;
	}
	
	public Shape(int width, int height, String fillColor, String lineColor) {
		this.width = width;
		this.height = height;
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	public void draw() {
		System.out.println("[ width: "+width+" height: "+height+" ]");
	}
	
	// 추상 메소드
	public abstract double area();
}
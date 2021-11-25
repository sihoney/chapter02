package com.javaex.ex02;

public class MyMath {
	// 필드 필요 X
	private static final double PI = 3.14;
	
	// 생성자 - 디폴트 생성자 사용
	
	// 메소드 g/s -- 필드X
	
	// 메소드 일반
	public static int plus(int a, int b) {
		return a + b;
	}
	public static double plus(double a, double b) {
		return a + b;
	}
	public static double plus(double a, int b) {
		return a + b;
	}
	public static double plus(int a, double b) {
		return a + b;
	}
	public static double circleArea(int radius) {
		return radius*radius*PI;
	}
}

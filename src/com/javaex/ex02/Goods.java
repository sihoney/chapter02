package com.javaex.ex02;

public class Goods {
	private static int totalCount;
	
	private int price;
	private String name;
	
	public Goods () {
		totalCount++;
	}
	
	public Goods(int price, String name) {
		totalCount++;
		
		this.name = name;
		this.price = price;
	}
	
	public static int getTotalCount() {
		return totalCount;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println("name: "+name+" price: "+price);
	}
}

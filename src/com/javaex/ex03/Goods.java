package com.javaex.ex03;

public class Goods {
	private int price;
	private String name;
	
	public Goods() {	
	}
	
	public Goods(String name, int price) {
		this.price = price;
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return "Goods [name: "+name+" price: "+price+" ]";
	}
}

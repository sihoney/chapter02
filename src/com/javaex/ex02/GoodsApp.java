package com.javaex.ex02;

public class GoodsApp {
	public static void main(String[] args) {
		
		Goods g1 = new Goods();
		Goods g2 = new Goods(12, "신발");
		
		g1.setName("피자");
		g1.setPrice(32);
		
		g1.showInfo();
		g2.showInfo();
		
		System.out.println(g1.toString());
		System.out.println(g2.toString());
		
		System.out.println("totlaCount: "+Goods.getTotalCount());
	}
}

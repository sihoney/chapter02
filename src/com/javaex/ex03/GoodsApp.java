package com.javaex.ex03;

public class GoodsApp {
	public static void main(String[] args) {
		Goods[] goodsArray = new Goods[3];
		
		Goods camera = new Goods("니콘", 40000);
		goodsArray[0] = camera;
		
		Goods cup = new Goods("머그컴", 30000);
		goodsArray[1] = cup;
		
		Goods computer = new Goods("컴퓨터", 600000);
		goodsArray[2] = computer;
		
		System.out.println(camera.toString());
		System.out.println(goodsArray[1].toString());
		System.out.println();
		
//		for(Goods item : goodsArray) {
//			System.out.println(item.toString());
//		}
//		System.out.println();
//
//		for(int i = 0; i < goodsArray.length; i++) {
//			System.out.println(goodsArray[i]);
//		}
		
		int cnt = 0;
		for(int i = 0; i < goodsArray.length; i++) {
			if(goodsArray[i] != null ) {
				System.out.println(goodsArray[i]);
				cnt++;	
			}
		}
		
		System.out.println(cnt);
		
		// 이름만 출력하기
		for(int i = 0; i < goodsArray.length; i++) {
			System.out.println(goodsArray[i].getName());
		}
	}
}

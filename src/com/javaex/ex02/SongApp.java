package com.javaex.ex02;

public class SongApp {
	public static void main(String[] args) {
		
		Song s1 = new Song();
		Song s2 = new Song();
		
		s1.setInfo(
				"Best Part", 
				"Day6", 
				"The Book Of Us: GRAVITY", 
				2019, 
				"Matthew Burnett", 
				6
		);
		
		s2.setInfo(
				"좋은걸 뭐 어떡해", 
				"Day6", 
				"Every Day6 August", 
				2017, 
				"Ji-Sang Hong", 
				1
		);
		
		s1.showInfo(
				s1.getInfo("artist"), 
				s1.getInfo("title"), 
				s1.getInfo("album"), 
				s1.getInfo("year"), 
				s1.getInfo("track"), 
				s1.getInfo("composer")
		);
		
		s2.showInfo(
				s2.getInfo("artist"), 
				s2.getInfo("title"), 
				s2.getInfo("album"), 
				s2.getInfo("year"), 
				s2.getInfo("track"), 
				s2.getInfo("composer")
		);
		

	}
}

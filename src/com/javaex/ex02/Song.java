package com.javaex.ex02;

public class Song {
	
	private String title;
	private String artist;
	private String album;
	private int year;
	private String composer;
	private int track;
	
	public Song(String ti, String ar, String al, int y, String c, int tr) {
		this.title = ti;
		this.artist = ar;
		this.album = al;
		this.year = y;
		this.composer = c;
		this.track = tr;
	}
	
	void setInfo(String ti, String ar, String al, int y, String c, int tr) {
		this.title = ti;
		this.artist = ar;
		this.album = al;
		this.year = y;
		this.composer = c;
		this.track = tr;
	}
	
	String getInfo(String a) {
		String result = "";
		
		if(a.equals("title")) {
			result = this.title;
		} else if(a.equals("artist")) {
			result =  this.artist;
		} else if(a.equals("album")) {
			result = this.album;
		} else if(a.equals("year")) {
			result = Integer.toString(this.year);
		} else if(a.equals("composer")) {
			result = this.composer;
		} else if(a.equals("track")) {
			result = Integer.toString(this.track);
		}
		return result;
	}
	
	void showInfo(String a, String b, String c, String d, String e, String f) {
		System.out.println(a+", "+b+" ("+c+", "+d+", "+e+"번 track, "+f+" 작곡 )");
	}
}

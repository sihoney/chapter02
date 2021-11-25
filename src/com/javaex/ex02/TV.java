package com.javaex.ex02;

public class TV {
		
	private int channel;
	private int volume;
	private boolean power;
	
	public TV (int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public int getChannel() {
		System.out.println("channel: "+channel);
		return channel;
	}
	
	public int getVolume() {
		System.out.println("channel: "+volume);
		return volume;
	}
	
	public void power(boolean on) {
		this.power = on;
	}
	
	public void channel(int channel) {
		if(channel > 0 && channel <= 255) {
			this.channel = channel;				
		} else {
			System.out.println("채널 번호를 초과");
		}
	}

	public void channel(boolean up) {

		if(up) {
			if(channel == 255) {
				System.out.println("채널 값 범위 이탈");
			} else {
				channel++;					
			}
			
		} else {
			if(channel == 1) {
				System.out.println("채널 값 범위 이탈");
			} else {
				channel--;
			}
		}
		
	}
	
	public void volume(int volume) {
		if(volume >= 0 && volume <= 100) {
			this.volume = volume;		
		} else {
			System.out.println("볼륨 값 범위 이탈");
		}
	}
	
	public void volume(boolean up) {
		if(up) {
			if(volume == 100) {
				System.out.println("볼퓸 값 범위 이탈");
			} else {
				this.volume++;
			}					
		} else {
			if(volume == 0) {
				System.out.println("볼퓸 값 범위 이탈");
			} else {
				this.volume--;	
			}
		}
		
	}
	
	public void status() {
		System.out.println("[ power: "+power+", channel: "+channel+", volume: "+volume+" ]");
	}

}

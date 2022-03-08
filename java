package com.javaExoop;

public class tv {
	private int channel;
	private int volume;
	private boolean power;

	public Tv(int i, int j, boolean b) {	
		
	}

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}

	public TV(int channel, int volume, boolean power) {
	 this.channel = channel;
	 this.volume = volume;
	 this.power = power;
	}

	public tv() {
		super();
	}

	public void power(boolean on) {
		this.power = on;
	}

	public void channel(int channel) {
		if(channel >= 1 && channel <= 256) {
			this.channel = channel;
		}else {
			System.out.println("채널 선택 오류");
		}
	}

	public void channel(boolean on) {
		if (on == true) {
			this.channel++;
		}else {
			this.channel = channel;
		}
	}

	public void volume(int volume) {
			if(volume >= 0 && volume <= 100) {
				this.volume = volume;
			}else if(volume <0) {
				this.volume = volume;
			}
	}

	public void volume(boolean up) {
			if (up == true) {
				this.volume++;
			}else {
				this.volume = channel;
			}
	}

	public void status() {
		String power = "";
		if (this.isPower()) {
			power = "On";
		}else {
			power = "Off";
		}
		System.out.println("=======TV 상태========");
		System.out.println("전원:" + power);
		System.out.println("=======TV 상태========");
		System.out.println("=======TV 상태========");
	}


	}

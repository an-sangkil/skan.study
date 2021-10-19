package com.desigin.pattern.listener.test2;

public class Bclass implements Runnable {

	private Listener listener;
	private int i = 0;

	Bclass(Listener l) {
		this.listener = l;
		this.listener.startListener("리스너가 시작 되었습니다.");
	}

	public void run() {
		while (true) {
			this.i++;
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
			this.listener.runListener(i + "--");
		}
	}

}
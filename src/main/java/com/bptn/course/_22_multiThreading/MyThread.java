package com.bptn.course._22_multiThreading;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread using Thread class: " + i);
			try {
				Thread.sleep(500); // Pause for 500 milliseconds
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

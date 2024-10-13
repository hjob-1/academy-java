package com.bptn.course._22_multiThreading;

public class MyRunnable implements Runnable {
	private String threadName;

	// Constructor to assign a name to each thread
	public MyRunnable(String name) {
		this.threadName = name;
	}

	// Override the run() method to define the task for the thread
	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			System.out.println(Thread.currentThread().getName() + " is running: " + i);
			try {
				Thread.sleep(500); // Pause for 500 milliseconds
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + " has completed its task.");
	}

}

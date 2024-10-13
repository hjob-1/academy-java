package com.bptn.course._22_multiThreading;

public class MultiThreading {
	public static void main(String[] args) {

//		MyThread t1 = new MyThread();
//		t1.start(); // This will invoke the run() method in a new thread

		// Additional logic in the main thread
//		for (int i = 1; i <= 5; i++) {
//			System.out.println("Main thread: " + i);
//			try {
//				Thread.sleep(700); // Pause for 700 milliseconds
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}

// Runnable Interface

		// Step 2: Create a Runnable object (task)
		MyRunnable task = new MyRunnable("Task Thread");

		// Step 3: Create multiple Thread objects, passing the same Runnable object
		Thread t1 = new Thread(task, "Thread-1");
		Thread t2 = new Thread(task, "Thread-2");

		// Step 4: Start the threads
		t1.setPriority(10);
		t1.start();
		t2.start();

	}

}

package com.basicjava.threds;

//DeadLock

public class DeadLockEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String resource1 ="Samuel";
		final String resource2 ="Ebenezer";
		
		Thread t1 = new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread1 - locks resource1");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					synchronized (resource2) {
						System.out.println("Thread1 - locks resource2");
					}
				}
			}
			
		};
		
		Thread t2 = new Thread() {
			public void run() {
				synchronized(resource2) {
					System.out.println("Thread2 - locks resource2");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					synchronized(resource1) {
						System.out.println("Thread2 - locks resource1");
					}
				}
			}
			
		};
		
		
		System.out.println("Execution Over");
		t1.start();
		t2.start();

	}

}

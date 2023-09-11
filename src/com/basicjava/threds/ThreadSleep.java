package com.basicjava.threds;

class Thread1 extends Thread {
	
	@Override
	public void run() {		
		for(int i =0;i < 10;i++) {
			
			System.out.println("Thread1 going to sleep");
			
		
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
			System.out.println("Thread1 wake up now");
		}		
	}
}

class Thread2 extends Thread {
	
	@Override
	public void run() {		
		for(int i =0;i <10;i++) {
			
			System.out.println("Thread2 going to sleep");
			
		
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
			System.out.println("Thread2 wake up now");
		}		
	}
}

public class ThreadSleep extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		t1.start();
		t2.start();
		
		

	}

}

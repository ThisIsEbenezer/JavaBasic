package com.basicjava.threds;

class NumbericThread extends Thread{
	public static int counter =0;
	
	@Override
	public void run() {		
		for(int i =0;i <10;i++) {
			counter = counter +1;
			System.out.println(counter);			
		}		
	}
}

class AlpabetThread extends Thread{
	public static char character = 'A';
	
	@Override
	public void run() {		
		for(int i =0;i < 26;i++) {
			System.out.println(character);
			character = (char) (character+1);
		}		
	}
	
}

public class ThreadClassMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumbericThread nThread = new NumbericThread();
		AlpabetThread aThread = new AlpabetThread();
		
		nThread.start();
		aThread.start();
		
		System.out.println("nThread" + nThread.getState());
		System.out.println("aThread" + aThread.getState());
		
//		System.out.println("nThread" + nThread.getPriority());
//		System.out.println("aThread" + aThread.getPriority());
		
		System.out.println("nThread" + nThread.getName());
		System.out.println("aThread" + aThread.getName());
		
		System.out.println("Current Thread" + Thread.currentThread().getName());
		
		System.out.println("nThread" + nThread.getState());
		System.out.println("aThread" + aThread.getState());
		System.out.println("Current Thread" + Thread.currentThread().getState());
		
		if (nThread.isAlive()) {
			System.out.println("nThread alive" );
		} else {
			System.out.println("nThread not alive" );
		}
		
		if (aThread.isAlive()) {
			System.out.println("aThread alive" );
		} else {
			System.out.println("aThread not alive" );
		}
		
		

	}

}

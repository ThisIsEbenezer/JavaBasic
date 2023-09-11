package com.basicjava.threds;

//ExampleForMultiTheadingBasic
class ThreadJoin1 extends Thread {	
	@Override
	public void run() {		
		for(int i =0;i < 10;i++) {			
			System.out.println("Thread1="+i);
		}		
	}
}

class ThreadJoin2 extends Thread {	
	@Override
	public void run() {		
		for(int i =0;i < 10;i++) {			
			System.out.println("Thread2="+i);
		}		
	}
}

class ThreadJoin3 extends Thread {	
	@Override
	public void run() {		
		for(int i =0;i < 10;i++) {			
			System.out.println("Thread3="+i);
		}		
	}
}
public class ThreadJoin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadJoin1 t1 = new ThreadJoin1();
		ThreadJoin2 t2 = new ThreadJoin2();
		ThreadJoin3 t3 = new ThreadJoin3();
		
		t1.start();
		t1.join();
		t2.start();
		t3.start();

	}

}

package com.basicjava.threds;

//ExampleForMultiTheadingIntermiate

class SnycMethodTable {
	public synchronized void displayTable(int tableNo) throws InterruptedException {
		System.out.println("Printing strats..");
		for (int i =0 ;i < 5;i++) {
			System.out.println(tableNo+"*"+i+"="+ tableNo*i);
			Thread.sleep(500);
		}
		System.out.println("Print Done for "+tableNo);
	}
	
}

class SyncMethodThread1 extends Thread {
	SnycMethodTable table;
	
	public SyncMethodThread1 (SnycMethodTable table) {
		this.table = table;
	}
	
	@Override
	public void run() {		
		try {
			table.displayTable(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

class SyncMethodThread2 extends Thread {
	SnycMethodTable table;
	
	public SyncMethodThread2 (SnycMethodTable table) {
		this.table = table;
	}
	
	@Override
	public void run() {		
		try {
			table.displayTable(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}


public class MethodSnynchonization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SnycMethodTable table = new SnycMethodTable();
		
		SyncMethodThread1 t1= new SyncMethodThread1(table);
		SyncMethodThread2 t2= new SyncMethodThread2(table);
		
		t1.start();
		t2.start();

	}

}

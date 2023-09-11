package com.basicjava.threds;


class SampleThread implements Runnable {
	@Override
	public void run() {
		try {
			
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
public class ThreadGroupEx {
	public static void main(String[] args) {
		SampleThread sampleThread = new SampleThread();
		
		ThreadGroup projectX = new ThreadGroup("Project X");		
		ThreadGroup uiTeam = new ThreadGroup(projectX,"Project X - UI Team");
		ThreadGroup apiTeam = new ThreadGroup(projectX,"Project X - API Team");
		
		Thread t1 = new Thread(projectX,sampleThread,"Project X - Manager");
		Thread t2 = new Thread(uiTeam,sampleThread,"uiTeam1");
		Thread t3 = new Thread(uiTeam,sampleThread,"uiTeam2");
		Thread t4 = new Thread(uiTeam,sampleThread,"uiTeam3");
		Thread t5 = new Thread(apiTeam,sampleThread,"apiTeam1");
		Thread t6 = new Thread(apiTeam,sampleThread,"apiTeam2");
		Thread t7 = new Thread(apiTeam,sampleThread,"apiTeam3");
		Thread t8 = new Thread(apiTeam,sampleThread,"apiTeam4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		
		
		System.out.println("Thread  Project X="+projectX.activeCount());
		System.out.println("Thread  UI="+uiTeam.activeCount());
		System.out.println("Thread  API="+apiTeam.activeCount());
		
		System.out.println("Thread G Project X="+projectX.activeGroupCount());
		System.out.println("Thread  G UI="+uiTeam.activeGroupCount());
		System.out.println("Thread  G API="+apiTeam.activeGroupCount());
		
		System.out.println("Thread N Project X="+projectX.getName());
		System.out.println("Thread  N UI="+uiTeam.getName());
		System.out.println("Thread  N API="+apiTeam.getName());
		
		
		
		
		
	}
	

}

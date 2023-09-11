package com.basicjava.oops;

public class DeadLockDemo {
	
		
		public static void method1() { 
			synchronized (String.class)  { 
				System.out.println("Aquired lock on String.class object"); 
				
				synchronized (Integer.class) { 
					System.out.println("Aquired lock on Integer.class object"); 
					} 
				} 
			} 
		 
		
		
		public static void method2() { 
			synchronized (Integer.class) { 
				System.out.println("Aquired lock on Integer.class object"); 
				synchronized (String.class) { 
					System.out.println("Aquired lock on String.class object"); 
					} 
				}
		}
		
		public static void main(String[] args) {
			 method1();
			 method2();
		}

		
	

}

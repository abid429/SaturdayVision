package com.upskill.java_7;

public class MultiThreading {
/* Multithreading is a Java feature that allows concurrent execution of two or more parts of a program.
	
	Threads can be created by using two mechanisms : 

		1. Extending the Thread class 
		2. Implementing the Runnable Interface */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=55;
     for (int i=0; i<n; i++){
    	 MultiThreadingThread obj = new MultiThreadingThread();
   obj.start();
   Thread obj2= new Thread(new MultiThreadingRunable());
     }
	}

}

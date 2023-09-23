package com.upskill.java_7;

public class MultiThreadingThread extends Thread {
	public void run(){
		try{ 
			System.out.println("Thread number #"+ Thread.currentThread().getId()+ "is runnging");
			
		} catch (Exception e){
			System.out.println("Exception is caught ");
		}
	}

}

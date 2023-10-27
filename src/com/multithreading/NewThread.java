package com.multithreading;

public class NewThread extends Thread {
	public void run()
	{
		System.out.println("This thead is running.");
	}

	public static void main(String[] args) {
		NewThread mt = new  NewThread();
		mt.start();



	}

}
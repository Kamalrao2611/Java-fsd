package com.multithreading;

public class SyncDemo {

	public static void main(String[] args) {
		Sender send = new Sender(); 
        ThreadedSend S1 = new ThreadedSend("Good morning " , send ); 
        ThreadedSend S2 = new ThreadedSend("Good evening " , send ); 
        S1.start(); 
        S2.start(); 
        try
        { 
            S1.join(); 
            S2.join(); 
        } 
        catch(Exception e) 
        { 
            System.out.println("Interrupted"); 
        } 


	}

}
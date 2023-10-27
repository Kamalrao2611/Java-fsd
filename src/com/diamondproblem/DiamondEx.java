package com.diamondproblem;

public class DiamondEx implements FirstInterface, SecondInterface {
	 public void display() {
	        
	        FirstInterface.super.display();
	        SecondInterface.super.display();
	    }
	public static void main(String[] args) {
		DiamondEx diamondObj = new DiamondEx();
		diamondObj.display();
		
	}

}
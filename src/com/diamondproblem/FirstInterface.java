package com.diamondproblem;

public interface FirstInterface {
	default void display() {
		System.out.println("This method is from First Interface");
	}
}
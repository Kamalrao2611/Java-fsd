package com.exceptionhandling;

public class AgeValidator {

	public void ageValidation(int age) throws InvalidAgeException {
		if(age>=18) {
			System.out.println(StringConstantPool.OUTPUT_SUCCESS);
		}
		else {
			
			throw new InvalidAgeException(StringConstantPool.FAILED);
		}
	}
	
}
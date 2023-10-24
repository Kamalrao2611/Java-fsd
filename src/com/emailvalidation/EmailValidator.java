package com.emailvalidation;

public class EmailValidator {
	
	
	public boolean searchEmail(String emailToSearch, String[] emailArr) {
		for (String email : emailArr) {
			if (emailToSearch.equals(email)) {
				return true;
			}
		}
		return false;

	}

}
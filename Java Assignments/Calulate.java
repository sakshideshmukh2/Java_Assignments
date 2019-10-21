package com.training.myapp;

import com.training.myapp.exception.InvalidException;

public class Calculate {

	public static int add(int i, int j) {
		
		return i+j;
	}

	public static int subtract(int i, int j) {
		
		return i-j;
	}

	public static int divison(int i, int j) throws InvalidException {
		
		
		if(j>=1)
		return i/j;
		else
			throw new InvalidException("Enter any number except 0");
	}

}

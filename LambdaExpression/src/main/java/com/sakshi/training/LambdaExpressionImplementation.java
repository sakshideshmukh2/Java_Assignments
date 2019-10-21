package com.sakshi.training;

public class LambdaExpressionImplementation  {
	
	public static void main(String args[])
	{
		
		LambdaExpression multiplication = (a,b) -> a * b;
		LambdaExpression addition = (a,b) -> a + b;
		LambdaExpression division = (a,b) -> a / b;
		LambdaExpression subtraction = (a,b) -> a - b;
		LambdaExpression modulus = (a,b) -> a % b;

		
		System.out.println(multiplication.calculate(9, 12));
		System.out.println(addition.calculate(9, 12));
		System.out.println(division.calculate(90, 3));
		System.out.println(subtraction.calculate(9, 12));
		System.out.println(modulus.calculate(90, 4));

	}


}

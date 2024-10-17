package com.in28minutes.junit;

public class MyMath {
	
	// [1, 2, 3] - have an array and we want to return the sum of it. 1+2+3 = 6. Write unit test for this method.
	public int calculateSum(int[] numbers) {
		
		int sum = 0;
		
		for(int number : numbers) {
			sum += number;
		}
		
		return sum;
	}

}

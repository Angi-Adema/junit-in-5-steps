package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

	@Test
	void test() {
		//Absence of failure is success.
		//fail("Not yet implemented");   This is an ascertion statement. Running this test with this line will cause it to fail. Delete this line and implement your actual test as we want 'pass'.
		// In the test you write several test conditions or asserts checking for specific behavior.
		
		//First create a new instance of the class being tested.
		int[] numbers = {1, 2, 3};
		MyMath math = new MyMath();
		int result = math.calculateSum(numbers);
		
		//See if the result is happening as expected.
		System.out.println(result);
		
		//Check the result against the expected value.
		int expectedResult = 5;
		assertEquals(expectedResult, result);
	}

}

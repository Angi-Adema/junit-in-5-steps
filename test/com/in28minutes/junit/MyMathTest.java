package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {
	
	//There is a lot of duplication in copying and pasting the same test so lets pull out some of this to make it more DRY.
	private MyMath math = new MyMath();

	@Test
	//Rename the test to a meaningful name for the test and the project.
	//void test() {
	void calculateSum_ThreeMemberArray() {
		//Absence of failure is success.
		//fail("Not yet implemented");   This is an ascertion statement. Running this test with this line will cause it to fail. Delete this line and implement your actual test as we want 'pass'.
		// In the test you write several test conditions or asserts checking for specific behavior.
		
		//First create a new instance of the class being tested.
		//MyMath math = new MyMath();
		
		//We can actually put the array of numbers inline. Right click numbers, click Refactor, select Inline. This changes the int result to include the array passed in instead of just numbers.
		//int[] numbers = {1, 2, 3};
		
		//We can also put this line of code inline of assertEquals.
		//int result = math.calculateSum(new int[] {1,2,3});
		
		//See if the result is happening as expected.
		//System.out.println(result);
		
		//Check the result against the expected value. We can refactor this to inline as well.
		//int expectedResult = 6;
		
		//Action is on the right hand side and expected is on the left.
		assertEquals(6, math.calculateSum(new int[] {1,2,3}));
	}
	
	//Write a new test for an empty array to check that the sum of it is zero. ({} => 0)
	//@Test
	//void test1() {
		
		//int[] numbers = {};
		
		//MyMath math = new MyMath();
		
		//int result = math.calculateSum(numbers);
		
		//See if the result is happening as expected.
		//System.out.println(result);
		
		//Check the result against the expected value.
		//int expectedResult = 0;
		//assertEquals(expectedResult, result);
	//}
	
	//Refactor the zero length array to match the above first test.
	@Test
	void calculateSum_ZeroLengthArray() {
		assertEquals(0, math.calculateSum(new int[] {}));
	}

}

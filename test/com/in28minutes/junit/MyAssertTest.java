package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyAssertTest {

	List<String> todos = Arrays.asList("AWS", "Azure", "DevOps");
	
	@Test
	void test() {
		boolean test = todos.contains("AWS");  //Result
		boolean test2 = todos.contains("Java");
		
		//Type CTRL + Space to see all the assertEquals methods that can be used.
		//When testing booleans, we can do a couple of ways as shown below.
		//assertEquals(true, test);   //Check if a specific value is within the array.
		assertTrue(test);   //A string message can be inserted as the first parameter passed in, use for error message for example if test fails.
		assertFalse(test2);   //Check if something is false.
		//Also have methods for: assertNull, assertNotNull, etc.
		
		//Can pass in arrays to compare them. Left is the expected array and the right is the array from your method. Compares length as well as values.
		assertArrayEquals(new int[] {1,2}, new int[] {1,2});
		
		assertEquals(3, todos.size());   //Confirm the size of the array. If hit CTRL + Space, we see that a third parameter can be entered to enter a message i.e. error message.
		
		//fail("Not yet implemented");
	}

}

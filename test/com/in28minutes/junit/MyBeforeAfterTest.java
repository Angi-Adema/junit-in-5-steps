package com.in28minutes.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyBeforeAfterTest {

	//JUnit does not guarantee the order of the tests run. It will run in any order randomly.
	
	//Need to run a common method before all the tests. Has to be static because we are wanting to run this before all the tests.
	@BeforeAll
	static void beforeAll() {
		System.out.println("BeforeAll");
	}
	
	//@BeforeEach causes this method to run before each test (set up before each test). Use if you need something to happen before a test is run.
	@BeforeEach
	void beforeEach() {
		System.out.println("BeforeEach");
	}
	
	@Test
	void test1() {
		//fail("Not yet implemented");
		System.out.println("test1");
	}
	
	@Test
	void test2() {
		System.out.println("test2");
	}
	
	@Test
	void test3() {
		System.out.println("test3");
	}
	
	//Runs after each test (clean up after each test). Use if you need something to happen after each test is run.
	@AfterEach
	void afterEach() {
		System.out.println("AfterEach");
	}
	
	//Has to be static as well to be sure it runs after all tests have been run.
	@AfterAll
	static void afterAll() {
		System.out.println("AfterAll");
	}

}

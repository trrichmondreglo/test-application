package app;

import dto.TestObject;

public class ApplicationTestMain {
	
	/*
	 * Test Application Comment
	 * For push purpose only
	 */
	public static void main(String[] args) {
		TestObject testObj = new TestObject();
		testObj.setId(1);
		testObj.setName("TEST");
		System.out.println(testObj.getId() + " " + testObj.getName());
	}
}

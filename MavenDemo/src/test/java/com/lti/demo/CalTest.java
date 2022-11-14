package com.lti.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalTest {
	Calculator c = new Calculator();
	@Test
	public void testsayHello() {
		Assertions.assertEquals("hello", c.sayHello());

	}
    @Disabled
	@Test
	public void testAdd() {
        Assertions.assertEquals(100,c.add(60,40));
    }
	
	@Test
	void testAssertFalse() {
		 Assertions.assertTrue("meenal",length()==6);
		 Assertions.assertFalse("meenal",length()==10);
         Assertions.assertNotEquals("Hello","Hello");
    }
	
	
	
	

}

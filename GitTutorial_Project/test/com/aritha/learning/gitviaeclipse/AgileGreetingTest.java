package com.aritha.learning.gitviaeclipse;

import static org.junit.Assert.*;

import org.junit.Test;

public class AgileGreetingTest {

	@Test
	public void should_initialize_greeting_message_while_constructing() {
		String expectedMessage = "Hello Agile World!";
		
		AgileGreeting agileGreeting = new AgileGreeting(expectedMessage);
		
		String actualMessage = agileGreeting.getMessage();
		assertSame("Greeting message should read as Hello Agile World!", 
				expectedMessage, actualMessage);
	}

}

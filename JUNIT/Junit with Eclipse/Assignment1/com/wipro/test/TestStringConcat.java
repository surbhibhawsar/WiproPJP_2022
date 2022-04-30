package com.wipro.test;
import com.wipro.task.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class TestStringConcat {

	@Test
	void doStringConcat() {
		DailyTasks dlTasks = new DailyTasks();
		assertEquals("Result", "Hello World", dlTasks.doStringConcat("Hello", "World"));
	}

}

package com.wipro.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.wipro.task.DailyTasks;

class TestCheckPresence {

	@Test
	void checkPresence() {
		DailyTasks dlTasks = new DailyTasks();
		assertEquals("Result", true, dlTasks.checkPresence("Hello", "o"));
	}

}

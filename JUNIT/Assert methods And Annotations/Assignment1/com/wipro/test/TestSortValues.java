package com.wipro.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.wipro.task.DailyTasks;

class TestSortValues {

	@Test
	public void assertArrayEqual() {
		DailyTasks dl = new DailyTasks();
		int expected[]=new int[] {1,2,3,4,5};
		assertArrayEquals(expected,dl.sortValues(new int[] {3,1,4,2,5}));
}

}
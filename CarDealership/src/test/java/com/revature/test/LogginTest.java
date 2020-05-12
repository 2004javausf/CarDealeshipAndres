package com.revature.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.revature.users.LogInEmployee;

class LogginTest {

	@Test
	void test() {
		LogInEmployee t = new LogInEmployee();
		String test = t.LogInMethod();
		Assert.assertEquals(test, true);
	}
	//fail("Not yet implemented");

}

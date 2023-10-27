package com.neotech.steps;

import com.neotech.testbase.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void start() throws InterruptedException {
		BaseClass.setUp();
	}

	@After
	public void end() {
		BaseClass.tearDown();
	}
}

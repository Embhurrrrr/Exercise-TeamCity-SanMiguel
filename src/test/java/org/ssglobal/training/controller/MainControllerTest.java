package org.ssglobal.training.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainControllerTest {

	@Test
	public void greeting() {
		MainController mc = new MainController();
		assertEquals("Helloooo", mc.greetings());
	}
}

package com.nana.devops.jenkins;

import static org.junit.Assert.*;

import org.testng.annotations.Test;

//import org.junit.Test;

import com.nanas.devops.jenkins.JenkinsCalculatr;

public class jenkinsClassTest {

	@Test
	public void addTest() {
		JenkinsCalculatr calc = new JenkinsCalculatr();
		assertEquals(10, calc.addNum(5, 5));
	}
	@Test
	public void subTest() {
		JenkinsCalculatr calc = new JenkinsCalculatr();
		assertEquals(0, calc.subNum(5,5));
	}
}

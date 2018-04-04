package com.google.tests;

import org.testng.annotations.Test;

public class SampleTest {

	@Test
	public void testSample()
	{
		String browser=System.getProperty("browser");
		String url=System.getProperty("url");
		System.out.println(browser);
		System.out.println(url);
	}
}

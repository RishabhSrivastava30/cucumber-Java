package io.cucumber.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeTest;
//import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty", "html:target/cucumber", "json:target/cucumber/cucumber.json" }, 
		tags = { "@Regression"},
		features = {"src/test/resources"},
        glue = {"classpath:io.cucumber.test.step.ui"}
		)
public class TestRunner {
	
/*	@BeforeClass()
	public static void setup()
	{
		System.out.println("inside setup method");
	}
	
	@BeforeTest()
	public void setup1()
	{
		System.out.println("inside setup1 Beftst method");
	}*/
}

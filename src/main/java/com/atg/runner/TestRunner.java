package com.atg.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/main/java/com/atg/features",
		glue = {"com.atg.stepDefinitions"},
		plugin = {"pretty","html:target/site/cucumber-pretty","json:target/cucumber.json"},
		dryRun = false, monochrome = true, tags = {"@race"}) 


public class TestRunner extends AbstractTestNGCucumberTests  {

}

package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reporting.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

/**
 * 
 * @author Neriyarasan
 * 
 * @category TestRunner Class
 * 
 * @category Generate JVM Reports
 * 
 *
 */

@RunWith(Cucumber.class)
@CucumberOptions(dryRun=false,snippets= SnippetType.CAMELCASE,stepNotifications=true,plugin= {"pretty","json:target\\Output.json"}, features= "src\\test\\resources\\Features",glue= "com.stepdefinition")

public class TestRunnerClass {
	
	@AfterClass
	public static void afterClass() {
		 Reporting.generateJvmReport(System.getProperty("user.dir")+"\\target\\Output.json");

}
}
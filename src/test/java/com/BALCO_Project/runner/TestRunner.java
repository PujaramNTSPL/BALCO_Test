package com.BALCO_Project.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

features = "src/test/resources/Feature",
glue = "com.BALCO_Project.stepDefinitions",
plugin = {"pretty","html:target/cucumber-report.html"},
monochrome = true

)

public class TestRunner extends AbstractTestNGCucumberTests {

}
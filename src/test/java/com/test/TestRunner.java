package com.test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/admin/eclipse-workspace/FinalProject/Features/TutorialsNinja.feature",
//features = "/Users/admin/eclipse-workspace/FinalProject/Features/login.feature"
                 glue = "stepDefinition",
                 plugin = {"pretty", "html:target/cucumber-reports.html"},
                 dryRun = false,
                 monochrome=true,
                 tags="@LoginTest"
                 )
public class TestRunner {
}
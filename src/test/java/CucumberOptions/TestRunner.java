package CucumberOptions;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)  // This line used only if this class executed by rightclick and clickjunit
@CucumberOptions(features="src/test/java/Feature", glue="StepDefinition",monochrome = true ,stepNotifications = true,plugin={"html:target/cucumber-html-report.html"},tags="@smoke")//plugin added to get html reports in target folder
public class TestRunner { //while running from testng file use this extends AbstractTestNGCucumberTests



}

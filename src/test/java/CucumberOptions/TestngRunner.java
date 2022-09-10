package CucumberOptions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Feature", glue="StepDefinition",monochrome = true ,tags="@smoke")

public class TestngRunner extends  AbstractTestNGCucumberTests{
	
	

}

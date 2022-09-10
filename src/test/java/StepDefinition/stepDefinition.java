package StepDefinition;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import net.jodah.failsafe.internal.util.Assert;


//@RunWith(Cucumber.class)
public class stepDefinition{
	
	@Before("@smoke")// only @smoke tag scenario will execute this before method
	public void setup()
	{
		System.out.println("code for setup browser or loogin can be used here");
	}
	

    @Given("^Initialize browser$")
    public void initialize_browser()  {
       System.out.println("step2");
    }

    @When("^user enters krishnaV9 and Kveni@123$") //direct static value assigned like this from feature file
    public void user_enters_krishnav9_and_kveni123()  {
    	 System.out.println("step3");
    }

    @And("^Navigate to \"([^\"]*)\"site$")  //this is parameterization , anything inside double quotes(dynamic data) in feature file is assigned here
    public void navigate_to_somethingsite(String strArg1) { //that parameter comes here as string value
    	 System.out.println(strArg1); 
    }
    

    @And("^Close the browser$")
    public void close_the_browser()  {
    	System.out.println("step5"); 
    	
    	
    	   	
    }
    
    @After
    public void Teardown()
    {
    	System.out.println("close the browser code used here");
    }
    


 }
package Cucumber;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;



public class Base {
	public WebDriver driver;
	
	public WebDriver setup()
	{
		WebDriverManager.chromedriver().setup();
		return driver=new ChromeDriver();
		
	}
	
	
	
	
	
	}
	



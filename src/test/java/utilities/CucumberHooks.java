package utilities;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CucumberHooks {
	
	static WebDriver driver=null;
	
	public static WebDriver driver(){
		return driver;
	}
	
	
	@Before
	public void launch(){
		
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
	}
	
	@After
	public void teardown(){
		driver.quit();
	}
	
	@Before(order=1)
	public void beforeorder(){
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	@After(order=1)
	public void afterorder(){
		System.out.println("closed the browser from @after order conditional annotation");
	}
	
	@BeforeStep
	public void beforestep(){
		System.out.println("closed the browser from @beforestep annotation");
	}
	
	@AfterStep
	public void afterStep() throws IOException, ParseException{
//		ReusableComponents reusable=new ReusableComponents();
//		reusable.readjsonData(null);
	}

}

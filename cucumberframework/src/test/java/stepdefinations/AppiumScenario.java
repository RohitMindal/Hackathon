package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Hook;

public class AppiumScenario {

private WebDriver driver;
	
	public AppiumScenario() {
		this.driver = Hook.getDriver();
	}
	
	@Given("^I open the application$")
	public void i_open_the_application() throws Throwable {
		driver.get("https://testpages.eviltester.com/styled/html5-form-test.html");
		Assert.assertTrue(driver.findElement(By.id("colour-picker").sendKeys(" RGB, '125', '100', '135'").click());
		Assert.assertTrue(driver.findElement(By.id("date-picker").click());
		Assert.assertTrue(driver.findElement(By.id("date-time-picker").click());
		Assert.assertTrue(driver.findElement(By.id("email-field").click());
		Assert.assertTrue(driver.findElement(By.id("month-field").click());
		Assert.assertTrue(driver.findElement(By.id("number-field").sendkey("42");
		Assert.assertTrue(driver.findElement(By.name("submitbutton")).click());
		
	}

	
}

package stepdefinations;

import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Hook;

public class GoogleSearch {

	private WebDriver driver;
	
	public GoogleSearch() {
		this.driver = Hook.getDriver();
		
	}
	
	@Given("^I open a browser$")
	public void i_open_a_browser() throws Throwable {
		System.out.println("Browser is opened successfully");
	}

	@When("^I navigate to the test website")
	public void i_navigate_to_google_page() throws Throwable {
		driver.get("https://testpages.eviltester.com/styled/html5-form-test.html");
	}

	@Then("^I validate the search text field")
	public void i_validate_the_search_text_field() throws Throwable {
		String file_path = "C:\\Users\\user\\Documents\\New folder";
		Assert.assertTrue(driver.findElement(By.name("username")).sendKeys("rohitmindal035@gmail.com"));
		Assert.assertTrue(driver.findElement(By.name("password")).sendKeys("Rohit@194"));
		Assert.assertTrue(driver.findElement(By.name("comments")).sendKeys("XYZ"));
		Assert.assertTrue(driver.findElement(By.name ("filename")).click().file_input.send_keys(file_path)).click();
		Assert.assertTrue(driver.findElement(By.xpath ("//input[@type='checkbox' and @value='cb1'"])).click();
		Assert.assertTrue(driver.findElement(By.xpath ("//input[@type='radio' and @value='rd1'"])).click();
		Assert.assertTrue(driver.findElement(By.name("multipleselect[]")).select_by_visible_text("Option 2").click();
		Assert.assertTrue(driver.findElement(By.name ("dropdown").select_by_visible_text("Option 2").click();
		Assert.assertTrue(driver.findElement(By.name ("submitbutton")).click()
		
		
	}
	
}
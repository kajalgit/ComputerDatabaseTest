import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddComputerSteps extends BaseSteps{


	@Before
	public void before() {
		startWebDriver();
	}

	@After
	public void after() {
		stopWebDriver();
	}

	@Given("^I navigate to add computer details$")
	public void navigateToFindPage() {
		driver.navigate().to("http://computer-database.herokuapp.com/computers");
	}

	@When("^I add a new computer '(.*?)' starting at '(.*?)' and ending at '(.*?)' for company '(.*?)'$")
	public void searchComputer(String computerName, String startDate, String endDate, String company) {
		driver.findElement(By.id("add")).click(); 
		driver.findElement(By.id("name")).sendKeys(computerName);
		driver.findElement(By.id("introduced")).sendKeys(startDate);
		driver.findElement(By.id("discontinued")).sendKeys(endDate);
		driver.findElement(By.id("company")).click();
		Select companyName = new Select(driver.findElement(By.name("company")));
		companyName.selectByVisibleText(company);
		
		driver.findElement(By.cssSelector("[type='submit']")).click();
	}
	@Then("^Computer is added with success message '(.*?)'$")
	public void confirmAddition(String result) {
		String msg = driver.findElement(By.cssSelector("div[class='alert-message warning']")).getText();
        assertEquals(result, msg);
		

	}
	
	@When("^I add a new computer '(.*?)' with empty name$")
	public void checkComputerNameValidation(String computerName) {
		driver.findElement(By.id("add")).click(); 
		driver.findElement(By.id("name")).sendKeys(computerName);
		driver.findElement(By.cssSelector("[type='submit']")).click();
	}

	
	
	@Then("^Computer '(.*?)' field should be highlighted with this color '(.*?)'$")
	public void checkComputerNameError(String computerName,String color) {
		String colorRequried=driver.findElement(By.className("help-inline")).getCssValue("color");
		assertEquals(colorRequried,color);
	}
	
	@When("^I add a new computer '(.*?)' starting at '(.*?)' and ending at '(.*?)' with invalid dates$")
	public void checkDateValidations(String computerName, String startDate, String endDate) {
		driver.findElement(By.id("add")).click(); 
		driver.findElement(By.id("name")).sendKeys(computerName);
		driver.findElement(By.id("introduced")).sendKeys(startDate);
		driver.findElement(By.id("discontinued")).sendKeys(endDate);
		driver.findElement(By.cssSelector("[type='submit']")).click();
	}

	
	
	@Then("^Dates field should be highlighted with this color '(.*?)'$")
	public void checkComputerDateError(String color) {
		String emptyname=driver.findElement(By.className("help-inline")).getCssValue("color");
		assertEquals(emptyname,color);

	}

}

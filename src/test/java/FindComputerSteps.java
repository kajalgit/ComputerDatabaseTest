import org.openqa.selenium.By;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FindComputerSteps extends BaseSteps {

	@Before
	public void before() {
		startWebDriver();
	}

	@After
	public void after() {
		stopWebDriver();
	}

	@Given("^I navigate to search computer page$")
	public void navigateToFindPage() {
		driver.navigate().to("http://computer-database.herokuapp.com/computers");
	}

	@When("^I search for '(.*?)'$")
	public void searchComputer(String computerName) {
		driver.findElement(By.id("searchbox")).sendKeys(computerName);
		driver.findElement(By.id("searchsubmit")).click();
	}

	@Then("^Search result is shown$")
	public void checkSearchResults() {

	}

}

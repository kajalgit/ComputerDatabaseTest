import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeleteComputerSteps extends BaseSteps {

	@Before
	public void before() {
		startWebDriver();
	}

	@After
	public void after() {
		stopWebDriver();
	}

    @Given("^I navigate to delete computer page$")
    public void navigateToDeletePage() {
    	driver.navigate().to("http://computer-database.herokuapp.com/computers");
    }
    
    
    @When("^I delete '(.*?)'$")
    public void deleteComputer(String computerName) {
    	driver.findElement(By.linkText(computerName)).click();
		driver.findElement(By.cssSelector("[type='submit']")).click();
    }
    @Then("^'(.*?)' is deleted with success message '(.*?)'$")
    public void checkSuccess(String computerName, String successMessage) {
    	String msg = driver.findElement(By.cssSelector("div[class='alert-message warning']")).getText();
        assertEquals(successMessage, msg);
    }

}

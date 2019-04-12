import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    format = {
        "json:target/cucumber/computerDatabase.json",
        "html:target/cucumber/computerDatabase.html",
        "pretty"
    }
)
public class ComputerDatabaseTest {

}

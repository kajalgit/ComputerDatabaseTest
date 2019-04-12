import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class deleteComputer {

	public static void main(String[] args) {
		goToFirefox();
	}

	public static void goToChrome() {
		// TODO Auto-generated method stub
		// Creating driver object for chrome
		System.setProperty("webdriver.chrome.driver", "C:/Files/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://computer-database.herokuapp.com/computers");
		System.out.println("gdfgfgfgh");

	}

	public static void goToFirefox() {
		// Creating driver object for firefox
		System.setProperty("webdriver.firefox.bin", "C:\\files\\ISW\\Mozilla Firefox\\firefox.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\files\\ISW\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://computer-database.herokuapp.com/computers");
		System.out.println("Page Title: " + driver.getTitle());
		driver.findElement(By.linkText("AN/FSQ-32")).click();
		driver.findElement(By.cssSelector("[type='submit']")).click();
		String msg = driver.findElement(By.cssSelector("div[class='alert-message warning']")).getText();

		if (driver.findElement(By.cssSelector("div[class='alert-message warning']")).getText() == "Done!") {
			System.out.println("Passed");

		}

	}

}

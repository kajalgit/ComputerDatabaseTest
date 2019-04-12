import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class goToUrl {

	public static void main(String[] args) {
		goToFirefox();
	}

	public static void goToChrome() {
		// TODO Auto-generated method stub
		//Creating driver object for chrome
		System.setProperty("webdriver.chrome.driver","C:/Files/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://computer-database.herokuapp.com/computers");
		System.out.println("gdfgfgfgh");

	}
	
	public static void goToFirefox() {
		//Creating driver object for firefox
		System.setProperty("webdriver.gecko.driver","C:/Files/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://computer-database.herokuapp.com/computers");
		System.out.println("Page Title"+driver.getTitle());
		driver.findElement(By.id("add")).click(); 
		driver.findElement(By.id("name")).sendKeys("Intel 5");
		driver.findElement(By.id("introduced")).sendKeys("2018-12-02");
		driver.findElement(By.id("discontinued")).sendKeys("2019-12-02");
		driver.findElement(By.id("company")).click();
		Select companyName = new Select(driver.findElement(By.name("company")));
		companyName.selectByVisibleText("Apple Inc.");
		
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
			
	}
}

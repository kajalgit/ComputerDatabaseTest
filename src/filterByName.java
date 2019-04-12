import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class filterByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating driver object for firefox
		System.setProperty("webdriver.gecko.driver","C:/Files/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://computer-database.herokuapp.com/computers");
		System.out.println("Page Title: "+driver.getTitle());
		driver.findElement(By.id("searchbox")).sendKeys("ASCI Purple"); 
		driver.findElement(By.id("searchsubmit")).click();
	//	driver.findElement(By.name("[background-color: #eedc94;]"));
	}

}

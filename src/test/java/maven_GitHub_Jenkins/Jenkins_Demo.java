package maven_GitHub_Jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jenkins_Demo  {
	WebDriver driver;

	@Test
	public void BLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
	
	
		driver.get("http://automationpractice.com/index.php");

	}
	
}

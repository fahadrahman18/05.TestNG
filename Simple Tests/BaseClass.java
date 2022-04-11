package week5.TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static RemoteWebDriver driver;
	
	@BeforeMethod
	public void precondition() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");	
		driver.manage().window().maximize();  //maximize window

	}
	
	@AfterMethod
	public void postcondition() {
	
		driver.quit();
	}

}

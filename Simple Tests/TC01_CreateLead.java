package week5.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC01_CreateLead extends BaseClass{
		
		@Test
	    public void TestCase01() throws InterruptedException {
		
		WebElement enterusername = driver.findElement(By.id("username"));
		enterusername.sendKeys("Demosalesmanager");

// Giving credential and login
		WebElement enterpassword = driver.findElement(By.id("password"));
		enterpassword.sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
//      Perform create leads
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf Services");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("fname");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("lname");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("mr");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("cse");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Running tests");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");

// 		perform Drop down action
		WebElement statedropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state = new Select(statedropdown);
		state.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
// print the title of the page
		System.out.println(driver.getTitle());
		
	}

}

package week5.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC02_EditLead extends BaseClass {
	
	@Test
	public void TestCase02() throws InterruptedException {
		
		WebElement enterusername = driver.findElement(By.id("username"));
		enterusername.sendKeys("Demosalesmanager");

	//Giving credential and login
		WebElement enterpassword = driver.findElement(By.id("password"));
		enterpassword.sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.linkText("Leads")).click();  //clicking Lead
		driver.findElement(By.linkText("Find Leads")).click(); //clicking Find Leads
		
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Test");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		
		Thread.sleep(2000);
		
		String titlename = driver.getTitle();
		
		System.out.println("Title of the page is " + titlename);

		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TATA");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		
		String verifycomname = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		
		System.out.println("Changed company name is " + verifycomname);
		
	}
	

}

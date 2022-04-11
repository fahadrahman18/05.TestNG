package week5.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearnAnnotations {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite - Configure Environment");

	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test - Configure Test Execution Report ");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class - Configure Test Data");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method - Open the Browser");
	}
	@Test
	public void test01() {
		System.out.println("Test Case 1");
	}
	@Test
	public void test02() {
		System.out.println("Test Case 2");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method - Close the browser");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class - close the test data");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After Test - close the report");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite - close the Environment");
	}

}

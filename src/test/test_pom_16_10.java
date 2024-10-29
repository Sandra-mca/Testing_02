package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.fblogin_pom_15_10;

public class test_pom_16_10 {
	WebDriver driver;

	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void test()
	{
		fblogin_pom_15_10  p1=new fblogin_pom_15_10(driver);
		p1.setvalues("abc@gmail.com", "abcd");
		p1.login();
	}
}

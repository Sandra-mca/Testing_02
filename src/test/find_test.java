package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.fblogin_pom_15_10;
import Page.find_page_15_10;

public class find_test {

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
		find_page_15_10  p1=new find_page_15_10(driver);
		p1.setvalues("abc@gmail.com", "abcd");
		p1.login();
	}
}

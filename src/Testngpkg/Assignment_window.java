package Testngpkg;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment_window {
	
	WebDriver driver;
	
	@BeforeTest
	public void bt()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void bm()
	{
		driver.get("https://www.amazon.in/");;
	}
	
	@Test
	public void test()
	{
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String parentwindow=driver.getWindowHandle();
		
		//search mobiles
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Mobiles",Keys.ENTER);
		System.out.println(driver.getTitle());
		//Title Verification using Assertion
		String actual=driver.getTitle();
		System.out.println(actual);
		String expected="Amazon.in : Mobiles";
		Assert.assertEquals(actual, expected);
		
		//Click on First phone
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
		
		//Click add to cart
		Set<String> allwindows = driver.getWindowHandles();
		for(String handle:allwindows)
		{
			if(!handle.equalsIgnoreCase(parentwindow))
					{   
						 driver.switchTo().window(handle); 
                         driver.findElement(By.xpath("//body/div[@id='a-page']/div[@id='dp']/div[@id='dp-container']/div[@id='ppd']/div[@id='rightCol']/div[@id='desktop_buybox']/div[@id='buybox']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[38]/div[1]/span[1]/span[1]/span[1]/input[1]")).click();
                         driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]")).click();
					}
		}
		
		
	}

}


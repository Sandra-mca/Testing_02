package Testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Window_handle_14_10 {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void bt()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void bm()
	{
		driver.get("https://demo.guru99.com/popup.php");
	}

	@Test
	public void test()
	{
		String parentwindow=driver.getWindowHandle();
		System.out.println("Parent Window Title : "+ driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		
		Set<String> allwindows = driver.getWindowHandles();
		for(String handle:allwindows)
		{
			System.out.println(handle);
			
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abcd@gmail.com");
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
				driver.close();
			}
			
			driver.switchTo().window(parentwindow);
		}
		
	}
}
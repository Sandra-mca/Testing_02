package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class New_tab_win_14_10 {
	
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
		//WebDriver driver1=driver.switchTo().newWindow(WindowType.TAB);
		WebDriver driver1=driver.switchTo().newWindow(WindowType.WINDOW);
		driver1.get("https://www.facebook.com/");
	}
	
	

}

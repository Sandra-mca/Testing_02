package page_dd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class page_class {
	
	WebDriver driver;
	
	By fbemail=By.id("email");
	By fbpassword=By.id("pass");
	By fblogin=By.name("login");
	
	public page_class(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalues(String email,String password)
	{
		driver.findElement(fbemail).clear();
		driver.findElement(fbemail).sendKeys(email);
		driver.findElement(fbpassword).clear();
		driver.findElement(fbpassword).sendKeys(password);
		
	}
	
	public void login()
	{
		driver.findElement(fblogin).click();
	}

}

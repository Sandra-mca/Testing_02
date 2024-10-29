package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class find_page_15_10 {
	
	WebDriver driver;
	
	
	@FindBy(id="email") WebElement fbemail;
	
	@FindBy(id="pass") WebElement fbpass;
	
	@FindBy(name="login") WebElement fblogin;
	
	public find_page_15_10(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
    public void setvalues(String email,String password)
    {
	      fbemail.sendKeys(email);
	      fbpass.sendKeys(password);
    }
    
    public void login()
    {
    	fblogin.click();
    }

}

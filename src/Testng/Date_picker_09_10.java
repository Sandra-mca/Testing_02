package Testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Date_picker_09_10 {
	
ChromeDriver driver;
	
	@BeforeTest
	public void bt()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void bm()
	{
		driver.get("https://www.trivago.in/en-IN?themeId=280&sem_keyword=trivago&sem_creativeid=598703244708&sem_matchtype=e&sem_network=g&sem_device=c&sem_placement=&sem_target=&sem_adposition=&sem_param1=&sem_param2=&sem_campaignid=12417347003&sem_adgroupid=118398776556&sem_targetid=kwd-5593367084&sem_location=9149372&cipc=br&cip=9119000005&gad_source=1&gclid=CjwKCAjw3624BhBAEiwAkxgTOrs1VlKj24ll7xFNQxOnRchYAtq9lRRsnBLsyQqeitezlPm0IjtmsxoCqh0QAvD_BwE");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/section[1]/div[2]/div[4]/div[1]/div[1]/fieldset[1]/button[1]/span[1]/span[2]")).click();
		
		while(true) 
		{
			WebElement month = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3"));
		    String mon=month.getText();
		    if(mon.equals("October 2024"))
		    {
		    	System.out.println(mon);
		    	break;
		    }
		    else
		    {
		    	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]")).click();
		    }
		}
		
		 List<WebElement> dates = driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/time"));
		 for(WebElement  s:dates)
		 {
			 String date=s.getText();
			 
			 if(date.equals("17"))
			 {
				s.click();
				break;
				 
			 }
		 }
	
	}

}

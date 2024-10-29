package Testng;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rishi_herbals {
	
	ChromeDriver driver;
	String baseurl="https://rishiherbalindia.linker.store/";
	@BeforeTest
	public void bt()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void bm()
	{
		driver.get(baseurl);
	}
	
	@Test
	public void test()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Register
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[1]/input ")).sendKeys("ssandrarajesh2000@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[2]/input")).sendKeys("Sandra@123");
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[3]/label/input")).click();
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/button")).click();
		
		
		//Login
		driver.findElement(By.xpath("//*[@id=\"register-model-signin-link\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[2]/input")).sendKeys("Sandra@123");
		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/button[1]")).click();
		
		
		
	}
	@Test
	public void test2() throws IOException
	{
		//Search
	    driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Herbal Agro Growth Booster");
	    driver.findElement(By.xpath("//*[@id=\"searchDDWrp\"]/ul/div[4]/div/div/li[1]/div/div[2]/a/span")).click();
	   
	    //wishlist
	    driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]/span")).click();
	    
	    //Skin
	    driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[4]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img")).click();
	    driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]/span")).click();
	    
	    //Click on All,health,Safety
	    driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a")).click();
	    
	    //scroll
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	    driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[2]/div/ul/li[2]/a")).click();
	    
	    
	    //Screenshot
	    WebElement element=driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[4]/div/ul/li[1]/a"));
		File src2=element.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src2, new File("./Screenshot//privacy.png"));
		
		//Responsecode
		URL ob=new URL(baseurl);
		HttpURLConnection con=(HttpURLConnection)ob.openConnection();
		int code=con.getResponseCode();
		System.out.println("Response code="+code);
		con.connect();
		
		if(con.getResponseCode()==200)
		{
			System.out.println("Valid URl");
		}
		else
		{
			System.out.println("Valid URl");
		}
		
	}

}

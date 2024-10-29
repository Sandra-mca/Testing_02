package Testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class File_upload_07_10 {

ChromeDriver driver;
	
	@BeforeTest
	public void bt()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void bm()
	{
		driver.get("https://www.ilovepdf.com/pdf_to_word");
	}
	@Test
	public void test1() throws Exception
	{
	    driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		fileUpload("F:\\Resume_Sandra-1.pdf");
	}
	public void fileUpload(String p) throws AWTException
	
		{
			StringSelection strselect=new StringSelection(p);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselect,null);
			
			//to paste into system window
			Robot rob=new Robot();
			rob.delay(3000);
			rob.keyPress(KeyEvent.VK_CONTROL);
			rob.keyPress(KeyEvent.VK_V);
			
			rob.keyRelease(KeyEvent.VK_V);
			rob.keyRelease(KeyEvent.VK_CONTROL);
			
			rob.keyPress(KeyEvent.VK_ENTER);
			rob.keyRelease(KeyEvent.VK_ENTER);
			
			
			
			
		}

	
		
	}


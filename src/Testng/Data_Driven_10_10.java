package Testng;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Data_Driven_10_10 {
	
ChromeDriver driver;
	
	@BeforeTest
	public void  bf()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void bm()
	{
		driver.get("https://www.facebook.com/");	
	}
	
	@Test
	public void test() throws IOException
	{
		
		File f=new File("F:\\datadriven.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("Sheet1");
		System.out.println(sh.getLastRowNum());
		
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("username="+username);
			
			String password=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("password="+password);
			
			driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
			
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
			
			WebElement element = driver.findElement(By.xpath("//button[@name=\"login\"]"));
			element.click();
			
		
		}
	}

}

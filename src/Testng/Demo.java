package Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
	
	@BeforeTest()
	public void bt()
	{
		System.out.println("browseropen");
	}
	
	
	
	@BeforeMethod()
	public void bm()
	{
		System.out.println("url open");
	}
	
	
	
	@Test(priority=3,dependsOnMethods= {"test3"})
	public void test1()
	{
		System.out.println("Test1");
	}
	@Test(priority=2,enabled=false)
	public void test2()
	{
		System.out.println("Test2");
	}
	@Test(priority=1,invocationCount=2)
	public void test3()
	{
		System.out.println("Test3");
	}
	
	
	
	
	@AfterMethod()
	
		public void am()
		{
			System.out.println("report");
		}
	
	
	@AfterTest()
	public void at()
	{
		System.out.println("browserclose");
	}

}

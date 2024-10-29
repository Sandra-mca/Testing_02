package test_dd;

import org.testng.annotations.Test;
import base_dd.Base_class;
import page_dd.page_class;
import utilities_dd.excel_util;

public class test_class extends Base_class {
	
	@Test
	public void verifyLoginWithValidCred() 
	{
		page_class p1=new page_class(driver);
		
			String x1="F:\\datadriven.xlsx";
			String Sheet="Sheet1";
			
			int rowCount=excel_util.getRowCount(x1,Sheet);
			for(int i=1;i<=rowCount;i++)
			{
				String UserName=excel_util.getCellValue(x1,Sheet,i,0);
				System.out.println("Username---------"+UserName);
				String pwd=excel_util.getCellValue(x1, Sheet, i, 1);
				System.out.println("Password---------"+pwd);
				
				p1.setvalues( UserName, pwd);
				p1.login();
			}
					
				
	}
	

}

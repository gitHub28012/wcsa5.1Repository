package keyWordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidLoginTestcase extends BaseTest{
	
	public static void main(String[] args) throws IOException {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib flib = new Flib();
		
		int rc = flib.getLastRowCount(EXCEL_PATH, "invalidcreds");
		
		for(int i=1;i<=rc;i++)
		{
			driver.findElement(By.name("username")).sendKeys(flib.readExcelData(EXCEL_PATH,"invalidcreds",i,0));
            driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData(EXCEL_PATH,"invalidcreds",i,1));
            driver.findElement(By.id("loginButton")).click();
            driver.findElement(By.name("username")).clear();
		}
		
		bt.closeBrowser();
	}

}

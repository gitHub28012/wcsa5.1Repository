package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomeListener;
import genericPackage.Flib;
import pagePackage.LoginPage;
@Listeners(CustomeListener.class)

public class LoginTestCase extends BaseTest {
	
  @Test
  public void validloginMethod() throws IOException 
  {
	  // to perform login call the methods from LoginPage pom class
	  LoginPage lp = new LoginPage(driver);
	  Flib flib = new Flib();
	  lp.validLoginMethod(flib.readPropertyData(PROP_PATH1,"Username"),flib.readPropertyData(PROP_PATH1, "Password"));
  }
  
  
  
  @Test(dependsOnMethods = "validloginMethod")
  public void inValidLoginMethod() throws EncryptedDocumentException, IOException, InterruptedException
  {
	  LoginPage lp = new LoginPage(driver);
	  Flib flib = new Flib();
	  int rc = flib.getLastRowCount(EXCEL_PATH,INVALIDSHEET_NAME);
	  for(int i=1;i<=rc;i++)
	  {
		  lp.inValidLoginMethod(flib.readExcelData(EXCEL_PATH,INVALIDSHEET_NAME,i,0),flib.readExcelData(EXCEL_PATH, INVALIDSHEET_NAME, i,1));
	  }
  }
}

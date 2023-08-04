package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomeListener;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.UsersPage;
@Listeners(CustomeListener.class)

public class UserTestCase extends BaseTest {
  @Test
  public void createUserMethod() throws IOException, EncryptedDocumentException, InterruptedException {
	  
	  // to perform login call the methods from LoginPage pom class
	  LoginPage lp = new LoginPage(driver);
	  Flib flib = new Flib();
	  lp.validLoginMethod(flib.readPropertyData(PROP_PATH1,"Username"),flib.readPropertyData(PROP_PATH1, "Password"));
     // to click on user module call the method from HomePage pom class
	   HomePage hp = new HomePage(driver);
	   hp.clickOnusersModule();
	 // to create the user call the methods From usersPage pom class
	   UsersPage up = new UsersPage(driver);
	   up.createManager(flib.readExcelData(EXCEL_PATH, MANAGERSHEET_NAME,1, 0),flib.readExcelData(EXCEL_PATH, MANAGERSHEET_NAME, 1,1),flib.readExcelData(EXCEL_PATH, MANAGERSHEET_NAME,1,2),flib.readExcelData(EXCEL_PATH, MANAGERSHEET_NAME, 1,3));
  // delete the user
	  // up.deleteManager();
	   
	   hp.clickOnLogoutLink();
	  
  }
}

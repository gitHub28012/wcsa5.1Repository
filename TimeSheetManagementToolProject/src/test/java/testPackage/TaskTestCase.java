package testPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomeListener;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.TasksPage;
@Listeners(CustomeListener.class)

public class TaskTestCase extends BaseTest {
  @Test
  public void project_customerMethod() throws IOException {
	  
	  LoginPage lp = new LoginPage(driver);
	  Flib flib = new Flib();
	  lp.validLoginMethod(flib.readPropertyData(PROP_PATH1,"Username"),flib.readPropertyData(PROP_PATH1,"Password"));
      HomePage hp = new HomePage(driver);
      hp.clickOntaskModule();
      // we are there in Task page
      TasksPage ts = new TasksPage(driver);
      // create the customer.
      ts.createNewCustomerMethod(flib.readExcelData(EXCEL_PATH,CUST_PROSHEET_NAME,1,0));
      // Create the project
      ts.createNewProjectMethod(flib.readExcelData(EXCEL_PATH,CUST_PROSHEET_NAME,1,0),flib.readExcelData(EXCEL_PATH,CUST_PROSHEET_NAME,1,1));
  
  }


}

package testNGAnnotation_Flags;

import org.testng.annotations.Test;

public class Flag5 {
	
	
  @Test()
  public void loginMethod()
  {
	  System.out.println("it is use to perform login!!");
  }
  
  @Test(dependsOnMethods = "loginMethod")
  public void createUserMethod()
  {
	 System.out.println("it is use to create user!!"); 
  }
  
  @Test(dependsOnMethods = "createUserMethod")
  public void logoutMethod()
  {
	  System.out.println("it is use to perform logout!!");
  }
  
}

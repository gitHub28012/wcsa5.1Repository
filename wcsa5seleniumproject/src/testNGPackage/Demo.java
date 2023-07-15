package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void f() {
	  
	//  System.out.println("This is Demo TestNG Class!!");
	  
	//  Reporter.log("This is Demo TestNG Class!!");
	  
	  Reporter.log("This is Demo TestNG Class!!",true);
  }
}

package testNGAnnotation_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3 {
	
  @Test(invocationCount = 1000)
  public void method1() {
	  
	  Reporter.log("Method1",true);
  }
}

package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod2 {
	  @Test
	  public void testMethod3() {
		  
		  long thredId3 = Thread.currentThread().getId();
		  
		  Reporter.log("thread id of testMethod3 :"+thredId3,true);
	  }
	  
	  @Test
	  public void testMethod4() {
		  
		  long thredId4 = Thread.currentThread().getId();
		  
		  Reporter.log("thread id of testMethod4 :"+thredId4,true);
	  }
}

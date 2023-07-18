package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod3 {
	  @Test
	  public void testMethod5() {
		  
		  long thredId5 = Thread.currentThread().getId();
		  
		  Reporter.log("thread id of testMethod5 :"+thredId5,true);
	  }
	  
	  @Test
	  public void testMethod6() {
		  
		  long thredId6 = Thread.currentThread().getId();
		  
		  Reporter.log("thread id of testMethod6 :"+thredId6,true);
	  }
}

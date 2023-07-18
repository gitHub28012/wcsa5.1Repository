package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod1 {
  @Test
  public void testMethod1() {
	  
	  long thredId1 = Thread.currentThread().getId();
	  
	  Reporter.log("thread id of testMethod1 :"+thredId1,true);
  }
  
  @Test
  public void testMethod2() {
	  
	  long thredId2 = Thread.currentThread().getId();
	  
	  Reporter.log("thread id of testMethod2 :"+thredId2,true);
  }
}

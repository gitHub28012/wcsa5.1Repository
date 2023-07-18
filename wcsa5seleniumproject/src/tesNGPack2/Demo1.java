package tesNGPack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
  @Test
  public void method1() {
	  
	  Reporter.log("This is method1",true);
  }
  
  @Test
  public void method2()
  {
	  Reporter.log("This is method2",true);
  }
}

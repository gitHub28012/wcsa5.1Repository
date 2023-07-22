package testNGAnnotation_Flags;

import org.testng.annotations.Test;

public class Flag4 {
	
	
  @Test(priority = 0)
  public void f() 
  {
	  System.out.println("f");
  }
  
  @Test
  public void i()
  {
	  System.out.println("i");
  }
  
  @Test(priority = 3)
  public void z() 
  {
	  System.out.println("z");
  }
  
  @Test
  public void e() 
  {
	  System.out.println("e");
  }

  @Test(priority = 1)
  public void p()
  {
	  System.out.println("p");
  }
  
  
  @Test(priority = 2)
  public void m() 
  {
	  System.out.println("m");
  }
  
  @Test(priority = 1)
  public void k() 
  {
	  System.out.println("k");
  }
  
  
  @Test(priority = 0)
  public void d()
  {
	  System.out.println("d");
  }
}

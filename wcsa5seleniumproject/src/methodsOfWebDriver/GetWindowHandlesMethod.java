package methodsOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		// launch the browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		// apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// launch the webapplication
		driver.get("http://omayo.blogspot.com/");
		// get the handle or address of current or parent window..
		String parentHandle = driver.getWindowHandle();
		System.out.println("Address of parent window : "+parentHandle);
		
		// launch the child window
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		Thread.sleep(2000);
		// get the handle or address of child window only
	     Set<String> allHandles = driver.getWindowHandles();
	     // Read addresses by using looping statment
	      for(String wh:allHandles)
	      {
	    	  System.out.println(wh);
	      }

	}
}
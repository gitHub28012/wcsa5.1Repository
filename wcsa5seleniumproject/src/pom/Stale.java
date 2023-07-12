package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver	driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("http://laptop-knl22f4g/login.do");
	    
	    WebElement usnTB = driver.findElement(By.name("username"));
	    //usnTB.sendKeys("admin");
	    WebElement pssTB = driver.findElement(By.name("pwd"));
	  //  pssTB.sendKeys("manager");
	    
	 //   Thread.sleep(2000);
	    driver.navigate().refresh();
	    usnTB.sendKeys("admin");
	    
	    
	}

}

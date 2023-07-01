package methodsOfWebElements;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ClickMethod {
	
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Qspiders-Wakad/Desktop/wcsa5/WebElement/SingleSelectDropdown.html");
		
		WebElement dropDown = driver.findElement(By.id("menu"));
		dropDown.click();
		
		File src = dropDown.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/dropDownss.png");
		Files.copy(src, dest);
		
//		driver.findElement(By.id("menu")).click();
		
	}

}

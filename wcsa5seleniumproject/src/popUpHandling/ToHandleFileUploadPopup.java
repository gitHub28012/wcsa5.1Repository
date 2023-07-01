package popUpHandling;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFileUploadPopup {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("http://omayo.blogspot.com/");
		
		Actions act = new Actions(driver);
		WebElement uploadButton = driver.findElement(By.id("uploadfile"));
		act.doubleClick(uploadButton).perform();
		
	    Runtime.getRuntime().exec("./autoItPrograms/OmayoFileUpload.exe");

	}

}

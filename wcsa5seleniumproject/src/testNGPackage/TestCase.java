package testNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(CustomeListener.class)
public class TestCase extends BaseTest {
	@Test
	public void loginMethod() {
		SoftAssert sa = new SoftAssert();
		WebElement usn = driver.findElement(By.name("username"));
		sa.assertEquals(usn.isDisplayed(),true);
		usn.sendKeys("admin");
		WebElement pass = driver.findElement(By.name("pwd"));
		sa.assertEquals(pass.isDisplayed(),true);
		pass.sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		sa.assertAll();
	}

	@Test(dependsOnMethods = "loginMethod")
	public void createUser()
	{
		SoftAssert sa = new SoftAssert();
		WebElement usn = driver.findElement(By.name("username"));
		sa.assertEquals(usn.isDisplayed(),true);
		usn.sendKeys("admin");
		WebElement pass = driver.findElement(By.name("pwd"));
		sa.assertEquals(pass.isDisplayed(),true);
		pass.sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		sa.assertAll();
		String expectedTitle = driver.getTitle();
		Assert.assertEquals(driver.getTitle(),expectedTitle); 
		driver.findElement(By.xpath("//div[text()='Users']/ancestor::a/img")).click();  
	}
	
	@Test(dependsOnMethods = "createUser")
	public void logout()
	{
		
		driver.findElement(By.partialLinkText("Log")).click();
	}
	
}

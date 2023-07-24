package testNGPackage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(CustomeListener.class)

public class TestCase extends BaseTest {

	@Test
	public void loginMethod() throws InterruptedException 
	{

		String actualTitle = driver.getTitle();

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(),actualTitle);

		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		System.out.println("title matched test case passed!!!");
		sa.assertAll();

		String actualTitleOfHomePage = driver.getTitle();
		Assert.assertEquals(driver.getTitle(),"Tanmay");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();

	}
}

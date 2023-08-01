package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// it is a webelement repository

	@FindBy(xpath="//*[@name='username']") private WebElement usnTB;
	@FindBy(xpath = "//*[@name='pwd']") private WebElement pssTB;
	@FindBy(xpath = "//*[contains(@class,'initial')]") private WebElement loginButton;
	@FindBy(id ="keepLoggedInCheckBox") private WebElement checkBox;
	@FindBy(partialLinkText = "Actimind Inc.") private WebElement actiMindLink;


	//intialization


	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}




	// utilaization



	public WebElement getUsnTB() {
		return usnTB;
	}




	public WebElement getPssTB() {
		return pssTB;
	}




	public WebElement getLoginButton() {
		return loginButton;
	}




	public WebElement getCheckBox() {
		return checkBox;
	}




	public WebElement getActiMindLink() {
		return actiMindLink;
	}


	// operational Methods
	public void validLoginMethod(String validUsername,String validPassword)
	{
		usnTB.sendKeys(validUsername);
		pssTB.sendKeys(validPassword);
		loginButton.click();
	}

	public void inValidLoginMethod(String invalidUsername,String invalidPassword) throws InterruptedException
	{
		usnTB.sendKeys(invalidUsername);
		pssTB.sendKeys(invalidPassword);
		loginButton.click();
		Thread.sleep(1000);
		usnTB.clear();
	}

}

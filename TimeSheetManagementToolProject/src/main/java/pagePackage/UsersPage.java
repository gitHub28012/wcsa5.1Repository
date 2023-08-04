package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericPackage.WorkLib;

public class UsersPage extends WorkLib {
	// store webelements of userspage
	@FindBy(xpath ="//input[@value='Create New User']") private WebElement userListCreatenewUserButton;
	@FindBy(name="username") private WebElement usnTB;
	@FindBy(xpath = "//*[@name='passwordText']") private WebElement pssTB; 
	@FindBy(xpath = "//*[@name='passwordTextRetype']") private WebElement retypePassTB;
	@FindBy(name="firstName") private WebElement firstNameTB;
	@FindBy(name="lastName") private WebElement lastNameTB;
	@FindBy(name = "rightGranted[12]") private WebElement modifyEnterTimeTrackCheckBox;
	@FindBy(name = "rightGranted[2]") private WebElement manageCust_projectCheckBox;
	@FindBy(name = "rightGranted[1]") private WebElement generatesReportsCheckBox;
	@FindBy(name= "rightGranted[5]") private WebElement manageUserCheckBox;
	@FindBy(name="rightGranted[7]") private WebElement manageBillingTypesCheckBox;
    @FindBy(xpath = "//input[@type='submit']") private WebElement createUserButton;
    @FindBy(xpath = "/HTML/BODY/DIV/FORM/TABLE/TBODY/TR[4]/TD/INPUT[2]") private WebElement cancelButton;
    @FindBy(xpath = "//a[.='Shrama, Rohit (manager_01)']") private WebElement usersLink;
    @FindBy(xpath = "//input[@value='Delete This User']") private WebElement deleteThisUserButton;
    
    
    
    // initaization
     public UsersPage(WebDriver driver)
     {
    	 PageFactory.initElements(driver,this);
     }

	public WebElement getUserListCreatenewUserButton() {
		return userListCreatenewUserButton;
	}

	public WebElement getUsnTB() {
		return usnTB;
	}

	public WebElement getPssTB() {
		return pssTB;
	}

	public WebElement getRetypePassTB() {
		return retypePassTB;
	}

	public WebElement getFirstNameTB() {
		return firstNameTB;
	}

	public WebElement getLastNameTB() {
		return lastNameTB;
	}

	public WebElement getModifyEnterTimeTrackCheckBox() {
		return modifyEnterTimeTrackCheckBox;
	}

	public WebElement getManageCust_projectCheckBox() {
		return manageCust_projectCheckBox;
	}

	public WebElement getGeneratesReportsCheckBox() {
		return generatesReportsCheckBox;
	}

	public WebElement getManageUserCheckBox() {
		return manageUserCheckBox;
	}

	public WebElement getManageBillingTypesCheckBox() {
		return manageBillingTypesCheckBox;
	}

	public WebElement getCreateUserButton() {
		return createUserButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}
     
     
     public void createManager(String username,String password,String fn,String ln) throws InterruptedException
     {
    	 userListCreatenewUserButton.click();
    	 Thread.sleep(1000);
    	 usnTB.sendKeys(username);
    	 pssTB.sendKeys(password);
    	 retypePassTB.sendKeys(password);
    	 firstNameTB.sendKeys(fn);
    	 lastNameTB.sendKeys(ln);
    	 Thread.sleep(1000);
    	 modifyEnterTimeTrackCheckBox.click();
    	 manageCust_projectCheckBox.click();
    	 generatesReportsCheckBox.click();
    	 manageUserCheckBox.click();
    	 manageBillingTypesCheckBox.click();
    	 Thread.sleep(1000);
    	 createUserButton.click();
     }
    
     public void deleteManager()
     {
    	 usersLink.click();
    	 deleteThisUserButton.click();
    	 // handle confiramtion pop up
    	WorkLib wlb = new WorkLib();
    	wlb.acceptConfirmationPopUp();
     }
}

package genericPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WorkLib extends BaseTest{

	// handle Alert Pop up
	public void acceptAlertPopUp()
	{
		driver.switchTo().alert().accept();
	}

	public void dismissAlertPopUp()
	{
		driver.switchTo().alert().dismiss();
	}

	// Handle confirmation Pop up
	public void acceptConfirmationPopUp()
	{
		driver.switchTo().alert().accept();
	}

	public void dismissConfirmationPopUp()
	{
		driver.switchTo().alert().dismiss();
	}

	// Handle Frame 
	public void handleFrameByusingIndex(int index)
	{
		driver.switchTo().frame(index);
	}

	public void handleFrameByusingStringNameOrId(String nameOrId)
	{
		driver.switchTo().frame(nameOrId);
	}

	public void handleFrameByusingFrameElement(WebElement FremEle)
	{
		driver.switchTo().frame(FremEle);
	}

	public void switchTomainPage()
	{
		driver.switchTo().defaultContent();
	}

	public void switchToParentPage()
	{
		driver.switchTo().parentFrame();
	}

	// Handle the mouse Action
	public void mouseHoverMethod(WebElement target)
	{
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
	}

	public void rightClick(WebElement target)
	{
		Actions act = new Actions(driver);
		act.contextClick(target).perform();
	}

	public void doubleClickMethod(WebElement target)
	{
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();
	}

	public void dragAndDropMethod(WebElement src,WebElement target)
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(src, target).perform();
	}

	// Handle KeyBorad Action
	public void hitEnterButtonMethod() throws AWTException
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public void hitTabButtonMethod() throws AWTException
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
	}
	
	// handle DropDown
	public void selectByIndexMethod(WebElement element,int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	public void selectByVisibleTextMethod(WebElement element,String text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public void selectByValueMethod(WebElement element,String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}


}

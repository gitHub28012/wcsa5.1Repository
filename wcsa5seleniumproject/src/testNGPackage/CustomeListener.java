package testNGPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomeListener extends BaseTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		Reporter.log("Test Started",true);
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		Reporter.log("Test Exceuted Successfully!!",true);
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
	      String methodName = result.getMethod().getMethodName();	
	      Reporter.log("This method is failed taken the screenshot :"+methodName,true);
	      failedMethod(methodName); 
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test Skipped",true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
		
			}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("Test actaul Started",true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("Test Finished!!!",true);
	}

}

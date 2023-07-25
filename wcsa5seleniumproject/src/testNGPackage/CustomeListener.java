package testNGPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomeListener extends BaseTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Test Started!!",true);	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test executed successfully!!!!",true);
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		String failedMethod = result.getMethod().getMethodName();
		Reporter.log("This method failed and taken ss :"+failedMethod,true);
		failedMethod(failedMethod);
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test Skipped!!",true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("Test actual Started!!",true);

	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("Test finished!!",true);
	}
 
}

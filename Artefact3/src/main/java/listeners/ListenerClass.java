package listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener,ISuiteListener{

	@Override
	public void onFinish(ITestContext context) {
		
	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("After method in Listener:attaching the screenshot");

	}

	@Override
	public void onTestSkipped(ITestResult result) {
	}

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Before method in Listener");

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("After method in Listener:pass");

	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("After suite in Listener");

	}

	@Override
	public void onStart(ISuite suite) {
		
		System.out.println("Before suite in Listener");

	}

}

package day46;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{
	public void onTestStart(ITestResult result) {
		System.out.println("Test Passed ....");
	    
	  }
	
	
	public void onTestSuccess(ITestResult result) {
	    System.out.println("Test Passed ....");
	  }
	
	
	public void onTestFailure(ITestResult result) {
	   System.out.println("Test Passed...");
	  }


}

package listeners;

import org.apache.log4j.Logger;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestngListener extends TestListenerAdapter{

	private Logger logger = Logger.getLogger(TestngListener.class);
	public void onTestFailure(ITestResult result){
		logger.warn("");
		logger.warn("FAILURE :: " + result.getName() + ", has Failed");
		logger.warn("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		logger.warn("");
	}
	
	public void onTestSkipped(ITestResult result)
	{
		logger.warn("");
		logger.warn("WARNING :: " + result.getName() + ", has skipped");
		logger.warn("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		logger.warn("");
	}

	public void onTestSuccess(ITestResult result)
	{
		logger.info("");
		logger.info("SUCCESS :: " + result.getName() + ", has passed");
		logger.info("###############################################################");
		logger.info("");
	}

	public void onTestStart(ITestResult result)
	{
		logger.info("");
		logger.info("###############################################################");
		logger.info("CURRENTLY RUNNING TEST :: " + result.getTestClass().getName() + ":" + result.getName());
		logger.info("");
	}
	
}

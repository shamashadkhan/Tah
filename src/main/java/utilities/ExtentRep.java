package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import base.Page;

public class ExtentRep extends Page
{
	ExtentReports extent;
	
	
	public void config()
	{
		String path = System.getProperty("user.dir")+"\\target\\surefire-reports\\html\\index.html";
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Your First Project");
		reporter.config().setDocumentTitle("documentTitle");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Automation Tester", "Tahseen");
		
	}

}

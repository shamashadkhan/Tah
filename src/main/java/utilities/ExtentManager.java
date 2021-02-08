package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager 
{
	public static ExtentReports extent;
	
	public static ExtentReports createInstance(String fileName)
	{
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter(fileName);
		
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setDocumentTitle(fileName);
		htmlReporter.config().setEncoding("Jkh-5");
		htmlReporter.config().setReportName(fileName);
		
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Automation Tester", "Tahseen");
		extent.setSystemInfo("AIM", "Coder");
		extent.setSystemInfo("Build No", "464500");
		
		
		return extent;
	}

}

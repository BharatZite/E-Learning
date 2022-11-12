package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {

	public static ExtentReports CreateReports() {
		ExtentReports reports=new ExtentReports();
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter("extentreports.html");
		reports.attachReporter(sparkReporter);
		reports.setSystemInfo("test", "Regression");
		return reports;
	}
	
}

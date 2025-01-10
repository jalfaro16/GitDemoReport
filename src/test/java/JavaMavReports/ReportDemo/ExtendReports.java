package JavaMavReports.ReportDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtendReports {
	ExtentReports spark;
	
	@BeforeTest
	public void config() throws Throwable
    {
		String path = System.getProperty("user.dir") + "//reports//index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Jason Report Results");
		reporter.config().setDocumentTitle("Jason Title Results");
		
		spark = new ExtentReports();
		spark.attachReporter(reporter);
		spark.setSystemInfo("Tester","Jason Alfaro");
		//Added GitDEMOReport
				System.out.println("Change5");
				System.out.println("Change6");
	}
	
	@Test
	public void initialDemo()
	{
		ExtentTest test = spark.createTest("initialDemo");
		WebDriver driver = new FirefoxDriver();			
		//driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		driver.close();
		///test.addScreenCaptureFromBase64String(null);
		test.fail("Result do not match");
		spark.flush();
		System.out.println("Change1");
		System.out.println("Change2");
		//Added fromspace X
		System.out.println("Change3");
		System.out.println("Change4");
		
		//Added GitDEMOReport
		System.out.println("Change7");
		System.out.println("Change8");
	}

}

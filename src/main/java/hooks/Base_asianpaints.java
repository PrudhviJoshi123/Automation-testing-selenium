package hooks;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Base_asianpaints
{
   public static WebDriver driver;
   public static Properties prop;
   
   public static ExtentHtmlReporter exthtml;
   public static ExtentReports report;
   public static ExtentTest testlog;
   
   @BeforeSuite
   public void reportssetup()
   {
       prop=new Properties();	   
   
	   try {prop.load(new FileInputStream("src/main/resources/configure/config.properties"));}
	   catch (Exception e) {e.printStackTrace();}
	    exthtml = new ExtentHtmlReporter(prop.getProperty("reportlocation"));
		report = new ExtentReports();
	 	report.attachReporter(exthtml);
	 	report.setSystemInfo("Host Name", "Test_System");  //name of the system
	 	report.setSystemInfo("Environment", "Test_Env");
	 	report.setSystemInfo("User Name", "Prudhvi Raj");
	 	   
	 	exthtml.config().setDocumentTitle("asianpaints");
	 	exthtml.config().setReportName("Paints & Textures Functional Testing");
	 	exthtml.config().setTestViewChartLocation(ChartLocation.TOP);
	 	exthtml.config().setTheme(Theme.STANDARD);
   }
   
   @BeforeTest
   @Parameters({"browser"})
   public void setUp(String br)
   {   	  
	   if(br.matches("firefox"))
	   {
		   driver=new FirefoxDriver();		   
	   }
	   if(br.matches("chrome"))
	   {
		   WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver();		   
	   }
	   if(br.matches("edge")) 
	   {
		  // System.setProperty("webdriver.edge.driver", "F:\\Selenium library\\msedgedriver.exe");
			driver=new EdgeDriver();		   
	   }
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
   }
  public void takescreenshot(String imagename)
   {
	   try {
	    File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f,new File(prop.getProperty("images")+imagename));
		testlog.addScreenCaptureFromPath(prop.getProperty("images")+imagename);
	   }catch(Exception e) {}
   }		
   
   @AfterSuite
   public void tearDown()
   {
	   report.flush(); //save the report	  
   }
}

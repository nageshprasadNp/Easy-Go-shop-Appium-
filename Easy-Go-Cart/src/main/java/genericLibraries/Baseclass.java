package genericLibraries;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Baseclass {
	
	public static AndroidDriver driver;
public 	 AppiumDriverLocalService server;

	@BeforeSuite
	public void configDb()
	{
		System.out.println("connect to database");
	}
	
	@BeforeClass
	public void startServer()
	{
		 server=AppiumDriverLocalService.buildDefaultService();
		server.start();
	}
	
	@BeforeMethod
	public void launchApp() throws MalformedURLException
	{
		DesiredCapabilities dcap=new DesiredCapabilities();
		dcap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dcap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		dcap.setCapability(MobileCapabilityType.UDID, "f970a6f6");
		dcap.setCapability(MobileCapabilityType.DEVICE_NAME,"OPPOA52");
		dcap.setCapability("appPackage", "");
		dcap.setCapability("appActivity", "");
		
		URL url=new URL("http://localhost:4723/wd/hub");
		 driver=new AndroidDriver(url, dcap);
	}
		
	@AfterMethod
	public void closeApp()
	{
		driver.closeApp();
	}
	@AfterClass
	public void stopServer()
	{
		server.stop();
	}

	
	@AfterSuite
	public void closeDb()
	{
		System.out.println("close the database");
	}
}

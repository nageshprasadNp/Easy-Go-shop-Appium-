package scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import pages.LoginPage;

public class Test1 {
	AndroidDriver driver;
	@Test
	public void test1() throws MalformedURLException
	{
		
		DesiredCapabilities dcap=new DesiredCapabilities();
		dcap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dcap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dcap.setCapability(MobileCapabilityType.UDID,"f970a6f6");
		dcap.setCapability(MobileCapabilityType.DEVICE_NAME, "OPPOA52");
		dcap.setCapability("appPackage", "com.bigbasket.mobileapp");
		dcap.setCapability("appActivity", ".activity.SplashActivity");
		
		URL url=new URL("http://localhost:4723/wd/hub");
		
		driver=new AndroidDriver(url, dcap);
		
		LoginPage lp=new LoginPage(driver);
		lp.clickOnExplorebtn();
		
	}

}

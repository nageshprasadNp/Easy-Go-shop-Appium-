package installingApp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstallDmartApp {
	
	@Test
	public void insatllDmartApp() throws MalformedURLException
	{
		DesiredCapabilities dcap=new  DesiredCapabilities();
		dcap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dcap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dcap.setCapability(MobileCapabilityType.UDID,"f970a6f6" );
		dcap.setCapability(MobileCapabilityType.DEVICE_NAME,"OPPAA52");
		dcap.setCapability("appPackage", "in.dmart");
		dcap.setCapability("appActivity", ".activity.SplashActivity");
		
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url, dcap);
		
		boolean res = driver.isAppInstalled("in.dmart");
		if(res==false)
		{
			driver.installApp("H:\\TestYantraWorksapce\\Easy-Go-Cart\\apkFiles\\DMart Ready-3.0.3.apk");
		}
		else
		{
			System.out.println("already is installed");
			driver.launchApp();
		}

	}

}

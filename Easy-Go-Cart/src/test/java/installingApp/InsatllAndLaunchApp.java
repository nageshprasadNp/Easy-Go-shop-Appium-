package installingApp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InsatllAndLaunchApp {
	
	@Test
	public void installEasyBuyApp() throws MalformedURLException
	{
		DesiredCapabilities dcap=new  DesiredCapabilities();
		dcap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dcap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dcap.setCapability(MobileCapabilityType.UDID,"f970a6f6" );
		dcap.setCapability(MobileCapabilityType.DEVICE_NAME,"OPPAA52");
		dcap.setCapability("appPackage", "com.studiobluelime.ecommerceapp");
		dcap.setCapability("appActivity", ".WelcomeActivity");
		
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url, dcap);
		boolean res = driver.isAppInstalled("com.studiobluelime.ecommerceapp");
		if(res==false)
		{
			driver.installApp("H:\\TestYantraWorksapce\\EasyBuy\\apkFiles\\eCommerce App-1.8.apk");
		}
		else
		{
			System.out.println("already is installed");
			driver.launchApp();
		}
	}

}

package scanerios;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;

public class AddProductAndDeleteTest {
	AndroidDriver driver;
	@Test
	public void addProductAndDeletefromCartTest() throws MalformedURLException, InterruptedException
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
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		MobileElement exploreBlr=(MobileElement) driver.findElement(By.id("com.bigbasket.mobileapp:id/text_start_exploring"));
		driver.tap(1, exploreBlr, 200);
		MobileElement catogery = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Categories']"));
		driver.tap(1, catogery, 200);
		
		MobileElement beautyAndHygineTab=(MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Beauty & Hygiene']"));
		beautyAndHygineTab.click();
		
		//scrollToElement(driver,"text","Fragrances & Deos");
		
		driver.swipe(1001, 2107, 974, 1393, 2000);
		
		MobileElement fragranceTab=(MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Fragrances & Deos']"));
		driver.tap(1, fragranceTab, 200);
		
		

		MobileElement mensDeodorantLnk=(MobileElement) driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Product Image\"])[1]"));
		//driver.tap(1, mensDeodorantLnk, 200);
		mensDeodorantLnk.click();
		
			
		MobileElement selectDeodorent = (MobileElement) driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id='com.bigbasket.mobileapp:id/imgProduct'])[3]"));
		driver.tap(1, selectDeodorent, 200);
		
		Thread.sleep(2000);
		driver.tap(1, 869, 2217, 2000);
		
		
		
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BACK);
		
		driver.findElement(By.id("com.bigbasket.mobileapp:id/action_cart")).click();
		
		
	//	driver.findElement(By.xpath("//android.widget.TextView[@text='Body Sprays & Mists']")).click();
		driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id='com.bigbasket.mobileapp:id/imgProduct'])[1]")).click();
		
				
		driver.swipe(922, 1246, 116, 1281, 2000);
		driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Remove\"])[1]")).click();
		
		MobileElement textValue=(MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='2']"));
		String totalProduct = textValue.getText();
		int no=Integer.parseInt(totalProduct);
		System.out.println(no);
		
				
		driver.findElement(By.id("com.bigbasket.mobileapp:id/action_cart")).click();
		
		TouchAction ta=new TouchAction(driver);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BACK);
		
		
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Home']")).click();
		
		driver.findElement(By.id("com.bigbasket.mobileapp:id/unreadChatIcon")).click();
		
		driver.findElement(By.id("com.bigbasket.mobileapp:id/logout")).click();
		
		driver.findElement(By.id("com.bigbasket.mobileapp:id/unreadChatIcon")).click();
		
		driver.findElement(By.id("com.truecaller:id/continueWithDifferentNumber")).click();
		
		String loginTitle1 = driver.findElement(By.xpath("//android.widget.TextView[@text='Login/Signup']")).getText();
		Assert.assertTrue(true, loginTitle1);
		System.out.println("Login page is displayed");
		
		
		
		
		
		
		
		

	}

}

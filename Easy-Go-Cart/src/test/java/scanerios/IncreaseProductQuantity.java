package scanerios;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;

public class IncreaseProductQuantity {
	AndroidDriver driver;
	@Test
	public void increaseProductQuantityTest() throws InterruptedException, MalformedURLException
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
		
		
		MobileElement loginBtn=(MobileElement) driver.findElement(By.id("com.bigbasket.mobileapp:id/text_login"));
		driver.tap(1, loginBtn, 200);
		
		MobileElement continue1=(MobileElement) driver.findElement(By.id("com.truecaller:id/confirm"));
		driver.tap(1, continue1, 200);
		
	//	String loginTitle = driver.getTitle();
		
		
		
//		MobileElement exploreBlr=(MobileElement) driver.findElement(By.id("com.bigbasket.mobileapp:id/text_start_exploring"));
//		driver.tap(1, exploreBlr, 200);
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
		
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Add']")).click();
		
		driver.findElement(By.id("com.bigbasket.mobileapp:id/action_cart")).click();
		
		Thread.sleep(5000);
		String productTextt = driver.findElement(By.xpath("//android.widget.TextView[@text='Axe - Dark Temptation Body Spray Deodorant - Smooth Chocolate Fragrance, For Men']")).getText();
		
		System.out.println(productTextt);
		
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BACK);
		
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BACK);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Body Sprays & Mists']"));
		
		driver.findElementByAccessibilityId("Add").click();
		
		
		
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Add']")).click();
		
		
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Gold Temptation Body Spray Deodorant - Exotic Spiced Fragrance, Long Lasting']")).click();
		
		
		//driver.findElementByAccessibilityId("Add").click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Basket']")).click();
		
		
		//scrollToElement(driver, "text", "Axe - Gold Temptation Body Spray Deodorant - Exotic Spiced Fragrance, Long Lasting");
		
		MobileElement count=(MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.bigbasket.mobileapp:id/txtInBasket']"));
		String quantity = count.getText();
		int qutn=Integer.parseInt(quantity);
		
		if(qutn>=2)
		{
			System.out.println("product quantity increased");
			
		}
		else
		{
			System.out.println("quantity not increased");
		}
		
		
		
		driver.findElement(By.id("com.bigbasket.mobileapp:id/txtInBasket"));
		
					
		
		TouchAction ta=new TouchAction(driver);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BACK);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Home']")).click();
		
		driver.findElement(By.id("com.bigbasket.mobileapp:id/unreadChatIcon")).click();
		
		driver.findElement(By.id("com.bigbasket.mobileapp:id/logout")).click();
		
		driver.findElement(By.id("com.bigbasket.mobileapp:id/unreadChatIcon")).click();
		
		driver.findElement(By.xpath(""));
		//String HomeTitle = driver.getTitle();
		//Assert.assertEquals(loginTitle, HomeTitle);
		
		driver.closeApp();
		
		
	}
	
	
	public static void scrollToElement(AndroidDriver driver,String an,String av)
	{
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
	}
	

}

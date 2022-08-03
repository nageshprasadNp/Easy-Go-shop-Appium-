package genericLibraries;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AndroidDriverUtility {
	
	AndroidDriver driver;
	TouchAction touch;
	public static String  takeScreenShot(AndroidDriver driver,String screenshotName) throws IOException
	{
		TakesScreenshot ts=driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/"+screenshotName+".png");
		FileUtils.copyFile(src, dest);
		return screenshotName;
	}
	
	
	public void horizontalSwip(AndroidElement startele,AndroidElement endele)
	{
		int startx=startele.getLocation().getX()+(startele.getSize().getWidth()/2);
		int starty=startele.getLocation().getX()+(startele.getSize().getHeight()/2);
		
		int endx=startele.getLocation().getX()+(endele.getSize().getWidth()/2);
		int endy=startele.getLocation().getX()+(endele.getSize().getHeight()/2);
		
				
	}

}

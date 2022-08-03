package pages;

import java.lang.reflect.Field;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.FieldDecorator;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {
	
	
	@FindBy(id="com.bigbasket.mobileapp:id/text_start_exploring")
	private MobileElement explorebtn;

	public MobileElement getExplorebtn() {
		return explorebtn;
	}
	
	
	public void clickOnExplorebtn()
	{
		explorebtn.click();
	}
	
	
	public LoginPage(AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}

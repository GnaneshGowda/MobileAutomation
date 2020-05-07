package com.mobileapp.GeneralStore.pageObjectClasses;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Preferences {
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='3. Preference dependencies']")
	public WebElement dependencies;
	
	@AndroidFindBy(className="android.widget.Button")
	public List<WebElement> buttons;
	
	public Preferences(AppiumDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	
	
	
}

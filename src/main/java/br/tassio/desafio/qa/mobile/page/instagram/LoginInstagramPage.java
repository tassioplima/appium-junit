package br.tassio.desafio.qa.mobile.page.instagram;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginInstagramPage {
	
	@AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text,'Continue as')]")
	private MobileElement continueAs ;
	
	@AndroidFindBy(id = "com.instagram.android:id/action_bar_inbox_icon")
	private MobileElement inboxIcon;
	
	@AndroidFindBy(xpath = "")
	private WebElement xpath01;
	
	@AndroidFindBy(xpath = "")
	private WebElement xpath02;
	
	@AndroidFindBy(xpath = "")
	private WebElement xpath03;
	
	
	public LoginInstagramPage(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public MobileElement getContinueAs() {
		return continueAs;
	}

	public MobileElement getInboxIcon() {
		return inboxIcon;
	}

	public WebElement getXpath01() {
		return xpath01;
	}

	public WebElement getXpath02() {
		return xpath02;
	}

	public WebElement getXpath03() {
		return xpath03;
	}
	
	

}

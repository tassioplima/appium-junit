package br.tassio.desafio.qa.mobile.page.instagram;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DirectPage {

	

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Not Now']")
	private MobileElement disappearingView;
	
	@AndroidFindBy(id = "com.instagram.android:id/search_row")
	private MobileElement searchContact;
	
	@AndroidFindBy(id = "com.instagram.android:id/search_bar_real_field")
	private MobileElement selectSearchContact;
	
	@AndroidFindBy(xpath = "//android.widget.ListView[1]/following::android.widget.LinearLayout[4]")
	private MobileElement confirmContact;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[starts-with(@text,'Write a message')]")
	private MobileElement writeMessage;
	
	@AndroidFindBy (id = "com.instagram.android:id/row_thread_composer_edittext")
	private MobileElement editText;
	
	@AndroidFindBy(id = "com.instagram.android:id/row_thread_composer_button_send")
	private MobileElement confirmMessage;
	
	@AndroidFindBy(id = "com.instagram.android:id/thread_title")
	private MobileElement titleContact;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[starts-with(@text,'Today')]/following::android.widget.TextView[1]")
	private MobileElement recentMessage;

	public DirectPage(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public MobileElement getDisappearingView() {
		return disappearingView;
	}

	public MobileElement getSearchContact() {
		return searchContact;
	}

	public MobileElement getConfirmContact() {
		return confirmContact;
	}

	public MobileElement getEditText() {
		return editText;
	}

	public MobileElement getConfirmMessage() {
		return confirmMessage;
	}

	public MobileElement getTitleContact() {
		return titleContact;
	}

	public MobileElement getRecentMessage() {
		return recentMessage;
	}

	public MobileElement getSelectSearchContact() {
		return selectSearchContact;
	}

	public MobileElement getWriteMessage() {
		return writeMessage;
	}
	
	

}

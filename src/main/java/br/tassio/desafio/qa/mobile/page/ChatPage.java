package br.tassio.desafio.qa.mobile.page;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ChatPage {
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='SKIP RESTORE']")
	private MobileElement selectContact;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='New chat']")
	private MobileElement newChat;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Search']")
	private MobileElement searchContact;
	
	@AndroidFindBy(id = "com.whatsapp:id/search_src_text")
	private MobileElement searchText;
	
	@AndroidFindBy(id = "com.whatsapp:id/contactpicker_row_name")
	private MobileElement contactPicker;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Type a message']")
	private MobileElement typeMessage;
	
	@AndroidFindBy(id = "com.whatsapp:id/send")
	private MobileElement sendMessage;
	
	@AndroidFindBy(id = "com.whatsapp:id/message_text")
	private MobileElement validateMessage;
	
	public ChatPage(AndroidDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public MobileElement getSelectContact() {
		return selectContact;
	}

	public MobileElement getNewChat() {
		return newChat;
	}

	public MobileElement getSearchContact() {
		return searchContact;
	}

	public MobileElement getSearchText() {
		return searchText;
	}

	public MobileElement getContactPicker() {
		return contactPicker;
	}

	public MobileElement getTypeMessage() {
		return typeMessage;
	}

	public MobileElement getSendMessage() {
		return sendMessage;
	}

	public MobileElement getValidateMessage() {
		return validateMessage;
	}
	
	

}

package br.tassio.desafio.qa.mobile.page.whatsapp;

import org.openqa.selenium.support.PageFactory;

import br.tassio.desafio.qa.configuration.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RealizarLoginPage extends BaseTest {

	@AndroidFindBy(xpath = "//android.widget.Button[@text='AGREE AND CONTINUE']")
	private MobileElement getAgree;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='CONTINUE']")
	private MobileElement continueConnect;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='phone number']")
	private MobileElement phoneNumber;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='NEXT']")
	private MobileElement next;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='NEXT']")
	private MobileElement buttonNext;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
	private MobileElement verifyOK;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='*** ***']")
	private MobileElement twoSteps;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='RESTORE']")
	private MobileElement backupRESTORE;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='SKIP']")
	private MobileElement backupSKIP;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='SKIP RESTORE']")
	private MobileElement confirmSKIP;

	@AndroidFindBy(id = "com.whatsapp:id/registration_name")
	private MobileElement profileName;

	public RealizarLoginPage(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public MobileElement getAgree() {
		return getAgree;
	}

	public MobileElement getGetAgree() {
		return getAgree;
	}

	public MobileElement getContinueConnect() {
		return continueConnect;
	}

	public MobileElement getPhoneNumber() {
		return phoneNumber;
	}

	public MobileElement getNext() {
		return next;
	}

	public MobileElement getVerifyOK() {
		return verifyOK;
	}

	public MobileElement getTwoSteps() {
		return twoSteps;
	}

	public MobileElement getBackupRESTORE() {
		return backupRESTORE;
	}

	public MobileElement getBackupSKIP() {
		return backupSKIP;
	}

	public MobileElement getConfirmSKIP() {
		return confirmSKIP;
	}

	public MobileElement getProfileName() {
		return profileName;
	}

	public MobileElement getButtonNext() {
		return buttonNext;
	}

}

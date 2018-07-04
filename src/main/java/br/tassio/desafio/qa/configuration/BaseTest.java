package br.tassio.desafio.qa.configuration;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.tassio.desafio.qa.interfaces.AccountCredentials;
import br.tassio.desafio.qa.interfaces.MobileApplication;
import br.tassio.desafio.qa.interfaces.WebApplication;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseTest {

	protected static AppiumDriver<MobileElement> driver;
	protected static AccountCredentials credentials;
	protected static WebDriver webDriver;
	protected static WebDriverWait wait;


	public void initializeMobileApplication(MobileApplication mobileApplication) {
		driver = mobileApplication.getDriver();
		wait = new WebDriverWait(driver, 80);
	}

	protected void initializeWebApplication(WebApplication webApplication) {
		webDriver = webApplication.getDriver();
		webDriver.manage().window().maximize();
		wait = new WebDriverWait(webDriver, 80);
	}

	protected void setUserApplication(AccountCredentials credentialsUsers) {

		BaseTest.credentials = credentialsUsers;
	}

	
	
	protected void closeMobile() {
		driver.quit();
		closeAppium();
	}

	protected void closeWeb() {
		webDriver.close();
	}

	protected void startAppium() {
		AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();
		service.start();
	}

	protected void closeAppium() {
		try {

			Runtime.getRuntime().exec(new String[] { "cmd.exe", "/c", "killall node" });
			Thread.sleep(3000);
		} catch (IOException e) {
			System.out.println("Erro ao encerrar o node");
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected MobileElement getElement(String element) {
			
		return driver.findElement(By.xpath(element));
	}
	
	protected List<MobileElement> getElements(String elements) {
		
		return driver.findElements(By.xpath(elements));
	}
	
	
}

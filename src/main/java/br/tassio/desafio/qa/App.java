package br.tassio.desafio.qa;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import br.tassio.desafio.qa.interfaces.MobileApplication;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobilePlatform;

public enum App implements MobileApplication {

	WHATSAPP {
		@Override
		public AppiumDriver<MobileElement> getDriver() {
			return getDriver("com.whatsapp", "com.whatsapp.HomeActivity");
		}

	},
	INSTAGRAM{

		@Override
		public AppiumDriver<MobileElement> getDriver() {
			return getDriver("com.instagram.android", "com.instagram.mainactivity.MainActivity");
		}
		
	};

	private AppiumDriver<MobileElement> driver;

	public AppiumDriver<MobileElement> getDriver(String appPackage, String appActivity) {

		try {
			driver = new AppiumDriver<MobileElement>(getCapabilities(appPackage,appActivity));
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return driver;
	}

	private DesiredCapabilities getCapabilities(String appPackage, String appActivity) throws IOException {

		Scanner scanner = null;
		scanner = new Scanner(
				Runtime.getRuntime().exec(new String[] { "cmd.exe", "/c", "adb get-serialno" }).getInputStream());
		String deviceSerialNumver = (scanner != null && scanner.hasNext()) ? scanner.next() : "";
		scanner.close();

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Cellphone");
		capabilities.setCapability("platformName", MobilePlatform.ANDROID);
		capabilities.setCapability("device", "Android");
		capabilities.setCapability("udid", deviceSerialNumver);
		capabilities.setCapability("appPackage", appPackage);
		capabilities.setCapability("appActivity", appActivity);
		capabilities.setCapability("autoGrantPermissions", "true");

		return capabilities;

	}

}

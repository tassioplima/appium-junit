package br.tassio.desafio.qa;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import br.tassio.desafio.qa.interfaces.MobileApplication;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobilePlatform;

public enum App implements MobileApplication {

	WHATSAPP {
		@Override
		public AndroidDriver<MobileElement> getDriver() {
			return getDriver("com.whatsapp");
		}

	};

	private AndroidDriver<MobileElement> driver;

	public AndroidDriver<MobileElement> getDriver(String appPackage) {

		try {
			driver = new AndroidDriver<MobileElement>(getCapabilities(appPackage));
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return driver;
	}

	private DesiredCapabilities getCapabilities(String appPackage) throws IOException {

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
		capabilities.setCapability("appActivity", "HomeActivity");
		capabilities.setCapability("autoGrantPermissions", "true");

		return capabilities;

	}

}

package br.tassio.desafio.qa.interfaces;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public interface MobileApplication {
	
	public AndroidDriver<MobileElement> getDriver();
	

}

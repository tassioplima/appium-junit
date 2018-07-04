package br.tassio.desafio.qa.interfaces;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public interface MobileApplication {
	
	public  AppiumDriver<MobileElement> getDriver();
	

}

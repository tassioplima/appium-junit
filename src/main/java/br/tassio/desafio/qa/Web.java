package br.tassio.desafio.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.tassio.desafio.qa.interfaces.WebApplication;

public enum Web implements WebApplication{
	
	CHROME{
		
		public WebDriver getDriver() {
			System.setProperty("webdriver.chrome.driver","chromedriver");
			return new ChromeDriver();
		}
		
	};
	
	

}

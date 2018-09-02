package br.tassio.desafio.qa.mobile.funcionality.instagram;

import br.tassio.desafio.qa.configuration.BaseTest;
import br.tassio.desafio.qa.mobile.page.instagram.LoginInstagramPage;

public class HomeInstagramFuncionalidade extends BaseTest{
	
	private LoginInstagramPage home;
	
	public HomeInstagramFuncionalidade() {
		this.home = new LoginInstagramPage(driver);
	}
	
	public void selecionarContaInstagram() {
		
		this.home.getContinueAs().click();
		
	}
	
	public void selecionaInboxMensagem() {
		
		this.home.getInboxIcon().click();

		
	}

}

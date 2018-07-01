package br.tassio.desafio.qa.mobile.funcionality;

import br.tassio.desafio.qa.configuration.BaseTest;
import br.tassio.desafio.qa.mobile.page.RealizarLoginPage;

public class RealizarLoginFuncionalidade extends BaseTest{
	
	private RealizarLoginPage cadastro;
	
	public RealizarLoginFuncionalidade() {
		
		this.cadastro = new RealizarLoginPage(driver);
	}
	
	
	public void realizarCadastroWhatsApp(String number, String password) {
		
		this.cadastro.getAgree().click();
		this.cadastro.getPhoneNumber().sendKeys(number);
		this.cadastro.getButtonNext().click();
		this.cadastro.getVerifyOK().click();
		this.cadastro.getTwoSteps().sendKeys(password);
		this.cadastro.getBackupSKIP().click();
		this.cadastro.getConfirmSKIP().click();
		
	}
	
	public void confirmarUsuarioCadastro(String contact) {
		
		this.cadastro.getProfileName().clear();
		this.cadastro.getProfileName().sendKeys(contact);
		this.cadastro.getNext().click();
		
	}
	
	

}

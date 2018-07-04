package br.tassio.desafio.qa.mobile.funcionality.instagram;

import br.tassio.desafio.qa.configuration.BaseTest;
import br.tassio.desafio.qa.mobile.page.instagram.DirectPage;

public class DirectFuncionalidade extends BaseTest {

	private DirectPage direct;

	public DirectFuncionalidade() {
		this.direct = new DirectPage(driver);
	}

	public void buscaContato(String contato) {

		this.direct.getDisappearingView().click();
		this.direct.getSearchContact().click();
		this.direct.getSelectSearchContact().sendKeys(contato);
	}

	public void confirmaContato() {
		this.direct.getConfirmContact().click();
	}

	public void enviaMensagem(String mensagem) {
		
		//this.direct.getEditText().click();
		//this.direct.getEditText().sendKeys(mensagem);
		this.direct.getWriteMessage().sendKeys(mensagem);
		this.direct.getConfirmMessage().click();
	}

	public String validaContato(String contato) {
		return this.direct.getTitleContact().getText();
	}

	public String validaMensagemRecenteEnviada(String mensagem) {

		return this.direct.getRecentMessage().getText();
	}

}

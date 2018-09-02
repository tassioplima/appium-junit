package br.tassio.desafio.qa.mobile.steps;

import br.tassio.desafio.qa.mobile.funcionality.instagram.HomeInstagramFuncionalidade;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;

public class HomeInstagramStep {
	
	private HomeInstagramFuncionalidade funcionalidade = new HomeInstagramFuncionalidade();
	
	@Dado("^que eu confirme autorizacao do facebook e aceite os termos$")
	public void queEuConfirmeAutorizacaoDoFacebookEAceiteOsTermos() {
		this.funcionalidade.selecionarContaInstagram();
	}
	
	@Quando("^acessar o inbox de mensagem$")
	public void acessarOInboxDeMensagem()  {
		this.funcionalidade.selecionaInboxMensagem();
	}

	

}

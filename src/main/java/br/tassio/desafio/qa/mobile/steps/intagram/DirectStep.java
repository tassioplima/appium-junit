package br.tassio.desafio.qa.mobile.steps.intagram;

import static org.junit.jupiter.api.Assertions.assertEquals;

import br.tassio.desafio.qa.mobile.funcionality.instagram.DirectFuncionalidade;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class DirectStep {

	private DirectFuncionalidade direct = new DirectFuncionalidade();

	@Quando("^selecionar o contato \"([^\"]*)\" enviar a mensagem \"([^\"]*)\" para o contato$")
	public void eSelecionarOEnviarAParaOContato(String contato, String mensagem) throws Throwable {

		this.direct.buscaContato(contato);
		this.direct.confirmaContato();
		this.direct.enviaMensagem(mensagem);

	}

	// ------------------------------ ASSERTS ------------------------------//

	@Entao("^validar se a \"([^\"]*)\" foi enviada ao \"([^\"]*)\"$")
	public void validarSeAFoiEnviadaAo(String mensagem, String contato) throws Throwable {

		String validaMensagemRecenteEnviada = this.direct.validaMensagemRecenteEnviada(mensagem);
		String validaContato = this.direct.validaContato(contato);

		assertEquals(mensagem, validaMensagemRecenteEnviada);
		assertEquals(contato, validaContato);

	}

}

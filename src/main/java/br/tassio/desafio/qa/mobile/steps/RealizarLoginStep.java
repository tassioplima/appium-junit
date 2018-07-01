package br.tassio.desafio.qa.mobile.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import br.tassio.desafio.qa.mobile.funcionality.ChatFuncionalidade;
import br.tassio.desafio.qa.mobile.funcionality.RealizarLoginFuncionalidade;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class RealizarLoginStep {

	private RealizarLoginFuncionalidade login = new RealizarLoginFuncionalidade();
	private ChatFuncionalidade chat = new ChatFuncionalidade();

	@Dado("^que realize o login com \"([^\"]*)\" e senha de duas etapas \"([^\"]*)\"$")
	public void queRealizeOLoginComESenhaDeDuasSteps(String number, String password) throws Throwable {

		this.login.realizarCadastroWhatsApp(number, password);

	}

	@Dado("^nome do usuario confirmado \"([^\"]*)\"$")
	public void nomeDoUsuarioConfirmado(String contact) throws Throwable {

		this.login.confirmarUsuarioCadastro(contact);

	}

	@Quando("^selecionar o \"([^\"]*)\"$")
	public void selecionarO(String contact) throws Throwable {

		this.chat.selecionarContato(contact);

	}

	@Quando("^enviar a \"([^\"]*)\"$")
	public void enviarA(String message) throws Throwable {

		this.chat.enviarMensagemContato(message);

	}

	// ------------------------------------ASSERT---------------------------------//

	@Entao("^verificar se a mensagem foi enviada \"([^\"]*)\"$")
	public void verificarSeAMensagemFoiEnviada(String mensagem) throws Throwable {

		String validarMensagemEnviada = this.chat.validarMensagemEnviada();

		assertEquals(mensagem, validarMensagemEnviada);

	}

}

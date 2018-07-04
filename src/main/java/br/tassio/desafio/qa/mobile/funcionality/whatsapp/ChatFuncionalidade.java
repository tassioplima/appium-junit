package br.tassio.desafio.qa.mobile.funcionality.whatsapp;

import br.tassio.desafio.qa.configuration.BaseTest;
import br.tassio.desafio.qa.mobile.page.whatsapp.ChatPage;

public class ChatFuncionalidade extends BaseTest {
	
	private ChatPage chat;
	
	public ChatFuncionalidade() {
		
		this.chat = new ChatPage(driver);
	}
	
	public void selecionarContato(String contact) {
		
		this.chat.getNewChat().click();
		this.chat.getSearchContact().click();
		this.chat.getSearchText().sendKeys(contact);
		this.chat.getContactPicker().click();
		
	}
	
	public void enviarMensagemContato(String message) {
		
		this.chat.getTypeMessage().sendKeys(message);
		this.chat.getSendMessage().click();
		
	}
	
	public String validarMensagemEnviada() {
		
		return this.chat.getValidateMessage().getText();
	}

}

package br.tassio.desafio.qa.commons;

import br.tassio.desafio.qa.interfaces.AccountCredentials;

public enum Credentials implements AccountCredentials{
	
	TELEFONE{

		public String user(String user) {
			
			return user;
		}
		
	}

}

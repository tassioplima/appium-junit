#language: pt
#Author: Tassio Lima
#Version: 1.0
#Encoding: UTF-8

Funcionalidade: 1.0 Realizar um envio de mensagem

 @whatsapp @CTWHATS001  
 Esquema do Cenario: Realizar login e enviar uma mensagem
    Dado que realize o login com <telefone> e senha de duas etapas <senha>
    E nome do usuario confirmado <nome> 
   	Quando selecionar o <contato>
   	E enviar a <mensagem> 
   	Entao verificar se a mensagem foi enviada <mensagem>
   	
   	Exemplos:
   	|telefone				| senha 		| nome 				 	 | contato 	 | 			mensagem 				|
   	|"11900000000"  | "123456"  | "Seu Nome"  	 | "Contato" | "Teste de automação" |
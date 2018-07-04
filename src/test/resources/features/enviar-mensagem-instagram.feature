#language: pt
#Author: Tassio Lima
#Version: 1.0
#Encoding: UTF-8
Funcionalidade: 1.0 Realizar um envio de mensagem

  @instagram @CTINSTA001
  Esquema do Cenario: Realizar login e enviar uma mensagem
    Dado que eu confirme autorizacao do facebook e aceite os termos
    Quando acessar o inbox de mensagem
    E selecionar o contato <contato> enviar a mensagem <mensagem> para o contato
    Entao validar se a <mensagem> foi enviada ao <contato>

    Exemplos: 
      | contato   | mensagem       |
      | "contato" | "teste mensagem" |

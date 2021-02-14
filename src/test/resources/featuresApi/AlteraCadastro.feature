#Author: Vinicius Souza
#language: pt
#encoding: UTF-8

Funcionalidade: Alterar dados de um empregado previamente cadastrado no site do desafio inMetrics

  @alterarCadastroSucesso
  Cenario: Alterar dados de um empregado com sucesso
    Dado que quero alterar os dados de um empregado com sucesso
    Quando envio o request com id do empregado
    Entao altero os dados de um empregado com sucesso

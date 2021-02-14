#Author: Vinicius Souza
#language: pt
#encoding: UTF-8

Funcionalidade: Cadastrar empregado no site do desafio inMetrics

  @cadastrarApiSucesso
  Cenario: Cadastrar empregado com sucesso
    Dado que quero cadastrar um empregado com sucesso
    Quando envio o request com parametros corretos
    Entao cadastro um empregado com sucesso

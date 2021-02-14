#Author: Vinicius Souza
#language: pt
#encoding: UTF-8

Funcionalidade: Cadastrar funcionario no site do desafio inMetrics

  @cadastroSucesso
  Cenario: Cadastrar um funcionário no site da inmetrics com sucesso
    Dado que quero cadastrar um funcionario com sucesso
    E insiro as informacoes validas
    Quando clico no botao Submit Query
    Entao visualizo a mensagem "SUCESSO! Usuário cadastrado com sucesso"
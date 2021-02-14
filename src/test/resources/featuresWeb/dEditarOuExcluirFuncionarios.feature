#Author: Vinicius Souza
#language: pt
#encoding: UTF-8

Funcionalidade: Editar ou excluir informações de funcionários previamente cadastrados no site do desafio inMetrics

  @excluirSucesso
  Cenario: Excluir um funcionário do site da inmetrics com sucesso
    Dado que quero excluir um funcionario com sucesso
    Quando clico no botao de lixeira
    Entao vejo a mensagem "SUCESSO! Funcionário removido com sucesso"

  @editarSucesso
  Cenario: Editar os dados de um funcionário do site da inmetrics com sucesso
    Dado que quero editar um funcionario com sucesso
    E clico no botao de lapis
    Quando edito as informacoes e clico no botao Submit Query
    Entao recebo a mensagem "SUCESSO! Informações atualizadas com sucesso"
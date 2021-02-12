#Author: Vinicius Souza
#language: pt
#encoding: UTF-8

Funcionalidade: Obter dados de cadastro válidos do site 4Devs

  @obterSucesso
  Cenario: Obter dados de cadastro com sucesso
    Dado que quero obter dados de cadastro validos atraves do site 4devs
    Quando clico no botao Gerar Pessoa
    Entao obtenho os dados validos
